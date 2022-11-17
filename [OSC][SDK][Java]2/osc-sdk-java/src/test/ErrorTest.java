package test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.Error;

public class ErrorTest {
    public static void main(String[] args) throws JsonProcessingException {
        Error error = new Error("code", "message");

        System.out.println(error);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(error);
        System.out.println(s);
        System.out.println("_______");
        
        Error newError = new ObjectMapper().readValue(s, Error.class);
        System.out.println(newError);
        System.out.println(newError.getCode());
        System.out.println(newError.getMessage());
    }
}
