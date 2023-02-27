package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.requests.SimpleSignupRequest;
import br.com.fitbank.domains.response.PipelineResponse;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SimpleSignupRequestTest {

    @Test
    void signupSuccessTest() {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        OSC osc = null;
        try {
            osc = OSC.createIntance(client_id, client_secret);
            String s ="";
            SimpleSignupRequest simpleSignupRequest = JSON.getGson().fromJson(s, SimpleSignupRequest.class);

            PipelineResponse pipelineResponse = SimpleSignup.request(osc, simpleSignupRequest);

            assertNotNull(pipelineResponse.getId());
            assertNotNull(pipelineResponse.getStatus());
            assertNotNull(pipelineResponse.getCpf());
            assertNotNull(pipelineResponse.getName());
            assertNotNull(pipelineResponse.getDateCreated());
            assertNotNull(pipelineResponse.getLastUpdated());

        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}
