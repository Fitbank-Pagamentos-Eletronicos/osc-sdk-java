package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;

public class AuthSucessTest {
    public static void main(String[] args) {
        String access_token = "token";
        String expire_at = "expire";

        AuthSucess authSucess = new AuthSucess(access_token, expire_at);
        System.out.println(authSucess);
        System.out.println("_______");

        String s = JSON.getGson().toJson(authSucess);
        System.out.println(s);
        System.out.println("_______");

        AuthSucess newAuthSucess = JSON.getGson().fromJson(s, AuthSucess.class);
        System.out.println(newAuthSucess);
        System.out.println(newAuthSucess.getAccess_token());
        System.out.println(newAuthSucess.getExpire_at());
    }
}
