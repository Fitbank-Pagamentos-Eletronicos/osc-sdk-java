package br.com.fitbank.domains;


import br.com.fitbank.domains.requests.AuthRequest;
import br.com.fitbank.utils.JSON;

public class AuthTest {


    public static void main(String[] args) {
        String client_id = "00000001";
        String client_secret = "1111111110";

        AuthRequest authRequest = new AuthRequest(client_id, client_secret);

        System.out.println(authRequest);
        System.out.println("_______");

        String s = JSON.getGson().toJson(authRequest);
        System.out.println(s);
        System.out.println("_______");

        AuthRequest newAuthRequest = JSON.getGson().fromJson(s, AuthRequest.class);
        System.out.println(newAuthRequest);
        System.out.println(newAuthRequest.getClient_id());
        System.out.println(newAuthRequest.getClient_secret());

    }

}
