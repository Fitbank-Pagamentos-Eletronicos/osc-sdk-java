package br.com.fitbank.requests;

import java.io.IOException;
import java.util.Base64;

import br.com.fitbank.domains.AuthSucess;
import br.com.fitbank.utils.JSON;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OAuth{
  
  public static AuthSucess request(String clientId , String clientSecret) throws IOException{

    String originalInput = clientId + ":" + clientSecret;
    String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
    
    OkHttpClient client = new OkHttpClient().newBuilder().build();
    MediaType mediaType = MediaType.parse("application/json");
    RequestBody formBody = RequestBody.create("{\"scope\": \"api-external\"}", mediaType);
    Request request = new Request.Builder()
      .method("POST", formBody)
      .addHeader("Authorization", "Basic " + encodedString)
      .url("https://auth.easycredito.com.br/client/auth")
      .addHeader("Content-Type", "application/json")
      .build();

      Response response = client.newCall(request).execute();
      String responseString = response.body().string();

      if (response.code() != 200){
        throw new IOException(responseString);
      }

      return JSON.getGson().fromJson(responseString, AuthSucess.class);
  }

}
