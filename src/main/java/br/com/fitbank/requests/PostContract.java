package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.Contract;
import br.com.fitbank.utils.JSON;
import okhttp3.*;

import java.io.IOException;

public class PostContract {
    public static br.com.fitbank.domains.SignContract postContract(OSC osc, String customerServiceNumber, Contract contract) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json");
        String token = osc.getToken();

        RequestBody formBody = RequestBody.create(JSON.getGson().toJson(contract), mediaType);
        Request request = new Request.Builder()
                .method("post", formBody)
                .addHeader("Authorization", "Bearer " + token)
                .addHeader("Content-Type", "application/json")
                .url("https://demo-api.easycredito.com.br/api/external/v2.1/contract/" + customerServiceNumber)
                .build();

        Response response = client.newCall(request).execute();


        String responseString = response.body().string();

        if (response.code() != 200){
            throw new IOException(responseString);
        }

        return JSON.getGson().fromJson(responseString, br.com.fitbank.domains.SignContract.class);
    }
}


