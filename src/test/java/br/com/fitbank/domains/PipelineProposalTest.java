package br.com.fitbank.domains;



import br.com.fitbank.domains.domains.PipelineProposal;
import br.com.fitbank.utils.JSON;


public class PipelineProposalTest {
    public static void main(String[] args) {
        String id = "id";
        String status = "status";
        String cpf = "cpf";
        String name = "name";
        String dateCreated = "date created";
        String lastUpdated = "last Updated";

        PipelineProposal pipelineProposal = new PipelineProposal(id, status, cpf, name, dateCreated, lastUpdated);
        System.out.println(pipelineProposal);
        System.out.println("_______");

        String s = JSON.getGson().toJson(pipelineProposal);
        System.out.println(s);
        System.out.println("_______");

        PipelineProposal newPipelineProposal = JSON.getGson().fromJson(s, PipelineProposal.class);
        System.out.println(newPipelineProposal);
    }
}
