package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.ErrorField;
import src.oscsdkjava.domains.ErrorFields;

public class ErrorFieldsTest {
    public static void main(String[] args) throws JsonProcessingException {
        ErrorFields errorFields = new ErrorFields("code", "message", new ErrorField("field","field Message"));

        System.out.println(errorFields);
        System.out.println(errorFields.getErrors());
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(errorFields);
        System.out.println(s);
        System.out.println("_______");
        
        ErrorFields newErrorFields = new ObjectMapper().readValue(s, ErrorFields.class);
        System.out.println(newErrorFields);
        System.out.println(newErrorFields.getCode());
        System.out.println(newErrorFields.getMessage());
        System.out.println(newErrorFields.getErrors());
        System.out.println(newErrorFields.getErrors().getField());
        System.out.println(newErrorFields.getErrors().getMessage());
    }
}
