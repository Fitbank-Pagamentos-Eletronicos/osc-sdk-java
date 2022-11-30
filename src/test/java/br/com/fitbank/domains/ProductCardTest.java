package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;



public class ProductCardTest {
    public static void main(String[] args) {
        ProductType type = ProductType.CARD;
        Network network = Network.MASTERCARD;
        String payDay = "pay day";

        ProductCard productCard = new ProductCard(type, network, payDay);

        System.out.println(productCard);
        System.out.println("_______");

        String s = JSON.getGson().toJson(productCard);
        System.out.println(s);
        System.out.println("_______");

        ProductCard newProductCard = JSON.getGson().fromJson(s, ProductCard.class);
        System.out.println(newProductCard);
        System.out.println(newProductCard.getType());
        System.out.println(newProductCard.getNetwork());
        System.out.println(newProductCard.getPayDay());
    }
}
