package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.requests.DocumentRequest;
import br.com.fitbank.domains.response.DocumentResponse;
import br.com.fitbank.utils.JSON;
import okhttp3.*;

import java.io.IOException;

public class Document {

    public static DocumentResponse putDocument(OSC osc, DocumentRequest documentRequest, String pipeline_ID) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json");
        String token = osc.getToken();

        RequestBody formBody = RequestBody.create(JSON.getGson().toJson(documentRequest), mediaType);
        Request request = new Request.Builder()
                .method("Put", formBody)
                .addHeader("Authorization", "Bearer " + token)
                .addHeader("Content-Type", "application/json")
                .url("https://demo-api.easycredito.com.br/api/external/v2/process/document/:"+pipeline_ID)
                .build();

        Response response = client.newCall(request).execute();


        String responseString = response.body().string();

        if (response.code() != 201){
            throw new IOException(responseString);
        }

        return JSON.getGson().fromJson(responseString, DocumentResponse.class);
    }
}
