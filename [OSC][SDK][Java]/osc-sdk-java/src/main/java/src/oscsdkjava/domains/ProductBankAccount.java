package src.oscsdkjava.domains;

import java.io.Serializable;

public class ProductBankAccount implements Serializable{
    private String type;

    public ProductBankAccount(){

    }
    public ProductBankAccount(String type) {
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
