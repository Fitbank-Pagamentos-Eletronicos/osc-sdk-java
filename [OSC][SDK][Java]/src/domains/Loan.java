package domains;

import java.io.Serializable;

public class Loan implements Serializable{
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
    private float value;
    private int installments;
    private float monthlyTax;
    private float iofValue;
    private float grossValue;
    private String firstPaymentDate;
    private float cet;
    private String releaseDate;


    
    public Loan(String customerServiceNumber, ProductType type, String product, int productId, boolean hasDocuments,
            boolean hasContracts, String logo, CreditStatus lastStatus, PendentDocuments pendentDocuments,
            String dateCreated, String lastUpdated, float value, int installments, float monthlyTax, float iofValue,
            float grossValue, String firstPaymentDate, float cet, String releaseDate) {

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
        setValue(grossValue);
        setInstallments(installments);
        setMonthlyTax(monthlyTax);
        setIofValue(iofValue);
        setGrossValue(grossValue);
        setFirstPaymentDate(firstPaymentDate);
        setCet(cet);
        setReleaseDate(releaseDate);
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
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public int getInstallments() {
        return installments;
    }
    public void setInstallments(int installments) {
        this.installments = installments;
    }
    public float getMonthlyTax() {
        return monthlyTax;
    }
    public void setMonthlyTax(float monthlyTax) {
        this.monthlyTax = monthlyTax;
    }
    public float getIofValue() {
        return iofValue;
    }
    public void setIofValue(float iofValue) {
        this.iofValue = iofValue;
    }
    public float getGrossValue() {
        return grossValue;
    }
    public void setGrossValue(float grossValue) {
        this.grossValue = grossValue;
    }
    public String getFirstPaymentDate() {
        return firstPaymentDate;
    }
    public void setFirstPaymentDate(String firstPaymentDate) {
        this.firstPaymentDate = firstPaymentDate;
    }
    public float getCet() {
        return cet;
    }
    public void setCet(float cet) {
        this.cet = cet;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    
}
