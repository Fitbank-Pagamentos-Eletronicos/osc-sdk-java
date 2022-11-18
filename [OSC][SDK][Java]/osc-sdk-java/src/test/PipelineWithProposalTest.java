package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.CreditStatus;
import domains.Loan;
import domains.PendentDocuments;
import domains.PipelineWithProposal;
import domains.ProductType;

import domains.Proposals;

public class PipelineWithProposalTest {
    public static void main(String[] args) throws JsonProcessingException {
        String id = "id";
        String status= "status";
        int cpf = 111;
        String name = "name";
        String dateCreated = "date created";
        String lastUpdated = "last Updated";
        

        Loan loan = new Loan("customer Service Number", ProductType.LOAN, "product", 1111, true, false, "logo", CreditStatus.AGUARDANDO_DOCUMENTOS, PendentDocuments.ADDRESS_PROOF, "date created", "last Update", 2222, 3333, 4444, 5555, 6666, "first Payment", 7777, "released Date");
        Proposals proposals = new Proposals(loan);

        PipelineWithProposal pipelineWithProposal = new PipelineWithProposal(id, status, cpf, name, dateCreated, lastUpdated, proposals);

        System.out.println(pipelineWithProposal);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(pipelineWithProposal);
        System.out.println(s);
        System.out.println("_______");
        
        PipelineWithProposal newPipelineWithProposal = new ObjectMapper().readValue(s, PipelineWithProposal.class);
        System.out.println(newPipelineWithProposal);

    }
}
