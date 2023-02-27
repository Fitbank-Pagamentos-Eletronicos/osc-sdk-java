package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.response.PipelineResponse;
import br.com.fitbank.domains.requests.SimpleProposalRequest;
import br.com.fitbank.utils.JSON;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SimpleProposalTest {
    void ProposalSuccessTest() throws IOException {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        String pipeline_id = System.getenv("PIPELINE_ID");
        OSC osc = null;
        try {
            osc = OSC.createIntance(client_id, client_secret);
            String s = "{" +
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

            PipelineResponse pipelineResponse = br.com.fitbank.requests.SimpleProposal.request(osc, proposal, pipeline_id);
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
