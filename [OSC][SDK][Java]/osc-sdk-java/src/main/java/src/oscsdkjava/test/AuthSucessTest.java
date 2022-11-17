package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.AuthSucess;


public class AuthSucessTest {
    public static void main(String[] args) throws JsonProcessingException {
        String access_token = "token";
        String expire_at = "expire";

        AuthSucess authSucess = new AuthSucess(access_token, expire_at);
        System.out.println(authSucess);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(authSucess);
        System.out.println(s);
        System.out.println("_______");
        
        AuthSucess newAuthSucess = new ObjectMapper().readValue(s, AuthSucess.class);
        System.out.println(newAuthSucess);
        System.out.println(newAuthSucess.getAccess_token());
        System.out.println(newAuthSucess.getExpire_at());
    }
}
