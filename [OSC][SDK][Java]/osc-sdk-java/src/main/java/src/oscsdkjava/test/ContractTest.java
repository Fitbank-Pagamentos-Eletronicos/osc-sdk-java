package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.Contract;
import src.oscsdkjava.domains.LogData;

public class ContractTest {
    public static void main(String[] args) throws JsonProcessingException {
        String aceptedCheckSum = "acepted check Sum";
        LogData logData = new LogData(1111, 2222, "ocurrence Date", "User Agent", "ip", "mac");

        Contract contract = new Contract(aceptedCheckSum, logData);

        System.out.println(contract);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(contract);
        System.out.println(s);
        System.out.println("_______");
        
        Contract newContract = new ObjectMapper().readValue(s, Contract.class);
        System.out.println(newContract);
    }
}
