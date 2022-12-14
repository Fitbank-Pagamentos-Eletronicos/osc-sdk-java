package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.GetContract;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GetContractTest {
    @Test
    void getContractTest() {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        OSC osc = null;
        try {
            osc = OSC.createIntance(client_id, client_secret);
            String s = " ";
            GetContract getContract = JSON.getGson().fromJson(s, GetContract.class);
            GetContract getContract1 = br.com.fitbank.requests.GetContract.GetContract (osc, System.getenv("CUSTOM_SERVICE_NUMBER"));

            assertNotNull(getContract1.getContracts());
            assertNotNull(getContract1.getCustomerServiceNumber());


        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}
