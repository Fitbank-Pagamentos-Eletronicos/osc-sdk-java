package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.response.GetContractResponse;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GetSignContractResponseTestRequest {
    @Test
    void getContractTest() {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        OSC osc = null;
        try {
            osc = OSC.createIntance(client_id, client_secret);
            String s = " ";
            GetContractResponse getContractResponse = JSON.getGson().fromJson(s, GetContractResponse.class);
            GetContractResponse getContractResponse1 = br.com.fitbank.requests.GetContract.GetContract (osc, System.getenv("CUSTOM_SERVICE_NUMBER"));

            assertNotNull(getContractResponse1.getContracts());
            assertNotNull(getContractResponse1.getCustomerServiceNumber());


        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}
