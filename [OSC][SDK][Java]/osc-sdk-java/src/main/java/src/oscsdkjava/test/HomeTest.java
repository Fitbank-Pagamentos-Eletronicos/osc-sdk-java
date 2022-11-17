package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.CreditStatus;
import src.oscsdkjava.domains.Home;
import src.oscsdkjava.domains.PendentDocuments;
import src.oscsdkjava.domains.ProductType;

public class HomeTest {
    public static void main(String[] args) throws JsonProcessingException {
        
        String customerServiceNumber = "customer Service Number";
        ProductType type = ProductType.REFINANCING_HOME;
        String product = "product";
        int productId = 11111;
        boolean hasDocuments = true;
        boolean hasContracts = true;
        String logo = "logo string";
        CreditStatus laststatus = CreditStatus.EM_ANALISE_MANUAL;
        PendentDocuments pendentDocuments = PendentDocuments.IDENTITY_BACK;
        String dateCreated = "date created";
        String lastUpdated = "LastUpdated";
        float value = 2222;
        int installments = 3333;
        float monthlyTax = 4444;
        float installmentsValue = 5555;
        float iofValue = 6666;
        float grossValue = 7777;
        String firstPaymentDate = "first Payment Date";
        float cet = 8888;
        String releasedDate = "released date";

        Home home = new Home(customerServiceNumber, type, product, productId, hasDocuments, hasContracts, logo, laststatus, pendentDocuments, dateCreated, lastUpdated, value, installments, monthlyTax, installmentsValue, iofValue, grossValue, firstPaymentDate, cet, releasedDate);

        System.out.println(home);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(home);
        System.out.println(s);
        System.out.println("_______");
        
        Home newHome = new ObjectMapper().readValue(s, Home.class);
        System.out.println(newHome);
    }
}
