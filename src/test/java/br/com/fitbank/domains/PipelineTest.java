package br.com.fitbank.domains;


import br.com.fitbank.domains.enumerator.PipelineStatus;
import br.com.fitbank.domains.response.PipelineResponse;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PipelineTest {
    @Test
    public void pipelineTest(){
        String id = "id";
        PipelineStatus status = PipelineStatus.PROPOSAL_ANALISIS;
        String cpf = "cpf";
        String name = "name";
        Instant dateCreated = Instant.now();
        Instant lastUpdated = Instant.now();

        PipelineResponse pipelineResponse = new PipelineResponse(id, status, cpf, name, dateCreated, lastUpdated);
        String s = JSON.getGson().toJson(pipelineResponse);
        PipelineResponse newPipelineResponse = JSON.getGson().fromJson(s, PipelineResponse.class);
        assertNotNull(newPipelineResponse);

    }
}
