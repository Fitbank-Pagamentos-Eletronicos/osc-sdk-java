package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.Auto;
import src.oscsdkjava.domains.CreditStatus;
import src.oscsdkjava.domains.PendentDocuments;
import src.oscsdkjava.domains.ProductType;

public class AutoTest {
    public static void main(String[] args) throws JsonProcessingException {
        String customerServiceNumber = "custom service number";
        ProductType type = ProductType.REFINANCING_AUTO;
        String product = "product";
        int productId = 11111;
        boolean hasDocuments = true;
        boolean hasContracts = true;
        String logo = "logo";
        CreditStatus laststatus = CreditStatus.CONTRATADO;
        PendentDocuments pendentDocuments = PendentDocuments.ADDRESS_PROOF;
        String dateCreated = "date created";
        String lastUpdated = "last Updated";
        Float value = (float) 22222;
        int installments = 33333;
        float monthlyTax = 44444;
        float installmentsValue = 55555;
        float iofValue = 66666;
        float grossValue = 77777;
        String firstPaymentDate = "first payment date";
        float cet = 88888;
        String releasedDate = "released date";

        Auto auto = new Auto(customerServiceNumber, type, product, productId, hasDocuments, hasContracts, logo, laststatus, pendentDocuments, dateCreated, lastUpdated, value, installments, monthlyTax, installmentsValue, iofValue, grossValue, firstPaymentDate, cet, releasedDate);

        System.out.println(auto);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(auto);
        System.out.println(s);
        System.out.println("_______");
        
        Auto newAuto = new ObjectMapper().readValue(s, Auto.class);
        System.out.println(newAuto);
        
    }
}
