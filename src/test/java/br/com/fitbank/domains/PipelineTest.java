package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;


import java.time.Instant;


public class PipelineTest {
    public static void main(String[] args) {
        String id = "id";
        String status = "status";
        String cpf = "cpf";
        String name = "name";
        Instant dateCreated = Instant.now();
        Instant lastUpdated = Instant.now();

        Pipeline pipeline = new Pipeline(id, status, cpf, name, dateCreated, lastUpdated);
        System.out.println(pipeline);
        System.out.println("_______");

        String s = JSON.getGson().toJson(pipeline);
        System.out.println(s);
        System.out.println("_______");

        Pipeline newPipeline = JSON.getGson().fromJson(s, Pipeline.class);
        System.out.println(newPipeline);

    }
}
