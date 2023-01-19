package br.com.fitbank.domains.domains;

import br.com.fitbank.domains.enumerator.Network;
import br.com.fitbank.domains.enumerator.ProductType;

import java.io.Serializable;

public class ProductCard  implements Serializable{
    private ProductType type;
    private Network network;
    private String payDay;

    public ProductCard(){


    }
    
    public ProductCard(ProductType type, Network network, String payDay) {

        setType(type);
        setNetwork(network);
        setPayDay(payDay);
    }

    public ProductType getType() {
        return type;
    }
    public void setType(ProductType type) {
        this.type = type;
    }
    public Network getNetwork() {
        return network;
    }
    public void setNetwork(Network network) {
        this.network = network;
    }
    public String getPayDay() {
        return payDay;
    }
    public void setPayDay(String payDay) {
        this.payDay = payDay;
    }
}
