package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.BorrowerInfo;

public class BorrowerInfoTest {
    public static void main(String[] args) throws JsonProcessingException {
        BorrowerInfo borrowerInfo = new BorrowerInfo(true, false);

        System.out.println(borrowerInfo);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(borrowerInfo);
        System.out.println(s);
        System.out.println("_______");
        
        BorrowerInfo newBorrowerInfo = new ObjectMapper().readValue(s, BorrowerInfo.class);
        System.out.println(newBorrowerInfo);
        System.out.println(newBorrowerInfo.isRegistred());
        System.out.println(newBorrowerInfo.isBlocked());

    }
}
