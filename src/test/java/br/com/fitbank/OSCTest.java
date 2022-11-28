package br.com.fitbank;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OSCTest {

    @Test
    void generateInstances() throws IOException {

        String name1 = "Nome 1";
        String name2 = "Nome 2";
        String scopes[] = {"api-external"};

        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");

        OSC.createIntance(name1, client_id, client_secret, scopes);
        OSC.createIntance(name2, client_id, client_secret);
        OSC.createIntance(client_id, client_secret, scopes);
        OSC.createIntance(client_id, client_secret);


        System.out.println(OSC.getIntance(name1).getToken().getAccess_token());
        System.out.println(OSC.getIntance(name1).getToken().getExpire_at());
        System.out.println(OSC.getIntance(name2).getToken().getAccess_token());
        System.out.println(OSC.getIntance(name2).getToken().getExpire_at());
        System.out.println(OSC.getIntance().getToken().getAccess_token());
        System.out.println(OSC.getIntance().getToken().getExpire_at());

    }

}
