package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ProposalBankAccountTest {
    public static void main(String[] args) throws JsonProcessingException {
        String mother = "mother";
        Gender gender = Gender.MASCULINO;
        Nationality nationality = Nationality.BRASILEIRO;
        State hometownState = State.AC;
        RelationshipStatus relationshipStatus = RelationshipStatus.CASADO;
        Identity identity = new Identity(IdentityType.CARTEIRA_CRC, mother, IdentityIssuer.AERON, hometownState, "issuing Date");
        Address address = new Address("zip Code", "Address", "complemet", "district", hometownState, new City("cidade"), HomeType.ALUGADA, HomeSince.MAIOR_2_ANOS);
        Business business = new Business(Occupation.APOSENTADO, Profession.ACOUGUEIRO, "company name", "phone", "income", EmploymentSince.BETWEEN_FIVE_AND_TEN_YEARS, "payday", "benefit Number", "ZipCode", "adress", "number ", "complement", "district", State.AC, new City("city"));
        ProductBankAccount products = new ProductBankAccount("type");

        ProposalBankAccount proposalBankAccount = new ProposalBankAccount(mother, gender, nationality, hometownState, relationshipStatus, identity, address, business, products);
        System.out.println(proposalBankAccount);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(proposalBankAccount);
        System.out.println(s);
        System.out.println("_______");

        ProposalBankAccount newProposal = new ObjectMapper().readValue(s, ProposalBankAccount.class);
        System.out.println(newProposal);
    }
}