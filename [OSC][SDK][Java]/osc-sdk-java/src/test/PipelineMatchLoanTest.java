package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.Match;
import domains.MatchAuto;
import domains.PipelineMatchLoan;

public class PipelineMatchLoanTest {
    public static void main(String[] args) throws JsonProcessingException {
        String id = "id";
        String status = "status";
        int cpf = 11;
        String name = "name";
        String dateCreated = "dateCreated";
        String lastUpdated = "lastUpdated";
        Match matches = new Match(new MatchAuto(11, "name", "logo", 11, 11, 11, 11, 11));
        
        PipelineMatchLoan pipelineMatchLoan = new PipelineMatchLoan(id, status, cpf, name, dateCreated, lastUpdated, matches);
        System.out.println(pipelineMatchLoan);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(pipelineMatchLoan);
        System.out.println(s);
        System.out.println("_______");
        
        PipelineMatchLoan newPipelineMatchLoan = new ObjectMapper().readValue(s, PipelineMatchLoan.class);
        System.out.println(newPipelineMatchLoan);
    }
}
