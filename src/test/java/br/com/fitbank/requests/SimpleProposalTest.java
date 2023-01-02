package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.Pipeline;
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
            br.com.fitbank.domains.ProposalBankAccount proposal = JSON.getGson().fromJson(s, br.com.fitbank.domains.ProposalBankAccount.class);

            Pipeline pipeline = br.com.fitbank.requests.SimpleProposal.request(osc, proposal, pipeline_id);
            //System.out.println("AQUI:" +pipeline.getId());
            assertNotNull(pipeline.getId());
            assertNotNull(pipeline.getStatus());
            assertNotNull(pipeline.getCpf());
            assertNotNull(pipeline.getName());
            assertNotNull(pipeline.getDateCreated());
            assertNotNull(pipeline.getLastUpdated());

        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}
