package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.ProductHome;
import br.com.fitbank.domains.enumerator.ProductType;
import br.com.fitbank.domains.enumerator.RealEstateType;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ProductHomeTest {
    @Test
    public void productHomeTest(){
        ProductType type = ProductType.REFINANCING_HOME;
        float value = 403;
        int installments = 10;
        RealEstateType realEstateType = RealEstateType.house;
        float realEstateValue = 9999;
        float outstandingBalance = 454545;

        ProductHome productHome = new ProductHome(type, value, installments, realEstateType, realEstateValue, outstandingBalance);
        String s = JSON.getGson().toJson(productHome);
        ProductHome newProductHome = JSON.getGson().fromJson(s, ProductHome.class);
        assertNotNull(newProductHome);

    }

}
