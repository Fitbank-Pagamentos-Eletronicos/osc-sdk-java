package br.com.fitbank.domains;

import java.io.Serializable;

public class Products implements Serializable{
    private ProductLoan productLoan;
    private ProductCard productCard;
    private ProductAuto productAuto;
    private ProductHome productHome;

    public Products(){
        
    }

    public Products(ProductLoan productLoan) {
        setProductLoan(productLoan);

    }
    public Products(ProductCard productCard) {

        setProductCard(productCard);

    }
    public Products(ProductAuto productAuto) {

        setProductAuto(productAuto);

    }
    public Products(ProductHome productHome) {

        setProductHome(productHome);
    }

    public ProductLoan getProductLoan() {
        return productLoan;
    }
    public void setProductLoan(ProductLoan productLoan) {
        this.productLoan = productLoan;
    }
    public ProductCard getProductCard() {
        return productCard;
    }
    public void setProductCard(ProductCard productCard) {
        this.productCard = productCard;
    }
    public ProductAuto getProductAuto() {
        return productAuto;
    }
    public void setProductAuto(ProductAuto productAuto) {
        this.productAuto = productAuto;
    }
    public ProductHome getProductHome() {
        return productHome;
    }
    public void setProductHome(ProductHome productHome) {
        this.productHome = productHome;
    }

}
