package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;



public class PipelineWithBankAccountProposalTest {
    public static void main(String[] args) {
        String id = "id";
        String status = "status";
        int cpf = 111;
        String name = "name";
        String dateCreated = "date created";
        String lastUpdated = "lastUpdated";
        BankAccount proposals = new BankAccount("customer Service Number", "product", 1111, false, false, CreditStatus.AGUARDANDO_DOCUMENTOS, "date Created", "last Updated");

        PipelineWithBankAccountProposal pipelineWithBankAccountProposal = new PipelineWithBankAccountProposal(id, status, cpf, name, dateCreated, lastUpdated, proposals);
        System.out.println(pipelineWithBankAccountProposal);
        System.out.println("_______");

        String s = JSON.getGson().toJson(pipelineWithBankAccountProposal);
        System.out.println(s);
        System.out.println("_______");

        PipelineWithBankAccountProposal newPipelineWithBankAccountProposal = JSON.getGson().fromJson(s, PipelineWithBankAccountProposal.class);
        System.out.println(newPipelineWithBankAccountProposal);
    }
}
