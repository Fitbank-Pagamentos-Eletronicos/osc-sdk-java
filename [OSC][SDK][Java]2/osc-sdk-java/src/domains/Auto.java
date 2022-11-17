package domains;

import java.io.Serializable;

public class Auto implements Serializable{
    private String customerServiceNumber;
    private ProductType type;
    private String product;
    private int productId;
    private boolean hasDocuments;
    private boolean hasContracts;
    private String logo;
    private CreditStatus laststatus;
    private PendentDocuments pendentDocuments;
    private String dateCreated;
    private String lastUpdated;
    private float value;
    private int installments;
    private float monthlyTax;
    private float installmentsValue;
    private float iofValue;
    private float grossValue;
    private String firstPaymentDate;
    private float cet;
    private String releasedDate;
    
    public Auto(){
        
    }
    public Auto(String customerServiceNumber, ProductType type, String product, int productId, boolean hasDocuments,
            boolean hasContracts, String logo, CreditStatus laststatus, PendentDocuments pendentDocuments,
            String dateCreated, String lastUpdated, float value, int installments, float monthlyTax,
            float installmentsValue, float iofValue, float grossValue, String firstPaymentDate, float cet,
            String releasedDate) {
        setCustomerServiceNumber(customerServiceNumber);
        setType(type);
        setProduct(product);
        setProductId(productId);
        setHasDocuments(hasDocuments);
        setHasContracts(hasContracts);
        setLogo(logo);
        setLaststatus(laststatus);
        setPendentDocuments(pendentDocuments);
        setDateCreated(dateCreated);
        setLastUpdated(lastUpdated);
        setValue(value);
        setInstallments(installments);
        setMonthlyTax(monthlyTax);
        setInstallmentsValue(installmentsValue);
        setIofValue(iofValue);
        setGrossValue(grossValue);
        setFirstPaymentDate(firstPaymentDate);
        setCet(cet);
        setReleasedDate(releasedDate);
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
    public CreditStatus getLaststatus() {
        return laststatus;
    }
    public void setLaststatus(CreditStatus laststatus) {
        this.laststatus = laststatus;
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
    public float getInstallmentsValue() {
        return installmentsValue;
    }
    public void setInstallmentsValue(float installmentsValue) {
        this.installmentsValue = installmentsValue;
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
    public String getReleasedDate() {
        return releasedDate;
    }
    public void setReleasedDate(String releasedDate) {
        this.releasedDate = releasedDate;
    }
}
