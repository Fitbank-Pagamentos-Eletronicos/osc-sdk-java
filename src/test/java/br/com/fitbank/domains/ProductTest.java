package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Product;
import br.com.fitbank.utils.JSON;



public class ProductTest {
    public static void main(String[] args) {
        int productId = 11;
        String name = "nome";
        String logo = "logo url";

        Product product = new Product(productId, name, logo);

        System.out.println(product);
        System.out.println("_______");

        String s = JSON.getGson().toJson(product);
        System.out.println(s);
        System.out.println("_______");

        Product newProduct = JSON.getGson().fromJson(s, Product.class);
        System.out.println(newProduct);
        System.out.println(newProduct.getProductId());
        System.out.println(newProduct.getName());
        System.out.println(newProduct.getLogo());
    }
}
