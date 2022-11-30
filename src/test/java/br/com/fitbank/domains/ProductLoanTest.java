package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;



public class ProductLoanTest {
    public static void main(String[] args) {
        ProductType type = ProductType.LOAN;
        float value = 444;
        int installments = 111;

        ProductLoan productLoan = new ProductLoan(type, value, installments);

        System.out.println(productLoan);
        System.out.println("_______");

        String s = JSON.getGson().toJson(productLoan);
        System.out.println(s);
        System.out.println("_______");

        ProductLoan newProductLoan = JSON.getGson().fromJson(s, ProductLoan.class);
        System.out.println(newProductLoan);
        System.out.println(newProductLoan.getType());
        System.out.println(newProductLoan.getValue());
        System.out.println(newProductLoan.getInstallments());

    }
}
