package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.PubSubRequestReturn;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PubSubRequestTest {
    @Test
    void signupSuccessTest() {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        OSC osc = null;
        try {
            osc = OSC.createIntance(client_id, client_secret);


            PubSubRequestReturn pubSubRequestReturn = PubSubRequest.request(osc);

            assertNotNull(pubSubRequestReturn.getEnvironment());
            assertNotNull(pubSubRequestReturn.getVersion());
            assertNotNull(pubSubRequestReturn.getMessage());


        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}
