package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;


public class ProductsTest {

    public static void main(String[] args) {
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

        String sA = JSON.getGson().toJson(productsA);
        String sC = JSON.getGson().toJson(productsC);
        String sH = JSON.getGson().toJson(productsH);
        String sL = JSON.getGson().toJson(productsL);

        System.out.println("products Auto:" + sA);
        System.out.println("products Card:" + sC);
        System.out.println("products Home:" + sH);
        System.out.println("products Loan:" + sL);
        System.out.println("_______");

        Products newProductsA = JSON.getGson().fromJson(sA, Products.class);
        Products newProductsC = JSON.getGson().fromJson(sC, Products.class);
        Products newProductsH = JSON.getGson().fromJson(sH, Products.class);
        Products newProductsL = JSON.getGson().fromJson(sL, Products.class);
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
