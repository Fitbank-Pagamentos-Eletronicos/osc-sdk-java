package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ProductCardTest {
    public static void main(String[] args) throws JsonProcessingException {
        ProductType type = ProductType.CARD;
        Network network = Network.MASTERCARD;
        String payDay = "pay day";

        ProductCard productCard = new ProductCard(type, network, payDay);

        System.out.println(productCard);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(productCard);
        System.out.println(s);
        System.out.println("_______");

        ProductCard newProductCard = new ObjectMapper().readValue(s, ProductCard.class);
        System.out.println(newProductCard);
        System.out.println(newProductCard.getType());
        System.out.println(newProductCard.getNetwork());
        System.out.println(newProductCard.getPayDay());
    }
}
