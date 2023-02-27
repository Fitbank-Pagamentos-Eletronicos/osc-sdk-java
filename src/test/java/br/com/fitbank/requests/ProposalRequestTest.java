package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.response.PipelineResponse;
import br.com.fitbank.domains.requests.ProposalRequest;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ProposalRequestTest {
    @Test
    void ProposalSuccessTest() throws IOException {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        String pipeline_id = System.getenv("PIPELINE_ID");
        OSC osc = null;
        try {
            osc = OSC.createIntance(client_id, client_secret);
            String s = "{" +
                    "\n  \"mother\": \"Fulana Mae\"," +
                    "\n  \"gender\": \"MASCULINO\"," +
                    "\n  \"nationality\": \"BRASILEIRO\"," +
                    "\n  \"hometownState\": \"GO\"," +
                    "\n  \"hometown\": \"Goiania\"," +
                    "\n  \"education\": \"POS_GRADUACAO\"," +
                    "\n  \"relationshipStatus\": \"CASADO\"," +
                    "\n  \"phoneLandline\": \"6232345678\"," +
                    "\n  \"identity\": {" +
                    "\n    \"type\": \"RG\"," +
                    "\n    \"number\": \"123456\"," +
                    "\n    \"issuer\": \"SSP\"," +
                    "\n    \"state\": \"GO\"," +
                    "\n    \"issuingDate\": \"2010-01-01\"" +
                    "\n  }," +
                    "\n  \"address\": {" +
                    "\n    \"zipCode\": \"74000-000\"," +
                    "\n    \"address\": \"Cidade_de_Goiania\"," +
                    "\n    \"number\": 0," +
                    "\n    \"complement\": \"toda a cidade\"," +
                    "\n    \"district\": \"geral\"," +
                    "\n    \"state\": \"GO\"," +
                    "\n    \"city\": \"Goiania\"," +
                    "\n    \"homeType\": \"ALUGADA\"," +
                    "\n    \"homeSince\": \"MAIOR_2_ANOS\"" +
                    "\n  }," +
                    "\n  \"vehicle\": {" +
                    "\n    \"licensePlate\": \"XXX0000\"" +
                    "\n  }," +
                    "\n  \"consumerUnit\": {" +
                    "\n    \"number\": \"000000000\"" +
                    "\n  }," +
                    "\n  \"business\": {" +
                    "\n    \"occupation\": \"ASSALARIADO\"," +
                    "\n    \"profession\": \"ADMINISTRADOR\"," +
                    "\n    \"companyName\": \"Abobrinha\"," +
                    "\n    \"phone\": \"6239413142\"," +
                    "\n    \"income\": 1500," +
                    "\n    \"payday\": 1," +
                    "\n    \"benefitNumber\": \"\"," +
                    "\n    \"zipCode\": \"74000000\"," +
                    "\n    \"address\": \"Cidade de Goiania\"," +
                    "\n    \"number\": 1," +
                    "\n    \"complement\": \"toda a cidade\"," +
                    "\n    \"district\": \"geral\"," +
                    "\n    \"state\": \"GO\"," +
                    "\n    \"city\": \"Goiania\"" +
                    "\n  }," +
                    "\n  \"bank\": {" +
                    "\n    \"bank\": \"001\"," +
                    "\n    \"type\": \"CONTA_CORRENTE_INDIVIDUAL\"," +
                    "\n    \"agency\": \"0001\"," +
                    "\n    \"account\": \"5647891\"" +
                    "\n  }," +
                    "\n  \"reference\": [" +
                    "\n    {" +
                    "\n      \"name\": \"Joana Maria\"," +
                    "\n      \"phone\": \"11987654321\"" +
                    "\n    }" +
                    "\n  ]," +
                    "\n  \"products\": [" +
                    "\n    {" +
                    "\n      \"type\": \"LOAN\"," +
                    "\n      \"value\": \"7000\"," +
                    "\n      \"installments\": 12" +
                    "\n    }," +
                    "\n    {" +
                    "\n      \"type\": \"CARD\"," +
                    "\n      \"network\": \"MASTERCARD\"," +
                    "\n      \"payDay\": 15" +
                    "\n    }," +
                    "\n    {" +
                    "\n      \"type\": \"REFINANCING_AUTO\"," +
                    "\n      \"value\": \"30000\"," +
                    "\n      \"vehicleBrand\": \"Fiat\"," +
                    "\n      \"vehicleModel\": \"Mobi\"," +
                    "\n      \"installments\": 12," +
                    "\n      \"vehicleModelYear\": \"2010\"," +
                    "\n      \"codeFipe\": \"038003-2\"," +
                    "\n      \"vehicleFipeValue\": \"28000\"" +
                    "\n    }," +
                    "\n    {" +
                    "\n      \"type\": \"REFINANCING_HOME\"," +
                    "\n      \"value\": \"150000\"," +
                    "\n      \"installments\": 12," +
                    "\n      \"realEstateType\": \"house\"," +
                    "\n      \"realEstateValue\": \"148000\"," +
                    "\n      \"outstandingBalance\": \"50000\"" +
                    "\n    }" +
                    "\n  ]" +
                    "\n}";
            ProposalRequest proposalRequest = JSON.getGson().fromJson(s, ProposalRequest.class);

            PipelineResponse pipelineResponse = br.com.fitbank.requests.Proposal.request(osc, proposalRequest, pipeline_id);
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