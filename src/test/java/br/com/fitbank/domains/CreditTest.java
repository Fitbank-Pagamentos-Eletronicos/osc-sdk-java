package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Credit;
import br.com.fitbank.domains.enumerator.CreditStatus;
import br.com.fitbank.domains.enumerator.PendentDocuments;
import br.com.fitbank.domains.enumerator.ProductType;
import br.com.fitbank.utils.JSON;

public class CreditTest {
    public static void main(String[] args) {
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

        String s = JSON.getGson().toJson(credit);
        System.out.println(s);
        System.out.println("_______");

        Credit newCredit = JSON.getGson().fromJson(s, Credit.class);
        System.out.println(newCredit);
    }
}
