package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.PipelineExpire;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PipelineExpireTest {
    @Test
    public void pipelineExpireTest(){
        String id = "id";
        String status = "status";
        String cpf = "cpf";
        String name = "name";
        String dateCreated = "date created";
        String lastUpdated = "last Updated";

        PipelineExpire pipelineExpire = new PipelineExpire(id, status, cpf, name, dateCreated, lastUpdated);
        String s = JSON.getGson().toJson(pipelineExpire);
        PipelineExpire newPipelineExpire = JSON.getGson().fromJson(s, PipelineExpire.class);
        assertNotNull(newPipelineExpire);

    }
}
