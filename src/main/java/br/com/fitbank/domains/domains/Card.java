package br.com.fitbank.domains.domains;

import br.com.fitbank.domains.enumerator.CreditStatus;
import br.com.fitbank.domains.enumerator.Network;
import br.com.fitbank.domains.enumerator.PendentDocuments;
import br.com.fitbank.domains.enumerator.ProductType;

import java.io.Serializable;

public class Card implements Serializable{
    private String customerServiceNumber;
    private ProductType type;
    private String product;
    private int productId;
    private Boolean hasDocuments;
    private Boolean hasContracts;
    private String logo;
    private CreditStatus lastStatus;
    private PendentDocuments[] pendentDocuments;
    private String dateCreated;
    private String lastUpdated;
    private Boolean international;
    private float annuity;
    private Network network;
    private boolean prepaid;
    private boolean digitalAccount;

    public Card(){
        
    }
    
    public Card(String customerServiceNumber, ProductType type, String product, int productId, Boolean hasDocuments,
            Boolean hasContracts, String logo, CreditStatus lastStatus, PendentDocuments[] pendentDocuments,
            String dateCreated, String lastUpdated, Boolean international, float annuity, Network network,
            boolean prepaid, boolean digitalAccount) {

        setCustomerServiceNumber(customerServiceNumber);
        setType(type);
        setProduct(product);
        setProductId(productId);
        setHasDocuments(hasDocuments);
        setHasContracts(hasContracts);
        setLogo(logo);
        setLastStatus(lastStatus);
        setPendentDocuments(pendentDocuments);
        setDateCreated(dateCreated);
        setLastUpdated(lastUpdated);
        setInternational(international);
        setAnnuity(annuity);
        setNetwork(network);
        setPrepaid(prepaid);
        setDigitalAccount(digitalAccount);
    }

    public String getCustomerServiceNumber() {
        return customerServiceNumber;
    }
    public void setCustomerServiceNumber(String customerServiceNumber) {
        this.customerServiceNumber = customerServiceNumber;
    }
    public ProductType getType() {
        return type;
    }
    public void setType(ProductType type) {
        this.type = type;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public Boolean getHasDocuments() {
        return hasDocuments;
    }
    public void setHasDocuments(Boolean hasDocuments) {
        this.hasDocuments = hasDocuments;
    }
    public Boolean getHasContracts() {
        return hasContracts;
    }
    public void setHasContracts(Boolean hasContracts) {
        this.hasContracts = hasContracts;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public CreditStatus getLastStatus() {
        return lastStatus;
    }
    public void setLastStatus(CreditStatus lastStatus) {
        this.lastStatus = lastStatus;
    }
    public PendentDocuments[] getPendentDocuments() {
        return pendentDocuments;
    }
    public void setPendentDocuments(PendentDocuments[] pendentDocuments) {
        this.pendentDocuments = pendentDocuments;
    }
    public String getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    public String getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public Boolean getInternational() {
        return international;
    }
    public void setInternational(Boolean international) {
        this.international = international;
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
    public boolean isPrepaid() {
        return prepaid;
    }
    public void setPrepaid(boolean prepaid) {
        this.prepaid = prepaid;
    }
    public boolean isDigitalAccount() {
        return digitalAccount;
    }
    public void setDigitalAccount(boolean digitalAccount) {
        this.digitalAccount = digitalAccount;
    }
}
