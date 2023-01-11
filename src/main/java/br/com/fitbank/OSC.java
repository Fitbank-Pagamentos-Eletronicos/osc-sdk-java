package br.com.fitbank;

import java.io.IOException;
import java.io.NotActiveException;
import java.text.Normalizer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Objects;

import br.com.fitbank.domains.*;
import br.com.fitbank.requests.OAuth;
import br.com.fitbank.requests.PubSubRequest;
import br.com.fitbank.requests.PubSubSubscription;
import br.com.fitbank.requests.Signup;
import br.com.fitbank.utils.JSON;
import com.google.cloud.pubsub.v1.AckReplyConsumer;
import com.google.cloud.pubsub.v1.MessageReceiver;
import com.google.cloud.pubsub.v1.Subscriber;
import com.google.pubsub.v1.PubsubMessage;


public class OSC {
    private static final ArrayList<OSC> instances = new ArrayList<>();
    private static final String default_instance_name = "default";  /* static private, define nome padrão */

    private final String name;
    private final String client_id;
    private final String client_secret;

    private AuthSucess authToken;

    public OSC(String name, String client_id, String client_secret){
        this.name = name;
        this.client_id = client_id;
        this.client_secret = client_secret;
    }

    public String normalize(String name){
        name = name.toLowerCase();
        name = Normalizer.normalize(name, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        name = Normalizer.normalize(name, Normalizer.Form.NFD).replaceAll("[^A-z0-9]", "-");
        return name;
    }

    public static OSC createIntance(String name, String client_id, String client_secret) throws RuntimeException {
        OSC osc = OSC.getIntance(name);

        if (osc != null){
          throw new RuntimeException("Instance named: " + name + " aready exists.");
        }

        osc = new OSC(name, client_id, client_secret);

        OSC.instances.add(osc);
        return osc;
    }

    public static OSC createIntance(String client_id, String client_secret) throws RuntimeException {
        return OSC.createIntance(default_instance_name, client_id, client_secret);
    }

    public static OSC getIntance(String name){
        for (OSC instance : instances) {
            if (Objects.equals(instance.name, name)) {
                return instance;
            }
        }
        return null;
    }

    public static OSC getIntance(){
        return OSC.getIntance(default_instance_name);
    }


    public String getToken() throws IOException {
        if (this.authToken == null || this.authToken.getExpireAt().compareTo(Instant.now()) <= 0 ) {
            this.authToken = this.auth();
        }

        return this.authToken.getAccessToken();
    }

    public AuthSucess auth() throws IOException {
        return OAuth.request(this.client_id, this.client_secret);
    }



    public interface Callback {
        void call(Pipeline pipeline) throws IOException;
    }

    public void setResponseListening(Callback callback) throws IOException, InterruptedException {

        PubSubRequestReturn config = PubSubRequest.request(this);
        MessageReceiver receiver = (PubsubMessage message, AckReplyConsumer consumer) -> {
            try {
                Pipeline pipeline = JSON.getGson().fromJson(message.getData().toString(), Pipeline.class);
                callback.call(pipeline);
                consumer.ack();
            } catch (IOException e) {
                consumer.nack();
            }
        };
        Subscriber subscriber = PubSubSubscription.subscriber(config, receiver);
        if (!subscriber.isRunning()){
            throw new NotActiveException("Não foi possivel iniciar um canal para callbacks");
        }
    }

    public Pipeline signup(SignupMatch data) throws IOException {
        return Signup.request(this, data);
    }

    public Pipeline signup(br.com.fitbank.domains.SimpleSignup data) throws IOException {
        return br.com.fitbank.requests.SimpleSignup.request(this, data);
    }

    public Pipeline proposal(Proposal data, String id) throws IOException {
        return br.com.fitbank.requests.Proposal.request(this, data, id);
    }

    public Pipeline proposal(br.com.fitbank.domains.ProposalBankAccount data, String id) throws IOException {
        return br.com.fitbank.requests.SimpleProposal.request(this, data, id);
    }

}
  

