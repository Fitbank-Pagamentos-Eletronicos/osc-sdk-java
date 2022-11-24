package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AuthTest {


    public static void main(String[] args) throws JsonProcessingException {
        String client_id = "00000001";
        String client_secret = "1111111110";

        Auth auth = new Auth(client_id, client_secret);

        System.out.println(auth);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(auth);
        System.out.println(s);
        System.out.println("_______");

        Auth newAuth = new ObjectMapper().readValue(s, Auth.class);
        System.out.println(newAuth);
        System.out.println(newAuth.getClient_id());
        System.out.println(newAuth.getClient_secret());

    }

}
