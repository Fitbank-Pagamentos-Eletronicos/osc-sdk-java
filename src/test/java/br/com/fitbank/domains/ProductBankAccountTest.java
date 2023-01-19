package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.ProductBankAccount;
import br.com.fitbank.utils.JSON;



public class ProductBankAccountTest {
    public static void main(String[] args) {
        String type = "type";

        ProductBankAccount productBankAccount = new ProductBankAccount(type);
        System.out.println(productBankAccount);
        System.out.println("_______");

        String s = JSON.getGson().toJson(productBankAccount);
        System.out.println(s);
        System.out.println("_______");

        ProductBankAccount newProductBankAccount = JSON.getGson().fromJson(s, ProductBankAccount.class);
        System.out.println(newProductBankAccount);
        System.out.println(newProductBankAccount.getType());

    }
}
