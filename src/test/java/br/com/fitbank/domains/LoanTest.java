package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Loan;
import br.com.fitbank.domains.enumerator.CreditStatus;
import br.com.fitbank.domains.enumerator.PendentDocuments;
import br.com.fitbank.domains.enumerator.ProductType;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LoanTest {
    @Test
    public void loanTest(){
        String customerServiceNumber = "custom service number";
        ProductType type = ProductType.LOAN;
        String product = "product";
        int productId = 12314134;
        boolean hasDocuments = true;
        boolean hasContracts = true;
        String logo = "logo string";
        CreditStatus lastStatus = CreditStatus.CONTRATADO;
        PendentDocuments[] pendentDocuments = {PendentDocuments.ADDRESS_PROOF};
        String dateCreated = "date created";
        String lastUpdated = "last updated";
        float value = 2324;
        int installments = 123;
        float monthlyTax = 12312345;
        float iofValue = 34255256;
        float grossValue = 546546;
        String firstPaymentDate = "payment date";
        float cet = 2222;
        String releaseDate = "release date";

        Loan loan = new Loan(customerServiceNumber, type, product, productId, hasDocuments, hasContracts, logo, lastStatus, pendentDocuments, dateCreated, lastUpdated, value, installments, monthlyTax, iofValue, grossValue, firstPaymentDate, cet, releaseDate);

        String s = JSON.getGson().toJson(loan);
        Loan newLoan = JSON.getGson().fromJson(s, Loan.class);
        assertNotNull(newLoan);

    }
}
