package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.BankAccount;
import domains.CreditStatus;

public class BankAccountTest {
    public static void main(String[] args) throws JsonProcessingException {
        String customerServiceNumber = "customer Service Number";
        String product = "product";
        int productId = 1111;
        boolean hasDocuments = true;
        boolean hasContracts = true;    
        CreditStatus lastStatus = CreditStatus.AGUARDANDO_DOCUMENTOS;
        String dateCreated = "date created";
        String lastUpdated = "last updated";

        BankAccount bankAccount = new BankAccount(customerServiceNumber, product, productId, hasDocuments, hasContracts, lastStatus, dateCreated, lastUpdated);

        System.out.println(bankAccount);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(bankAccount);
        System.out.println(s);
        System.out.println("_______");
        
        BankAccount newBankAccount = new ObjectMapper().readValue(s, BankAccount.class);
        System.out.println(newBankAccount);
    }
}
