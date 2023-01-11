package br.com.fitbank.exemples;


import br.com.fitbank.OSC;
import br.com.fitbank.domains.Pipeline;
import br.com.fitbank.domains.SignupMatch;
import br.com.fitbank.requests.Signup;
import br.com.fitbank.utils.JSON;

import java.io.IOException;

public class SignupExemple {
    public static void main(String[] args){
        String client_id = "";
        String client_secret = "";
        String client_data = "";


        Pipeline pipeline = signup(client_id, client_secret, client_data);

        if(pipeline != null) {
            System.out.println("Pipeline: " + pipeline);
        } else {
            System.out.println("Pipeline: error");
        }
    }

    public static Pipeline signup(String client_id, String client_secret, String client_data) {
        try {

            OSC osc = OSC.createIntance(client_id, client_secret);
            SignupMatch signupMatch = JSON.getGson().fromJson(client_data, SignupMatch.class);
            return Signup.request(osc, signupMatch);

        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}