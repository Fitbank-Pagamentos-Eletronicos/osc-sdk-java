package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.response.PipelineResponse;
import br.com.fitbank.domains.requests.SignupRequest;
import br.com.fitbank.domains.requests.SimpleProposalRequest;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SignupProposalTestRequest {

    @Test
    void signupProposalTest() {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        OSC osc = null;
        try {
            osc = OSC.createIntance(client_id, client_secret);
            String s = "";
            SignupRequest signupRequest = JSON.getGson().fromJson(s, SignupRequest.class);

            PipelineResponse pipelineResponse = Signup.request(osc, signupRequest);

            s = "{" +
                    "\"mother\": \"Fulana Mãe\"," +
                    "\"gender\": \"MASCULINO\"," +
                    "\"nationality\": \"BRASILEIRO\"," +
                    "\"hometownState\": \"GO\"," +
                    "\"relationshipStatus\": \"CASADO\"," +
                    "\"identity\": {" +
                    "\"type\": \"RG\"," +
                    "\"number\": \"123456\"" +
                    "}," +
                    "\"address\": {" +
                    "\"zipCode\": \"74000000\"," +
                    "\"address\": \"Cidade de Goiânia\"," +
                    "\"number\": 0," +
                    "\"complement\": \"toda a cidade\"," +
                    "\"district\": \"geral\"," +
                    "\"state\": \"GO\"," +
                    "\"city\": \"Goiânia\"" +
                    "}," +
                    "\"business\": {" +
                    "\"occupation\": \"ASSALARIADO\"," +
                    "\"income\": 1500" +
                    "}," +
                    "            \"products\": [" +
                    "{" +
                    "\"type\": \"BANK_ACCOUNT\"" +
                    "    }" +
                    "  ]" +
                    "}";
            SimpleProposalRequest proposal = JSON.getGson().fromJson(s, SimpleProposalRequest.class);

            assertNotNull(pipelineResponse.getId());
            assertNotNull(pipelineResponse.getStatus());
            assertNotNull(pipelineResponse.getCpf());
            assertNotNull(pipelineResponse.getName());
            assertNotNull(pipelineResponse.getDateCreated());
            assertNotNull(pipelineResponse.getLastUpdated());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
