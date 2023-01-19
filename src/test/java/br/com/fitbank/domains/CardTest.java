package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.*;
import br.com.fitbank.domains.enumerator.CreditStatus;
import br.com.fitbank.domains.enumerator.Network;
import br.com.fitbank.domains.enumerator.PendentDocuments;
import br.com.fitbank.domains.enumerator.ProductType;
import br.com.fitbank.utils.JSON;

public class CardTest {
    public static void main(String[] args) {

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

        String s = JSON.getGson().toJson(card);
        System.out.println(s);
        System.out.println("_______");

        Card newCard = JSON.getGson().fromJson(s, Card.class);
        System.out.println(newCard);

    }
}
