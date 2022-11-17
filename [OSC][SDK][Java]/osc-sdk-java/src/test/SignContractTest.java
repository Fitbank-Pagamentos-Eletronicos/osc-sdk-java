package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.SignContract;

public class SignContractTest {
    public static void main(String[] args) throws JsonProcessingException {
        SignContract signContract = new SignContract("ACEPTED CHECK SUM");

        System.out.println(signContract);
        System.out.println("_______");

        String S = new ObjectMapper().writeValueAsString(signContract);
        System.out.println(S);
        System.out.println("_______");
        
        SignContract newS = new ObjectMapper().readValue(S, SignContract.class);
        System.out.println(newS);
        System.out.println(newS.getAceptedCheckSum());

    }   
}
