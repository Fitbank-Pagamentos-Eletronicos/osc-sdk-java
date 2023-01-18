package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.requests.SignContractRequest;
import br.com.fitbank.domains.response.SignContractResponse;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PostSignContractResponseTestRequest {
    @Test
    void getContractTest() {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        OSC osc = null;
        try {
            osc = OSC.createIntance(client_id, client_secret);
            String s = "{"+
                    "\"aceptedCheckSum\": ["+
                    "\"97cc0c24610e982d38e2d28e80e7ff5af14bebd72491d548c1c5c1d2a4b7da06\","+
                    "\"6cd99b452562c89d3cfccf2fd30c5e8633e59731795c89250be7d16cd3b034e1\""+
                    "],"+
                    "\"logData\": {"+
                    "\"latitude\": -16.6982283,"+
                    "\"longitude\": -49.2581201,"+
                    "\"occurrenceDate\": \"2019-08-21T14:31:17.459Z\","+
                    "\"userAgent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36\","+
                    "\"ip\": \"1.0.0.0\","+
                    "\"mac\": \"00:00:00:00:00:00\""+
                    "}"+
                    "}";
            SignContractRequest SignContractRequest = JSON.getGson().fromJson(s, SignContractRequest.class);
            SignContractResponse signContractResponse = br.com.fitbank.requests.PostContract.postContract (osc, System.getenv("CUSTOM_SERVICE_NUMBER"), SignContractRequest);

            assertNotNull(signContractResponse.getAceptedCheckSum());


        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}
