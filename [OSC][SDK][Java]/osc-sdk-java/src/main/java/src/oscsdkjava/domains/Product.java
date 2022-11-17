package src.oscsdkjava.domains;

import java.io.Serializable;

public class Product implements Serializable{
    private int productId;
    private String name;
    private String logo;

    public Product(){
        
    }
    
    public Product(int productId, String name, String logo) {
        setProductId(productId);
        setName(name);
        setLogo(logo);
    }

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    } 
}
