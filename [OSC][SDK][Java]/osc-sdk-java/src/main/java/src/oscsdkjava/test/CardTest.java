package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.Card;
import src.oscsdkjava.domains.CreditStatus;
import src.oscsdkjava.domains.Network;
import src.oscsdkjava.domains.PendentDocuments;
import src.oscsdkjava.domains.ProductType;


public class CardTest {
    public static void main(String[] args) throws JsonProcessingException {
        
        String customerServiceNumber = "customer servce number";
        ProductType type = ProductType.CARD;
        String product = "product String";
        int productId = 111;
        Boolean hasDocuments = true;
        Boolean hasContracts = true;
        String logo = "logo string";
        CreditStatus lastStatus = CreditStatus.CONTRATADO;
        PendentDocuments pendentDocuments = PendentDocuments.IDENTITY_BACK;
        String dateCreated = "date Created";
        String lastUpdated = "last Updated";
        Boolean international = false;
        float annuity = 2222;
        Network network = Network.MASTERCARD;
        boolean prepaid = true;
        boolean digitalAccount = true;

        Card card = new Card(customerServiceNumber, type, product, productId, hasDocuments, hasContracts, logo, lastStatus, pendentDocuments, dateCreated, lastUpdated, international, annuity, network, prepaid, digitalAccount);

        System.out.println(card);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(card);
        System.out.println(s);
        System.out.println("_______");
        
        Card newCard = new ObjectMapper().readValue(s, Card.class);
        System.out.println(newCard);
        
    }
}
