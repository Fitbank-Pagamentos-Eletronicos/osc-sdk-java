package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.requests.ProposalRequest;
import br.com.fitbank.domains.response.PipelineResponse;
import br.com.fitbank.utils.JSON;
import okhttp3.*;

import java.io.IOException;

public class Proposal {
    public static PipelineResponse request(OSC osc, ProposalRequest proposalRequest, String ID) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder().build();
        String token = osc.getToken();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody formBody = RequestBody.create(JSON.getGson().toJson(proposalRequest), mediaType);
       // System.out.println(JSON.getGson().toJson(proposal));
        Request request = new Request.Builder()
                .method("POST", formBody)
                .addHeader("Authorization", "Bearer " + token)
                .addHeader("Content-Type", "application/json")
                .url("https://demo-api.easycredito.com.br/api/external/v2.1/process/proposal/"+ID)
                .build();

       // System.out.println(request);
        Response response = client.newCall(request).execute();


        String responseString = response.body().string();
       // System.out.println(responseString);

        //if (response.code() != 201){
       //     throw new IOException(responseString);
       // }

        return JSON.getGson().fromJson(responseString, PipelineResponse.class);
    }
}
