package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class PipelineTest {
    public static void main(String[] args) throws JsonProcessingException {
        String id = "id";
        String status = "status";
        String cpf = "cpf";
        String name = "name";
        String dateCreated = "date created";
        String lastUpdated = "last update";

        Pipeline pipeline = new Pipeline(id, status, cpf, name, dateCreated, lastUpdated);
        System.out.println(pipeline);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(pipeline);
        System.out.println(s);
        System.out.println("_______");

        Pipeline newPipeline = new ObjectMapper().readValue(s, Pipeline.class);
        System.out.println(newPipeline);

    }
}
