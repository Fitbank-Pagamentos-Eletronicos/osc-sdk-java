package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.ProductBankAccount;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ProductBankAccountTest {
    @Test
    public void productBankAccountTest(){
        String type = "type";

        ProductBankAccount productBankAccount = new ProductBankAccount(type);
        String s = JSON.getGson().toJson(productBankAccount);
        ProductBankAccount newProductBankAccount = JSON.getGson().fromJson(s, ProductBankAccount.class);
        assertNotNull(newProductBankAccount);

    }
}
