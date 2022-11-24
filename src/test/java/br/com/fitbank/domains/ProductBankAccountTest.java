package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ProductBankAccountTest {
    public static void main(String[] args) throws JsonProcessingException {
        String type = "type";

        ProductBankAccount productBankAccount = new ProductBankAccount(type);
        System.out.println(productBankAccount);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(productBankAccount);
        System.out.println(s);
        System.out.println("_______");

        ProductBankAccount newProductBankAccount = new ObjectMapper().readValue(s, ProductBankAccount.class);
        System.out.println(newProductBankAccount);
        System.out.println(newProductBankAccount.getType());

    }
}
