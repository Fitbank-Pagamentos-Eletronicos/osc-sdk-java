package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.ProductLoan;
import br.com.fitbank.domains.enumerator.ProductType;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ProductLoanTest {
    @Test
    public void productLoanTest(){
        ProductType type = ProductType.LOAN;
        float value = 444;
        int installments = 111;

        ProductLoan productLoan = new ProductLoan(type, value, installments);
        String s = JSON.getGson().toJson(productLoan);
        ProductLoan newProductLoan = JSON.getGson().fromJson(s, ProductLoan.class);
        assertNotNull(newProductLoan);

    }

}
