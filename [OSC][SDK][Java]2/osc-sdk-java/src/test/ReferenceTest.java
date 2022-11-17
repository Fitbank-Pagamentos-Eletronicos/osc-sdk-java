package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.Reference;

public class ReferenceTest {
    public static void main(String[] args) throws JsonProcessingException {
        Reference reference = new Reference("name", "number");

        System.out.println(reference);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(reference);
        System.out.println(s);
        System.out.println("_______");
        
        Reference newReference = new ObjectMapper().readValue(s, Reference.class);
        System.out.println(newReference);
        System.out.println(newReference.getName());
        System.out.println(newReference.getPhone());
    }
}
