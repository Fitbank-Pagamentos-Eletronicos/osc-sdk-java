package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.ConsumerUnit;

public class ConsumerUnitTest {
    public static void main(String[] args) throws JsonProcessingException {
        String number = "number";

        ConsumerUnit consumerUnit = new ConsumerUnit(number);

        System.out.println(consumerUnit);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(consumerUnit);
        System.out.println(s);
        System.out.println("_______");
        
        ConsumerUnit newConsumerUnit = new ObjectMapper().readValue(s, ConsumerUnit.class);
        System.out.println(newConsumerUnit);
    }
}
