package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.Network;
import domains.ProductAuto;
import domains.ProductCard;
import domains.ProductHome;
import domains.ProductLoan;
import domains.ProductType;
import domains.Products;
import domains.RealEstateType;

public class ProductsTest {
    
    public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
        ProductLoan productLoan = new ProductLoan(ProductType.LOAN, 100, 999);
        ProductCard productCard = new ProductCard(ProductType.CARD, Network.ELO, "pay day");
        ProductAuto productAuto = new ProductAuto(ProductType.REFINANCING_AUTO, 134, "vehicle brand", "model", 150, "model year", "fipe", 750);
        ProductHome productHome = new ProductHome(ProductType.REFINANCING_HOME, 12034, 23231, RealEstateType.apartment, 43434, 112222);
    
        Products productsA = new Products(productAuto);
        Products productsC = new Products(productCard);
        Products productsH = new Products(productHome);
        Products productsL = new Products(productLoan);

        System.out.println("products Auto:" + productsA);
        System.out.println("products Card:" + productsC);
        System.out.println("products Home:" + productsH);
        System.out.println("products Loan:" + productsL);
        System.out.println("_______");

        String sA = new ObjectMapper().writeValueAsString(productsA);
        String sC = new ObjectMapper().writeValueAsString(productsC);
        String sH = new ObjectMapper().writeValueAsString(productsH);
        String sL = new ObjectMapper().writeValueAsString(productsL);

        System.out.println("products Auto:" + sA);
        System.out.println("products Card:" + sC);
        System.out.println("products Home:" + sH);
        System.out.println("products Loan:" + sL);
        System.out.println("_______");
        
        Products newProductsA = new ObjectMapper().readValue(sA, Products.class);
        Products newProductsC = new ObjectMapper().readValue(sC, Products.class);
        Products newProductsH = new ObjectMapper().readValue(sH, Products.class);
        Products newProductsL = new ObjectMapper().readValue(sL, Products.class);
        System.out.println("products Auto:" + newProductsA);
        System.out.println(newProductsA.getProductAuto());
        
        System.out.println("products Card:" + newProductsC);
        System.out.println(newProductsC.getProductCard());

        System.out.println("products Home:" + newProductsH);
        System.out.println(newProductsH.getProductHome());

        System.out.println("products Loan:" + newProductsL);
        System.out.println(newProductsL.getProductLoan());
        
    }
}
