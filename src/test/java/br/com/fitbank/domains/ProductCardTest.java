package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.ProductCard;
import br.com.fitbank.domains.enumerator.Network;
import br.com.fitbank.domains.enumerator.ProductType;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ProductCardTest {
    @Test
    public void productCardTest(){
        ProductType type = ProductType.CARD;
        Network network = Network.MASTERCARD;
        String payDay = "pay day";

        ProductCard productCard = new ProductCard(type, network, payDay);
        String s = JSON.getGson().toJson(productCard);
        ProductCard newProductCard = JSON.getGson().fromJson(s, ProductCard.class);
        assertNotNull(newProductCard);

    }

}
