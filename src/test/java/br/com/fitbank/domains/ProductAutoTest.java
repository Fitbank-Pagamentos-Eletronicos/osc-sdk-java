package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.ProductAuto;
import br.com.fitbank.domains.enumerator.ProductType;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ProductAutoTest {
    @Test
    public void productAutoTest(){
        ProductType type = ProductType.REFINANCING_AUTO;
        float value = (float) 25.05;
        String vehicleBrand = "brand";
        String vehicleModel = "model";
        int installments = 15;
        String vehicleModelYear = "year";
        String codeFipe = "fipe";
        float vehicleFipeValue = (float) 444.3;

        ProductAuto productAuto = new ProductAuto(type, value, vehicleBrand, vehicleModel, installments, vehicleModelYear, codeFipe, vehicleFipeValue);
        String s = JSON.getGson().toJson(productAuto);
        ProductAuto newProductAuto = JSON.getGson().fromJson(s, ProductAuto.class);
        assertNotNull(newProductAuto);

    }
}
