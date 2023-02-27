package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.BankAccount;
import br.com.fitbank.domains.enumerator.CreditStatus;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankAccountTest {
    @Test
    public void bankAccountTest(){
        String customerServiceNumber = "customer Service Number";
        String product = "product";
        int productId = 1111;
        boolean hasDocuments = true;
        boolean hasContracts = true;
        CreditStatus lastStatus = CreditStatus.AGUARDANDO_DOCUMENTOS;
        String dateCreated = "date created";
        String lastUpdated = "last updated";

        BankAccount bankAccount = new BankAccount(customerServiceNumber, product, productId, hasDocuments, hasContracts, lastStatus, dateCreated, lastUpdated);

        String s = JSON.getGson().toJson(bankAccount);
        BankAccount newBankAccount = JSON.getGson().fromJson(s, BankAccount.class);
        assertNotNull(newBankAccount);

    }
}
