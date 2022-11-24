package br.com.fitbank;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class OSCTest {

    @Test
    void oscCreateIntanceTest() {
        try {
            OSC osc = OSC.getIntance();
            if(osc == null) {
                osc = OSC.createIntance("client_id", "client_secret");
            }
            assertNotNull(osc);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test
    void oscCreateIntanceMultipleTest() {
        try {

            OSC osc1 = OSC.getIntance("first");
            if(osc1 == null) {
                osc1 = OSC.createIntance("first", "client_id1", "client_secret1");
            }

            OSC osc2 = OSC.getIntance("seccond");
            if(osc2 == null) {
                osc2 = OSC.createIntance("seccond", "client_id2", "client_secret2");
            }
            assertNotEquals(osc1, osc2);

            OSC firstInstance = OSC.getIntance("first");
            OSC seccondInstance = OSC.getIntance("seccond");
            assertNotNull(firstInstance);
            assertNotNull(seccondInstance);
            assertNotEquals(firstInstance, seccondInstance);

            // Access private fields to test
            Field client_id = OSC.class.getDeclaredField("client_id");
            Field client_secret = OSC.class.getDeclaredField("client_secret");
            client_id.setAccessible(true);
            client_secret.setAccessible(true);

            assertEquals(client_id.get(firstInstance), "client_id1");
            assertEquals(client_secret.get(firstInstance), "client_secret1");
            assertEquals(client_id.get(seccondInstance), "client_id2");
            assertEquals(client_secret.get(seccondInstance), "client_secret2");

        } catch (RuntimeException | NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    void oscGetTokenErrorTest() {
        String client_id = "wrong client_id";
        String client_secret = "wrong client_secret";
        try {
            OSC osc = OSC.getIntance();
            if(osc == null) {
                osc = OSC.createIntance(client_id, client_secret);
            }

            String token = osc.getToken();
            assertNotNull(token);
        } catch (IOException e){
            assertEquals(e.getMessage(), "{\"message\":\"User not found\"}");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test
    void oscGetTokenSucessTest() {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        try {
            OSC osc = OSC.getIntance();
            if(osc == null) {
                osc = OSC.createIntance(client_id, client_secret);
            }
            String token = osc.getToken();
            assertNotNull(token);
        } catch (IOException e){
            assertEquals(e.getMessage(), "{\"message\":\"User not found\"}");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
