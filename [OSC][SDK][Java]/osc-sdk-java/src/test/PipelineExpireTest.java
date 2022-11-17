package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.PipelineExpire;

public class PipelineExpireTest {
    public static void main(String[] args) throws JsonProcessingException {
        String id = "id";
        String status = "status";
        String cpf = "cpf";
        String name = "name";
        String dateCreated = "date created";
        String lastUpdated = "last Updated";

        PipelineExpire pipelineExpire = new PipelineExpire(id, status, cpf, name, dateCreated, lastUpdated); 
        System.out.println(pipelineExpire);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(pipelineExpire);
        System.out.println(s);
        System.out.println("_______");
        
        PipelineExpire newPipelineExpire = new ObjectMapper().readValue(s, PipelineExpire.class);
        System.out.println(newPipelineExpire);
    }
}
