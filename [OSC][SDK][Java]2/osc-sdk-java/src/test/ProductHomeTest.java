package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.ProductHome;
import domains.ProductType;
import domains.RealEstateType;

public class ProductHomeTest {
    public static void main(String[] args) throws JsonProcessingException {
        ProductType type = ProductType.REFINANCING_HOME;
        float value = 403;
        int installments = 10;
        RealEstateType realEstateType = RealEstateType.house;
        float realEstateValue = 9999;
        float outstandingBalance = 454545;

        ProductHome productHome = new ProductHome(type, value, installments, realEstateType, realEstateValue, outstandingBalance);
        System.out.println(productHome);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(productHome);
        System.out.println(s);
        System.out.println("_______");
        
        ProductHome newProductHome = new ObjectMapper().readValue(s, ProductHome.class);
        System.out.println(newProductHome);
        System.out.println(newProductHome.getType());
        System.out.println(newProductHome.getValue());
        System.out.println(newProductHome.getInstallments());
        System.out.println(newProductHome.getRealEstateType());
        System.out.println(newProductHome.getRealEstateValue());
        System.out.println(newProductHome.getOutstandingBalance());
    }
}
