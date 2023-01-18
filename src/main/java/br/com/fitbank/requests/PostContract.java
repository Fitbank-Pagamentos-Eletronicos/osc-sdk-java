package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.requests.SignContractRequest;
import br.com.fitbank.domains.response.SignContractResponse;
import br.com.fitbank.utils.JSON;
import okhttp3.*;

import java.io.IOException;

public class PostContract {
    public static SignContractResponse postContract(OSC osc, String customerServiceNumber, SignContractRequest signContractRequest) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json");
        String token = osc.getToken();

        RequestBody formBody = RequestBody.create(JSON.getGson().toJson(signContractRequest), mediaType);
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

        return JSON.getGson().fromJson(responseString, SignContractResponse.class);
    }
}


