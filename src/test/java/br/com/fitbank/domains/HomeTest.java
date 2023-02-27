package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Home;
import br.com.fitbank.domains.enumerator.CreditStatus;
import br.com.fitbank.domains.enumerator.PendentDocuments;
import br.com.fitbank.domains.enumerator.ProductType;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HomeTest {
    @Test
    public void homeTest(){
        String customerServiceNumber = "customer Service Number";
        ProductType type = ProductType.REFINANCING_HOME;
        String product = "product";
        int productId = 11111;
        boolean hasDocuments = true;
        boolean hasContracts = true;
        String logo = "logo string";
        CreditStatus laststatus = CreditStatus.EM_ANALISE_MANUAL;
        PendentDocuments[] pendentDocuments = {PendentDocuments.IDENTITY_BACK};
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

        String s = JSON.getGson().toJson(home);
        Home newHome = JSON.getGson().fromJson(s, Home.class);
        assertNotNull(newHome);

    }
}
