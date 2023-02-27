package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.LogData;
import br.com.fitbank.domains.requests.SignContractRequest;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ContractTest {
    @Test
    public void contractTest(){
        String[] aceptedCheckSum = {"acepted check Sum"};
        LogData logData = new LogData(1111, 2222, "ocurrence Date", "User Agent", "ip", "mac");

        SignContractRequest signContractRequest = new SignContractRequest(aceptedCheckSum, logData);
        String s = JSON.getGson().toJson(signContractRequest);
        SignContractRequest newSignContractRequest = JSON.getGson().fromJson(s, SignContractRequest.class);
        assertNotNull(newSignContractRequest);

    }

}
