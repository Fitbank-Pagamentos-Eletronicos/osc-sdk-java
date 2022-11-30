package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;

public class AuthTest {


    public static void main(String[] args) {
        String client_id = "00000001";
        String client_secret = "1111111110";

        Auth auth = new Auth(client_id, client_secret);

        System.out.println(auth);
        System.out.println("_______");

        String s = JSON.getGson().toJson(auth);
        System.out.println(s);
        System.out.println("_______");

        Auth newAuth = JSON.getGson().fromJson(s, Auth.class);
        System.out.println(newAuth);
        System.out.println(newAuth.getClient_id());
        System.out.println(newAuth.getClient_secret());

    }

}
