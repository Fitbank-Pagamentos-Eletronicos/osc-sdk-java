package br.com.fitbank.domains;


import br.com.fitbank.domains.enumerator.PipelineStatus;
import br.com.fitbank.domains.response.PipelineResponse;
import br.com.fitbank.utils.JSON;


import java.time.Instant;


public class PipelineTest {
    public static void main(String[] args) {
        String id = "id";
        PipelineStatus status = PipelineStatus.PROPOSAL_ANALISIS;
        String cpf = "cpf";
        String name = "name";
        Instant dateCreated = Instant.now();
        Instant lastUpdated = Instant.now();

        PipelineResponse pipelineResponse = new PipelineResponse(id, status, cpf, name, dateCreated, lastUpdated);
        System.out.println(pipelineResponse);
        System.out.println("_______");

        String s = JSON.getGson().toJson(pipelineResponse);
        System.out.println(s);
        System.out.println("_______");

        PipelineResponse newPipelineResponse = JSON.getGson().fromJson(s, PipelineResponse.class);
        System.out.println(newPipelineResponse);

    }
}
