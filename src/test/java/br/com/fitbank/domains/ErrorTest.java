package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ErrorTest {
    public static void main(String[] args) throws JsonProcessingException {
        java.lang.Error error = new java.lang.Error("code", "message");

        System.out.println(error);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(error);
        System.out.println(s);
        System.out.println("_______");

        java.lang.Error newError = new ObjectMapper().readValue(s, java.lang.Error.class);
        System.out.println(newError);
        System.out.println(newError.getCode());
        System.out.println(newError.getMessage());
    }
}
