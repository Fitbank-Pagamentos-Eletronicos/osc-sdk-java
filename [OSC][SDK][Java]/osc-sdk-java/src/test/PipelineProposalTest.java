package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.PipelineProposal;

public class PipelineProposalTest {
    public static void main(String[] args) throws JsonProcessingException {
        String id = "id";
        String status = "status";
        String cpf = "cpf";
        String name = "name";
        String dateCreated = "date created";
        String lastUpdated = "last Updated";

        PipelineProposal pipelineProposal = new PipelineProposal(id, status, cpf, name, dateCreated, lastUpdated); 
        System.out.println(pipelineProposal);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(pipelineProposal);
        System.out.println(s);
        System.out.println("_______");
        
        PipelineProposal newPipelineProposal = new ObjectMapper().readValue(s, PipelineProposal.class);
        System.out.println(newPipelineProposal);
    }
}
