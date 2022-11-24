package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ErrorFieldTest {
    public static void main(String[] args) throws JsonProcessingException {
        ErrorField errorField = new ErrorField("field", "message");

        System.out.println(errorField);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(errorField);
        System.out.println(s);
        System.out.println("_______");

        ErrorField newErrorField = new ObjectMapper().readValue(s, ErrorField.class);
        System.out.println(newErrorField);
        System.out.println(newErrorField.getField());
        System.out.println(newErrorField.getMessage());
    }
}
