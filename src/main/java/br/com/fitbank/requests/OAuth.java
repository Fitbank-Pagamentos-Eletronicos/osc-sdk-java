package br.com.fitbank.requests;

import java.io.IOException;
import java.util.Base64;

import br.com.fitbank.domains.Auth;
import br.com.fitbank.domains.AuthSucess;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OAuth{
  
  public static AuthSucess oAuth(String clientId , String clientSecret) throws IOException{

    String originalInput = clientId + ":" + clientSecret;
    String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
    
    OkHttpClient client = new OkHttpClient().newBuilder().build();
    
    MediaType mediaType = MediaType.parse("application/json");

    RequestBody formBody = RequestBody.create("{\n    \"scopes\": [\"api-external\"]\n}", mediaType);
    
    Request request = new Request.Builder()
      .method("POST", formBody)
      .addHeader("Authorization", "Basic " + encodedString)
      .url("https://auth.easycredito.com.br/client/auth")
      .addHeader("Content-Type", "application/json")
      .build();

      Response response = client.newCall(request).execute();
      String responseString = response.body().string();
      AuthSucess authResponse = null;
      if(!(responseString.equals("{\"message\":\"User not found\"}")) && 
        !(responseString.equals( "{\"error\":\"Wrong credentials\"}"))
      ){
        String responseString2 = responseString;
        String[] parts = responseString2.split(":");
        String access_token = parts[1].split(",")[0]; 
        String expire_at = (parts[2] + ":" + parts[3] + ":" + parts[4].split("}")[0]); 
        access_token = access_token.replaceAll("\"", "");
        expire_at = expire_at.replaceAll("\"", "");
        //System.out.println(access_token+"|"+expire_at);

        authResponse = new AuthSucess(access_token, expire_at);
        
      }
      return authResponse;
  }
  public static AuthSucess oAuth(Auth auth) throws IOException{
    String clientId = auth.getClient_id();
    String clientSecret = auth.getClient_secret();

    String originalInput = clientId + ":" + clientSecret;
    String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
    
    OkHttpClient client = new OkHttpClient().newBuilder().build();
    
    MediaType mediaType = MediaType.parse("application/json");

    RequestBody formBody = RequestBody.create("{\n    \"scopes\": [\"api-external\"]\n}", mediaType);
    
    Request request = new Request.Builder()
      .method("POST", formBody)
      .addHeader("Authorization", "Basic " + encodedString)
      .url("https://auth.easycredito.com.br/client/auth")
      .addHeader("Content-Type", "application/json")
      .build();

      Response response = client.newCall(request).execute();
      String responseString = response.body().string();
      AuthSucess authResponse = null;
      if(!(responseString.equals("{\"message\":\"User not found\"}")) && 
        !(responseString.equals( "{\"error\":\"Wrong credentials\"}"))
      ){
        String responseString2 = responseString;
        String[] parts = responseString2.split(":");
        String access_token = parts[1].split(",")[0]; 
        String expire_at = (parts[2] + ":" + parts[3] + ":" + parts[4].split("}")[0]); 
        access_token = access_token.replaceAll("\"", "");
        expire_at = expire_at.replaceAll("\"", "");
        //System.out.println(access_token+"|"+expire_at);

        authResponse = new AuthSucess(access_token, expire_at);
        
      }
      return authResponse;
  }
  public static String oAuthError(Auth auth) throws IOException{
    String clientId = auth.getClient_id();
    String clientSecret = auth.getClient_secret();
    
    String originalInput = clientId + ":" + clientSecret;
    String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
    
    OkHttpClient client = new OkHttpClient().newBuilder().build();
    
    MediaType mediaType = MediaType.parse("application/json");

    RequestBody formBody = RequestBody.create("{\n    \"scopes\": [\"api-external\"]\n}", mediaType);
    
    Request request = new Request.Builder()
      .method("POST", formBody)
      .addHeader("Authorization", "Basic " + encodedString)
      .url("https://auth.easycredito.com.br/client/auth")
      .addHeader("Content-Type", "application/json")
      .build();

      Response response = client.newCall(request).execute();
      String responseString = response.body().string();
      return responseString;
  }
  public static String oAuthError(String clientId , String clientSecret) throws IOException{

    String originalInput = clientId + ":" + clientSecret;
    String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
    
    OkHttpClient client = new OkHttpClient().newBuilder().build();
    
    MediaType mediaType = MediaType.parse("application/json");

    RequestBody formBody = RequestBody.create("{\n    \"scopes\": [\"api-external\"]\n}", mediaType);
    
    Request request = new Request.Builder()
      .method("POST", formBody)
      .addHeader("Authorization", "Basic " + encodedString)
      .url("https://auth.easycredito.com.br/client/auth")
      .addHeader("Content-Type", "application/json")
      .build();

      Response response = client.newCall(request).execute();
      String responseString = response.body().string();
      return responseString;
  }
}
