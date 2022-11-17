package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.Credit;
import src.oscsdkjava.domains.CreditStatus;
import src.oscsdkjava.domains.PendentDocuments;
import src.oscsdkjava.domains.ProductType;

public class CreditTest {
    public static void main(String[] args) throws JsonProcessingException {
        String customerServiceNumber = "customer Service Number";
        ProductType type = ProductType.CARD;
        String product = "product";
        int productId = 1111;
        boolean hasDocuments = true;
        boolean hasContracts = true;
        String logo = "logo";
        CreditStatus lastStatus = CreditStatus.AGUARDANDO_DOCUMENTOS;
        PendentDocuments pendentDocuments = PendentDocuments.ADDRESS_PROOF;
        String dateCreated = "dateCreated";
        String lastUpdated = "lastUpdated";

        Credit credit = new Credit(customerServiceNumber, type, product, productId, hasDocuments, hasContracts, logo, lastStatus, pendentDocuments, dateCreated, lastUpdated);

        System.out.println(credit);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(credit);
        System.out.println(s);
        System.out.println("_______");
        
        Credit newCredit = new ObjectMapper().readValue(s, Credit.class);
        System.out.println(newCredit);
    }
}
