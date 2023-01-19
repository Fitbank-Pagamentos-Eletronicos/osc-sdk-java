package br.com.fitbank.exemples;


import br.com.fitbank.OSC;
import br.com.fitbank.domains.response.PipelineResponse;
import br.com.fitbank.domains.requests.SignupRequest;
import br.com.fitbank.utils.JSON;

import java.io.IOException;

public class SignupWithCallbackExemple {
    public static void main(String[] args){
        String client_id = "";
        String client_secret = "";
        OSC osc = OSC.createIntance(client_id, client_secret);

        try {
            osc.setResponseListening(SignupWithCallbackExemple::processPipelineResult);
            PipelineResponse pipelineResponse = signup();
            processPipelineResult(pipelineResponse);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void processPipelineResult(PipelineResponse pipelineResponse){
        if(pipelineResponse == null) {
            System.out.println("Pipeline: error");
            return;
        }
        System.out.println("Pipeline: " + pipelineResponse.getId());
    }

    public static PipelineResponse signup() throws IOException {
        String client_data = "";
        SignupRequest signupRequest = JSON.getGson().fromJson(client_data, SignupRequest.class);
        return OSC.getIntance().signup(signupRequest);
    }
}