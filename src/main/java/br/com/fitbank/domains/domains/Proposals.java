package br.com.fitbank.domains.domains;

import br.com.fitbank.domains.enumerator.CreditStatus;
import br.com.fitbank.domains.enumerator.Network;
import br.com.fitbank.domains.enumerator.PendentDocuments;
import br.com.fitbank.domains.enumerator.ProductType;

import java.io.Serializable;

public class Proposals implements Serializable{
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
    private float value;
    private int installments;
    private float monthlyTax;
    private float installmentsValue;
    private float iofValue;
    private float grossValue;
    private String firstPaymentDate;
    private float cet;
    private String releasedDate;

    public Proposals(String customerServiceNumber, ProductType type, String product, int productId, Boolean hasDocuments,
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
    public Proposals(String customerServiceNumber, ProductType type, String product, int productId, boolean hasDocuments,
                boolean hasContracts, String logo,  CreditStatus lastStatus, PendentDocuments[] pendentDocuments,
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
        setLastStatus(lastStatus);
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


    public Proposals(String customerServiceNumber, ProductType type, String product, int productId, boolean hasDocuments,
                boolean hasContracts, String logo, CreditStatus lastStatus, PendentDocuments[] pendentDocuments,
                String dateCreated, String lastUpdated, float value, int installments, float monthlyTax, float iofValue,
                float grossValue, String firstPaymentDate, float cet, String releasedDate) {

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
