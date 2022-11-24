package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ProposalTest {
    public static void main(String[] args) throws JsonProcessingException {
        String mother = "mother";
        Gender gender = Gender.MASCULINO;
        State hometownState = State.AC;
        City hometown = new City("cidade");
        Education education = Education.ENSINO_FUNDAMENTAL_INCOMPLETO;
        RelationshipStatus relationshipStatus = RelationshipStatus.CASADO;
        String phoneLandline = "phone Land Line";
        Identity identity = new Identity(IdentityType.CARTEIRA_CRC, "number", IdentityIssuer.AERON, State.AC, "issuing date");
        Address address = new Address("zip Code", "Adress", "complement", "district", State.AC, new City("CIDADE"), HomeType.ALUGADA, HomeSince.MAIOR_2_ANOS);
        Vehicle vehicle = new Vehicle("licence Plate");
        ConsumerUnit consumerUnit = new ConsumerUnit("number");
        Business business = new Business(Occupation.APOSENTADO, Profession.ACOUGUEIRO, "company name", "phone", "income", EmploymentSince.BETWEEN_FIVE_AND_TEN_YEARS, "payday", "benefit Number", "ZipCode", "adress", "number ", "complement", "district", State.AC, new City("city"));
        Bank bank = new Bank(Banks.CODE_001, AccountType.CONTA_CORRENTE_CONJUNTA, "agency", "account");
        Reference reference = new Reference("name", "phone");
        Products products = new Products(new ProductAuto(ProductType.CARD, 1111, "vehicle brand", "vehicle Model", 2222, "vehicle model year", "code fipe", 3333));

        Proposal proposal = new Proposal(mother, gender, hometownState, hometown, education, relationshipStatus, phoneLandline, identity, address, vehicle, consumerUnit, business, bank, reference, products);

        System.out.println(proposal);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(proposal);
        System.out.println(s);
        System.out.println("_______");

        Proposal newProposal = new ObjectMapper().readValue(s, Proposal.class);
        System.out.println(newProposal);
    }
}