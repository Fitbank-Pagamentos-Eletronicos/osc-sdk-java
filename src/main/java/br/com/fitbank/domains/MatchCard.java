package br.com.fitbank.domains;

import java.io.Serializable;

public class MatchCard implements Serializable{
    private int productId;
    private String name;
    private String logo;
    private float annuity;
    private Network network;

    public MatchCard(){

    }


    public MatchCard(int productId, String name, String logo, float i, Network network) {
        setProductId(productId);
        setName(name);
        setLogo(logo);
        setAnnuity(i);
        setNetwork(network);
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
    public float getAnnuity() {
        return annuity;
    }
    public void setAnnuity(float annuity) {
        this.annuity = annuity;
    }
    public Network getNetwork() {
        return network;
    }
    public void setNetwork(Network network) {
        this.network = network;
    }
}
