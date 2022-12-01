package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.Pipeline;
import br.com.fitbank.utils.JSON;
import okhttp3.*;

import java.io.IOException;

public class SimpleSignup {
    public static Pipeline request(OSC osc, br.com.fitbank.domains.SimpleSignup simpleSignup) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json");
        String token = osc.getToken();

        RequestBody formBody = RequestBody.create(JSON.getGson().toJson(simpleSignup), mediaType);
        Request request = new Request.Builder()
                .method("POST", formBody)
                .addHeader("Authorization", "Bearer " + token)
                .addHeader("Content-Type", "application/json")
                .url("https://demo-api.easycredito.com.br/api/external/v2.1/process/simple_signup")
                .build();

        Response response = client.newCall(request).execute();


        String responseString = response.body().string();

        if (response.code() != 201){
            throw new IOException(responseString);
        }

        return JSON.getGson().fromJson(responseString, Pipeline.class);
    }
}
