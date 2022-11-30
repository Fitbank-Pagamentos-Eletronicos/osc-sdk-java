package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.SignupMatch;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.IOException;

public class Signup {
    public static Response request(OSC osc, SignupMatch signupMatch) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json");

        RequestBody formBody = RequestBody.create(new ObjectMapper().writeValueAsString(signupMatch), mediaType);
        Request request = new Request.Builder()
                .method("POST", formBody)
                .addHeader("Authorization", "Bearer " + osc.getToken())
                .url("https://demo-api.easycredito.com.br/api/external/v2.1/process/signup")
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = client.newCall(request).execute();




        return response;
    }
}
