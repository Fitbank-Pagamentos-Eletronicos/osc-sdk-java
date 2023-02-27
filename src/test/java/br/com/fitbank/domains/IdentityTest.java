package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Identity;
import br.com.fitbank.domains.enumerator.IdentityIssuer;
import br.com.fitbank.domains.enumerator.IdentityType;
import br.com.fitbank.domains.enumerator.State;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class IdentityTest {
    @Test
    public void identityTest(){
        Identity identity = new Identity(IdentityType.CARTEIRA_CRC, "number", IdentityIssuer.AERON, State.AC, "issuing date");
        String s = JSON.getGson().toJson(identity);
        Identity newIdentity = JSON.getGson().fromJson(s, Identity.class);
        assertNotNull(newIdentity);

    }

}
