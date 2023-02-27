package br.com.fitbank.domains;


import br.com.fitbank.domains.response.SignContractResponse;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class SignContractTest {
    @Test
    public void signContractTest(){
        SignContractResponse signContractResponse = new SignContractResponse("ACEPTED CHECK SUM");
        String S = JSON.getGson().toJson(signContractResponse);
        SignContractResponse newS = JSON.getGson().fromJson(S, SignContractResponse.class);
        assertNotNull(newS);

    }

}
