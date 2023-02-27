package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Product;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ProductTest {
    @Test
    public void productTest(){
        int productId = 11;
        String name = "nome";
        String logo = "logo url";

        Product product = new Product(productId, name, logo);
        String s = JSON.getGson().toJson(product);
        Product newProduct = JSON.getGson().fromJson(s, Product.class);
        assertNotNull(newProduct);

    }

}
