package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ProposalsTest {
    public static void main(String[] args) throws JsonProcessingException {
        Loan loan = new Loan("customer Service Number", ProductType.LOAN, "product", 1111, true, false, "logo", CreditStatus.AGUARDANDO_DOCUMENTOS, PendentDocuments.ADDRESS_PROOF, "date created", "last Update", 2222, 3333, 4444, 5555, 6666, "first Payment", 7777, "released Date");
        Card card = new Card("customer Service Number", ProductType.CARD, "product", 1111, true, true, "logo", CreditStatus.CONTRATADO, PendentDocuments.ADDRESS_PROOF, "date Created", "last Updated", true, 2222, Network.MASTERCARD, true, false);
        Auto auto = new Auto("customer service Number", ProductType.REFINANCING_AUTO, "product", 1111, false, false, "logo", CreditStatus.AGUARDANDO_DOCUMENTOS, PendentDocuments.ADDRESS_PROOF, "date created", "last Updated", 2222, 3333, 4444, 5555, 6666, 7777, "first payment date", 8888, "releasedDate");
        Home home = new Home("customer Service Number", ProductType.REFINANCING_HOME, "product", 1111, true, false, "logo", CreditStatus.CONTRATADO, PendentDocuments.ADDRESS_PROOF, "date created", "lastUptated", 2222, 3333, 4444, 5555, 6666, 7777, "first payment date", 8888, "released date");

        Proposals proposalsL = new Proposals(loan);
        Proposals proposalsC = new Proposals(card);
        Proposals proposalsA = new Proposals(auto);
        Proposals proposalsH = new Proposals(home);

        System.out.println(proposalsL);
        System.out.println(proposalsC);
        System.out.println(proposalsA);
        System.out.println(proposalsH);
        System.out.println("_______");

        String sL = new ObjectMapper().writeValueAsString(proposalsL);
        String sC = new ObjectMapper().writeValueAsString(proposalsC);
        String sA = new ObjectMapper().writeValueAsString(proposalsA);
        String sH = new ObjectMapper().writeValueAsString(proposalsH);
        System.out.println(sL);
        System.out.println(sC);
        System.out.println(sA);
        System.out.println(sH);
        System.out.println("_______");

        Proposals newProposalsL = new ObjectMapper().readValue(sL, Proposals.class);
        Proposals newProposalsC = new ObjectMapper().readValue(sC, Proposals.class);
        Proposals newProposalsA = new ObjectMapper().readValue(sA, Proposals.class);
        Proposals newProposalsH = new ObjectMapper().readValue(sH, Proposals.class);
        System.out.println(newProposalsL);
        System.out.println(newProposalsC);
        System.out.println(newProposalsA);
        System.out.println(newProposalsH);

    }
}
