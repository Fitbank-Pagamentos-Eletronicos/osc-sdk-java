package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;



public class ProposalBankAccountTest {
    public static void main(String[] args) {
        String mother = "mother";
        Gender gender = Gender.MASCULINO;
        Nationality nationality = Nationality.BRASILEIRO;
        State hometownState = State.AC;
        RelationshipStatus relationshipStatus = RelationshipStatus.CASADO;
        Identity identity = new Identity(IdentityType.CARTEIRA_CRC, mother, IdentityIssuer.AERON, hometownState, "issuing Date");
        Address address = new Address("zip Code", "Address","1", "complemet", "district", hometownState, "cidade", HomeType.ALUGADA, HomeSince.MAIOR_2_ANOS);
        Business business = new Business(Occupation.APOSENTADO, Profession.ACOUGUEIRO, "company name", "phone", "income", "payday", "benefit Number", "ZipCode", "adress", "number ", "complement", "district", State.AC, "city");
        ProductBankAccount products = new ProductBankAccount("type");

        ProposalBankAccount proposalBankAccount = new ProposalBankAccount(mother, gender, nationality, hometownState, relationshipStatus, identity, address, business, products);
        System.out.println(proposalBankAccount);
        System.out.println("_______");

        String s = JSON.getGson().toJson(proposalBankAccount);
        System.out.println(s);
        System.out.println("_______");

        ProposalBankAccount newProposal = JSON.getGson().fromJson(s, ProposalBankAccount.class);
        System.out.println(newProposal);
    }
}
