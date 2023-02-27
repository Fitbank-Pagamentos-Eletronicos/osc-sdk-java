package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.*;
import br.com.fitbank.domains.enumerator.Network;
import br.com.fitbank.domains.enumerator.ProductType;
import br.com.fitbank.domains.enumerator.RealEstateType;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ProductsTest {
    @Test
    public void productsTest(){
        ProductLoan productLoan = new ProductLoan(ProductType.LOAN, 100, 999);
        ProductCard productCard = new ProductCard(ProductType.CARD, Network.ELO, "pay day");
        ProductAuto productAuto = new ProductAuto(ProductType.REFINANCING_AUTO, 134, "vehicle brand", "model", 150, "model year", "fipe", 750);
        ProductHome productHome = new ProductHome(ProductType.REFINANCING_HOME, 12034, 23231, RealEstateType.apartment, 43434, 112222);

        Products productsA = new Products(productAuto);
        Products productsC = new Products(productCard);
        Products productsH = new Products(productHome);
        Products productsL = new Products(productLoan);
        String sA = JSON.getGson().toJson(productsA);
        String sC = JSON.getGson().toJson(productsC);
        String sH = JSON.getGson().toJson(productsH);
        String sL = JSON.getGson().toJson(productsL);
        Products newProductsA = JSON.getGson().fromJson(sA, Products.class);
        Products newProductsC = JSON.getGson().fromJson(sC, Products.class);
        Products newProductsH = JSON.getGson().fromJson(sH, Products.class);
        Products newProductsL = JSON.getGson().fromJson(sL, Products.class);
        assertNotNull(newProductsA);
        assertNotNull(newProductsC);
        assertNotNull(newProductsH);
        assertNotNull(newProductsL);

    }

}
