package br.com.fitbank.exemples;


import br.com.fitbank.OSC;
import br.com.fitbank.domains.response.PipelineResponse;
import br.com.fitbank.domains.requests.SignupRequest;
import br.com.fitbank.requests.Signup;
import br.com.fitbank.utils.JSON;

import java.io.IOException;

public class SignupExemple {
    public static void main(String[] args){
        String client_id = "";
        String client_secret = "";
        String client_data = "";


        PipelineResponse pipelineResponse = signup(client_id, client_secret, client_data);

        if(pipelineResponse != null) {
            System.out.println("Pipeline: " + pipelineResponse);
        } else {
            System.out.println("Pipeline: error");
        }
    }

    public static PipelineResponse signup(String client_id, String client_secret, String client_data) {
        try {

            OSC osc = OSC.createIntance(client_id, client_secret);
            SignupRequest signupRequest = JSON.getGson().fromJson(client_data, SignupRequest.class);
            return Signup.request(osc, signupRequest);

        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}