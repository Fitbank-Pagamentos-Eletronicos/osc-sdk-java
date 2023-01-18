package br.com.fitbank.domains;


import br.com.fitbank.domains.response.AuthResponse;
import br.com.fitbank.utils.JSON;

public class AuthSucessTest {
    public static void main(String[] args) {
        String access_token = "token";
        String expire_at = "expire";

        AuthResponse authResponse = new AuthResponse(access_token, expire_at);
        System.out.println(authResponse);
        System.out.println("_______");

        String s = JSON.getGson().toJson(authResponse);
        System.out.println(s);
        System.out.println("_______");

        AuthResponse newAuthResponse = JSON.getGson().fromJson(s, AuthResponse.class);
        System.out.println(newAuthResponse);
        System.out.println(newAuthResponse.getAccessToken());
        System.out.println(newAuthResponse.getExpireAt());
    }
}
