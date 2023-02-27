package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Auto;
import br.com.fitbank.domains.enumerator.CreditStatus;
import br.com.fitbank.domains.enumerator.PendentDocuments;
import br.com.fitbank.domains.enumerator.ProductType;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AutoTest {

    @Test
    public void autoTest(){
        String customerServiceNumber = "custom service number";
        ProductType type = ProductType.REFINANCING_AUTO;
        String product = "product";
        int productId = 11111;
        boolean hasDocuments = true;
        boolean hasContracts = true;
        String logo = "logo";
        CreditStatus laststatus = CreditStatus.CONTRATADO;
        PendentDocuments[] pendentDocuments = {PendentDocuments.ADDRESS_PROOF};
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

        String s = JSON.getGson().toJson(auto);
        Auto newAuto = JSON.getGson().fromJson(s, Auto.class);
        assertNotNull(newAuto);

    }

}
