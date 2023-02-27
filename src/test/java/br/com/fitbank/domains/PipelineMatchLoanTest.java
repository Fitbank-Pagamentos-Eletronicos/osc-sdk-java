package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Match;
import br.com.fitbank.domains.domains.MatchAuto;
import br.com.fitbank.domains.domains.PipelineMatchLoan;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PipelineMatchLoanTest {
    @Test
    public void pipelineMatchLoanTest(){
        String id = "id";
        String status = "status";
        int cpf = 11;
        String name = "name";
        String dateCreated = "dateCreated";
        String lastUpdated = "lastUpdated";
        Match matches = new Match(new MatchAuto(11, "name", "logo", 11, 11, 11, 11, 11));

        PipelineMatchLoan pipelineMatchLoan = new PipelineMatchLoan(id, status, cpf, name, dateCreated, lastUpdated, matches);
        String s = JSON.getGson().toJson(pipelineMatchLoan);
        PipelineMatchLoan newPipelineMatchLoan = JSON.getGson().fromJson(s, PipelineMatchLoan.class);
        assertNotNull(newPipelineMatchLoan);

    }

}
