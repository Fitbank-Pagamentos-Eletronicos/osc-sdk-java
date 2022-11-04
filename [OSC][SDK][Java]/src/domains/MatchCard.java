package domains;

public class MatchCard {
    private int productId;
    private String name;
    private String logo;
    private Float annuity;
    private Network network;

    


    public MatchCard(int productId, String name, String logo, Float annuity, Network network) {
        setProductId(productId);
        setName(name);
        setLogo(logo);
        setAnnuity(annuity);
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
    public Float getAnnuity() {
        return annuity;
    }
    public void setAnnuity(Float annuity) {
        this.annuity = annuity;
    }
    public Network getNetwork() {
        return network;
    }
    public void setNetwork(Network network) {
        this.network = network;
    }
}
