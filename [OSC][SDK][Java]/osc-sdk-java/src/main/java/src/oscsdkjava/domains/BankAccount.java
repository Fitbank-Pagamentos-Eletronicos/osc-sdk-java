package src.oscsdkjava.domains;

import java.io.Serializable;

public class BankAccount implements Serializable{
    private String customerServiceNumber;
    private String product;
    private int productId;
    private boolean hasDocuments;
    private boolean hasContracts;    
    private CreditStatus lastStatus;
    private String dateCreated;
    private String lastUpdated;

    public BankAccount(){
        
    }
    public BankAccount(String customerServiceNumber, String product, int productId, boolean hasDocuments,
            boolean hasContracts, CreditStatus lastStatus, String dateCreated, String lastUpdated) {
        setCustomerServiceNumber(customerServiceNumber);
        setProduct(product);
        setProductId(productId);
        setHasDocuments(hasDocuments);
        setHasContracts(hasContracts);
        setLastStatus(lastStatus);
        setDateCreated(dateCreated);
        setLastUpdated(lastUpdated);
    }
    
    public String getCustomerServiceNumber() {
        return customerServiceNumber;
    }
    public void setCustomerServiceNumber(String customerServiceNumber) {
        this.customerServiceNumber = customerServiceNumber;
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
    public CreditStatus getLastStatus() {
        return lastStatus;
    }
    public void setLastStatus(CreditStatus lastStatus) {
        this.lastStatus = lastStatus;
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
