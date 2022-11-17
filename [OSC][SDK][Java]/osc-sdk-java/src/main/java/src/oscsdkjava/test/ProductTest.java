package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.Product;

public class ProductTest {
    public static void main(String[] args) throws JsonProcessingException {
        int productId = 11;
        String name = "nome";
        String logo = "logo url";

        Product product = new Product(productId, name, logo);

        System.out.println(product);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(product);
        System.out.println(s);
        System.out.println("_______");
        
        Product newProduct = new ObjectMapper().readValue(s, Product.class);
        System.out.println(newProduct);
        System.out.println(newProduct.getProductId());
        System.out.println(newProduct.getName());
        System.out.println(newProduct.getLogo());
    }
}
