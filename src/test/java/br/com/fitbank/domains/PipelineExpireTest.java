package br.com.fitbank.domains;



import br.com.fitbank.domains.domains.PipelineExpire;
import br.com.fitbank.utils.JSON;


public class PipelineExpireTest {
    public static void main(String[] args) {
        String id = "id";
        String status = "status";
        String cpf = "cpf";
        String name = "name";
        String dateCreated = "date created";
        String lastUpdated = "last Updated";

        PipelineExpire pipelineExpire = new PipelineExpire(id, status, cpf, name, dateCreated, lastUpdated);
        System.out.println(pipelineExpire);
        System.out.println("_______");

        String s = JSON.getGson().toJson(pipelineExpire);
        System.out.println(s);
        System.out.println("_______");

        PipelineExpire newPipelineExpire = JSON.getGson().fromJson(s, PipelineExpire.class);
        System.out.println(newPipelineExpire);
    }
}
