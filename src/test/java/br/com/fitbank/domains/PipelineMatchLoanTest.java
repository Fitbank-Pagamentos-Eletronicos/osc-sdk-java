package br.com.fitbank.domains;



import br.com.fitbank.domains.domains.Match;
import br.com.fitbank.domains.domains.MatchAuto;
import br.com.fitbank.domains.domains.PipelineMatchLoan;
import br.com.fitbank.utils.JSON;


public class PipelineMatchLoanTest {
    public static void main(String[] args) {
        String id = "id";
        String status = "status";
        int cpf = 11;
        String name = "name";
        String dateCreated = "dateCreated";
        String lastUpdated = "lastUpdated";
        Match matches = new Match(new MatchAuto(11, "name", "logo", 11, 11, 11, 11, 11));

        PipelineMatchLoan pipelineMatchLoan = new PipelineMatchLoan(id, status, cpf, name, dateCreated, lastUpdated, matches);
        System.out.println(pipelineMatchLoan);
        System.out.println("_______");

        String s = JSON.getGson().toJson(pipelineMatchLoan);
        System.out.println(s);
        System.out.println("_______");

        PipelineMatchLoan newPipelineMatchLoan = JSON.getGson().fromJson(s, PipelineMatchLoan.class);
        System.out.println(newPipelineMatchLoan);
    }
}
