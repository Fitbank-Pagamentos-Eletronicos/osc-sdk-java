package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.Identity;
import src.oscsdkjava.domains.IdentityIssuer;
import src.oscsdkjava.domains.IdentityType;
import src.oscsdkjava.domains.State;

public class IdentityTest {
    public static void main(String[] args) throws JsonProcessingException {
        Identity identity = new Identity(IdentityType.CARTEIRA_CRC, "number", IdentityIssuer.AERON, State.AC, "issuing date");

        System.out.println(identity);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(identity);
        System.out.println(s);
        System.out.println("_______");
        
        Identity newIdentity = new ObjectMapper().readValue(s, Identity.class);
        System.out.println(newIdentity);
    }
}
