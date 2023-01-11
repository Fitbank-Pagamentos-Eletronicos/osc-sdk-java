package br.com.fitbank.exemples;


import br.com.fitbank.OSC;
import br.com.fitbank.domains.Pipeline;
import br.com.fitbank.domains.SignupMatch;
import br.com.fitbank.utils.JSON;

import java.io.IOException;

public class SignupWithCallbackExemple {
    public static void main(String[] args){
        String client_id = "";
        String client_secret = "";
        OSC osc = OSC.createIntance(client_id, client_secret);

        try {
            osc.setResponseListening(SignupWithCallbackExemple::processPipelineResult);
            Pipeline pipeline = signup();
            processPipelineResult(pipeline);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void processPipelineResult(Pipeline pipeline){
        if(pipeline == null) {
            System.out.println("Pipeline: error");
            return;
        }
        System.out.println("Pipeline: " + pipeline.getId());
    }

    public static Pipeline signup() throws IOException {
        String client_data = "";
        SignupMatch signupMatch = JSON.getGson().fromJson(client_data, SignupMatch.class);
        return OSC.getIntance().signup(signupMatch);
    }
}