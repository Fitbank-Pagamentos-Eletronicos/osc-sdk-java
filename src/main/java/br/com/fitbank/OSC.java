package br.com.fitbank;

import java.io.IOException;
import java.text.Normalizer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import br.com.fitbank.domains.*;
import br.com.fitbank.requests.OAuth;



public class OSC {
    private static ArrayList<OSC> instances = new ArrayList<>();
    private static final String default_instance_name = "default";  /* static private, define nome padrão */
    private static final String[] default_scopes = {"api-external"};  /* static private, define nome padrão */

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
        if (this.authToken == null || this.authToken.getExpire_at().compareTo(Instant.now()) <= 0 ) {
            this.authToken = this.auth();
        }

        return this.authToken.getAccess_token();
    }

    public AuthSucess auth() throws IOException {
        return OAuth.request(this.client_id, this.client_secret);
    }

}
  

