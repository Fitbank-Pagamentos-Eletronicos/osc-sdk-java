package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.CreditStatus;
import src.oscsdkjava.domains.Loan;
import src.oscsdkjava.domains.PendentDocuments;
import src.oscsdkjava.domains.ProductType;

public class LoanTest {
    public static void main(String[] args) throws JsonProcessingException {
        
        String customerServiceNumber = "custom service number";
        ProductType type = ProductType.LOAN;
        String product = "product";
        int productId = 12314134;
        boolean hasDocuments = true;
        boolean hasContracts = true;
        String logo = "logo string";
        CreditStatus lastStatus = CreditStatus.CONTRATADO;
        PendentDocuments pendentDocuments = PendentDocuments.ADDRESS_PROOF;
        String dateCreated = "date created";
        String lastUpdated = "last updated";
        float value = 2324;
        int installments = 123;
        float monthlyTax = 12312345;
        float iofValue = 34255256;
        float grossValue = 546546 ;
        String firstPaymentDate = "payment date";
        float cet = 2222;
        String releaseDate = "release date";

        Loan loan = new Loan(customerServiceNumber, type, product, productId, hasDocuments, hasContracts, logo, lastStatus, pendentDocuments, dateCreated, lastUpdated, value, installments, monthlyTax, iofValue, grossValue, firstPaymentDate, cet, releaseDate);

        System.out.println(loan);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(loan);
        System.out.println(s);
        System.out.println("_______");
        
        Loan newLoan = new ObjectMapper().readValue(s, Loan.class);
        System.out.println(newLoan);
        
    }
}
