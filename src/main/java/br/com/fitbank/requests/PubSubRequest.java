package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.PubSubRequestReturn;
import br.com.fitbank.utils.JSON;
import okhttp3.*;

import java.io.IOException;

public class PubSubRequest {

    public static PubSubRequestReturn request(OSC osc) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("text/plain");
        String token = osc.getToken();

        RequestBody formBody = RequestBody.create("", mediaType);
        Request request = new Request.Builder()
                .method("GET", formBody)
                .addHeader("Accept", "Bearer " + token)
                .addHeader("Content-Type", "application/json")
                .url("https://staging-api.easycredito.com.br/api/external//v2.1/pubsub")
                .build();

        Response response = client.newCall(request).execute();


        String responseString = response.body().string();

        //if (response.code() != 200){
        //    throw new IOException(responseString);
       // }

        return JSON.getGson().fromJson(responseString, PubSubRequestReturn.class);
    }

}
