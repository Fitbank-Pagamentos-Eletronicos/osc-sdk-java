package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.PipelineProposal;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PipelineProposalTest {
    @Test
    public void pipelineProposalTest(){
        String id = "id";
        String status = "status";
        String cpf = "cpf";
        String name = "name";
        String dateCreated = "date created";
        String lastUpdated = "last Updated";

        PipelineProposal pipelineProposal = new PipelineProposal(id, status, cpf, name, dateCreated, lastUpdated);
        String s = JSON.getGson().toJson(pipelineProposal);
        PipelineProposal newPipelineProposal = JSON.getGson().fromJson(s, PipelineProposal.class);
        assertNotNull(newPipelineProposal);

    }
}
