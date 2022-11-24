package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ProductLoanTest {
    public static void main(String[] args) throws JsonProcessingException {
        ProductType type = ProductType.LOAN;
        float value = 444;
        int installments = 111;

        ProductLoan productLoan = new ProductLoan(type, value, installments);

        System.out.println(productLoan);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(productLoan);
        System.out.println(s);
        System.out.println("_______");

        ProductLoan newProductLoan = new ObjectMapper().readValue(s, ProductLoan.class);
        System.out.println(newProductLoan);
        System.out.println(newProductLoan.getType());
        System.out.println(newProductLoan.getValue());
        System.out.println(newProductLoan.getInstallments());

    }
}
