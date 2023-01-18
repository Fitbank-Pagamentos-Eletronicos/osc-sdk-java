package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.ProductHome;
import br.com.fitbank.domains.enumerator.ProductType;
import br.com.fitbank.domains.enumerator.RealEstateType;
import br.com.fitbank.utils.JSON;



public class ProductHomeTest {
    public static void main(String[] args) {
        ProductType type = ProductType.REFINANCING_HOME;
        float value = 403;
        int installments = 10;
        RealEstateType realEstateType = RealEstateType.house;
        float realEstateValue = 9999;
        float outstandingBalance = 454545;

        ProductHome productHome = new ProductHome(type, value, installments, realEstateType, realEstateValue, outstandingBalance);
        System.out.println(productHome);
        System.out.println("_______");

        String s = JSON.getGson().toJson(productHome);
        System.out.println(s);
        System.out.println("_______");

        ProductHome newProductHome = JSON.getGson().fromJson(s, ProductHome.class);
        System.out.println(newProductHome);
        System.out.println(newProductHome.getType());
        System.out.println(newProductHome.getValue());
        System.out.println(newProductHome.getInstallments());
        System.out.println(newProductHome.getRealEstateType());
        System.out.println(newProductHome.getRealEstateValue());
        System.out.println(newProductHome.getOutstandingBalance());
    }
}
