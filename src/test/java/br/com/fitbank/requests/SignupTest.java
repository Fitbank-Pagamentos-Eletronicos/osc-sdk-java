package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.SignupMatch;
import com.google.gson.Gson;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SignupTest {
    @Test
    void signupSuccessTest() {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        OSC osc = null;
        try {
            osc = OSC.createIntance(client_id, client_secret);
            String s = "{\n  \"cpf\": \"504.768.940-93\",\n  \"name\": \"Fulano d'Tal\",\n  \"birthday\": \"1992-07-25\",\n  \"email\": \"fulano6243242@email.com\",\n  \"phone\": \"62987832321\",\n  \"zipCode\": \"74180040\",\n  \"education\": \"POS_GRADUACAO\",\n  \"banks\": \"CODE_001\",\n  \"occupation\": \"ASSALARIADO\",\n  \"income\": 1045,\n  \"hasCreditCard\": true,\n  \"hasRestriction\": true,\n  \"hasOwnHouse\": true,\n  \"hasVehicle\": true,\n  \"hasAndroid\": true,\n  \"products\": [\n    {\n      \"ProductType\": \"LOAN\",\n      \"value\": \"7000\",\n      \"installments\": 12\n    },\n    {\n      \"ProductType\": \"CARD\",\n      \"network\": \"MASTERCARD\",\n      \"payDay\": 15\n    },\n    {\n      \"ProductType\": \"REFINANCING_AUTO\",\n      \"value\": \"30000\",\n      \"vehicleBrand\": \"Fiat\",\n      \"vehicleModel\": \"Mobi\",\n      \"installments\": 12,\n      \"vehicleModelYear\": \"2010\",\n      \"codeFipe\": \"038003-2\",\n      \"vehicleFipeValue\": \"28000\"\n    },\n    {\n      \"ProductType\": \"REFINANCING_HOME\",\n      \"value\": \"150000\",\n      \"installments\": 12,\n      \"realEstateType\": \"house\",\n      \"realEstateValue\": \"148000\",\n      \"outstandingBalance\": \"50000\"\n    }\n  ],\n  \"logData\": {\n    \"latitude\": -16.6982283,\n    \"longitude\": -49.2581201,\n    \"occurrenceDate\": \"2019-08-21T14:31:17.459Z\",\n    \"userAgent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36\",\n    \"ip\": \"0.0.0.0\",\n    \"mac\": \"00:00:00:00:00:00\"\n  }\n}";
            Gson gson = new Gson();
            SignupMatch signupMatch = gson.fromJson(s, SignupMatch.class);

            Response response = Signup.request(osc, signupMatch);
            String expectedResponse = "{\"id\":\"1k8ksb0hu78b6bcnpsdfc472485a6604edeaa20ec8117b97dce\",\"name\":\"Fulano d\'Tal\",\"status\":\"SIGNUP_ANALISIS\",\"cpf\":50476894093,\"dateCreated\":\"2022-11-30T12:07:31.908Z\",\"lastUpdated\":\"2022-11-30T12:07:31.908Z\"}";
            System.out.println(response.body().string());
        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
        }
    }
}
