package requests;

import java.io.IOException;
import java.util.Base64;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OAuth{
  
  public static String postTest(String clientId , String clientSecret) throws IOException{

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
      return response.body().string();
  }
}
