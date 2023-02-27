package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Address;
import br.com.fitbank.domains.domains.Business;
import br.com.fitbank.domains.domains.Identity;
import br.com.fitbank.domains.domains.ProductBankAccount;
import br.com.fitbank.domains.enumerator.*;
import br.com.fitbank.domains.requests.SimpleProposalRequest;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ProposalBankAccountTest {
    @Test
    public void proposalBankAccountTest(){
        String mother = "mother";
        Gender gender = Gender.MASCULINO;
        Nationality nationality = Nationality.BRASILEIRO;
        State hometownState = State.AC;
        RelationshipStatus relationshipStatus = RelationshipStatus.CASADO;
        Identity identity = new Identity(IdentityType.CARTEIRA_CRC, mother, IdentityIssuer.AERON, hometownState, "issuing Date");
        Address address = new Address("zip Code", "Address","1", "complemet", "district", hometownState, "cidade", HomeType.ALUGADA, HomeSince.MAIOR_2_ANOS);
        Business business = new Business(Occupation.APOSENTADO, Profession.ACOUGUEIRO, "company name", "phone", "income", "payday", "benefit Number", "ZipCode", "adress", "number ", "complement", "district", State.AC, "city");
        ProductBankAccount products = new ProductBankAccount("type");

        SimpleProposalRequest simpleProposalRequest = new SimpleProposalRequest(mother, gender, nationality, hometownState, relationshipStatus, identity, address, business, products);

        String s = JSON.getGson().toJson(simpleProposalRequest);
        SimpleProposalRequest newProposal = JSON.getGson().fromJson(s, SimpleProposalRequest.class);
        assertNotNull(newProposal);

    }
}
