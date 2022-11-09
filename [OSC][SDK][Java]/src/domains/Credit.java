package domains;

import java.io.Serializable;

public class Credit implements Serializable{
    private String customerServiceNumber;
    private ProductType type;
    private String product;
    private int productId;
    private boolean hasDocuments;
    private boolean hasContracts;
    private String logo;
    private CreditStatus lastStatus;
    private PendentDocuments pendentDocuments;
    private String dateCreated;
    private String lastUpdated;
    
    public Credit(String customerServiceNumber, ProductType type, String product, int productId, boolean hasDocuments,
            boolean hasContracts, String logo, CreditStatus lastStatus, PendentDocuments pendentDocuments,
            String dateCreated, String lastUpdated) {
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
    public boolean isHasDocuments() {
        return hasDocuments;
    }
    public void setHasDocuments(boolean hasDocuments) {
        this.hasDocuments = hasDocuments;
    }
    public boolean isHasContracts() {
        return hasContracts;
    }
    public void setHasContracts(boolean hasContracts) {
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
    public PendentDocuments getPendentDocuments() {
        return pendentDocuments;
    }
    public void setPendentDocuments(PendentDocuments pendentDocuments) {
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
}
