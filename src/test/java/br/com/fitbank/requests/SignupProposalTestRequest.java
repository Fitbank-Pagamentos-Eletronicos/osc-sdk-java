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
            String s = "{\n  \"cpf\": \"019.925.863-57\",\n  \"name\": \"leonardo paiva torquato de sousa\",\n  \"birthday\": \"1992-07-25\",\n  \"email\": \"leonardo.sousa@fitbank.com.br\",\n  \"phone\": \"88992440412\",\n  \"zipCode\": \"74180040\",\n  \"education\": \"POS_GRADUACAO\",\n  \"banks\": \"CODE_001\",\n  \"occupation\": \"ASSALARIADO\",\n  \"income\": 1045,\n  \"hasCreditCard\": true,\n  \"hasRestriction\": true,\n  \"hasOwnHouse\": true,\n  \"hasVehicle\": true,\n  \"hasAndroid\": true,\n  \"products\": [\n    {\n      \"ProductType\": \"LOAN\",\n      \"value\": \"7000\",\n      \"installments\": 12\n    },\n    {\n      \"ProductType\": \"CARD\",\n      \"network\": \"MASTERCARD\",\n      \"payDay\": 15\n    },\n    {\n      \"ProductType\": \"REFINANCING_AUTO\",\n      \"value\": \"30000\",\n      \"vehicleBrand\": \"Fiat\",\n      \"vehicleModel\": \"Mobi\",\n      \"installments\": 12,\n      \"vehicleModelYear\": \"2010\",\n      \"codeFipe\": \"038003-2\",\n      \"vehicleFipeValue\": \"28000\"\n    },\n    {\n      \"ProductType\": \"REFINANCING_HOME\",\n      \"value\": \"150000\",\n      \"installments\": 12,\n      \"realEstateType\": \"house\",\n      \"realEstateValue\": \"148000\",\n      \"outstandingBalance\": \"50000\"\n    }\n  ],\n  \"logData\": {\n    \"latitude\": -16.6982283,\n    \"longitude\": -49.2581201,\n    \"occurrenceDate\": \"2019-08-21T14:31:17.459Z\",\n    \"userAgent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36\",\n    \"ip\": \"0.0.0.0\",\n    \"mac\": \"00:00:00:00:00:00\"\n  }\n}";
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
