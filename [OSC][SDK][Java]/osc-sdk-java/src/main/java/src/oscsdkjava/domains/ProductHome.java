package src.oscsdkjava.domains;

import java.io.Serializable;

public class ProductHome implements Serializable{
    private ProductType type;
    private float value;
    private int installments;
    private RealEstateType realEstateType;
    private float realEstateValue;
    private float outstandingBalance;
    
    public ProductHome(){

    }
    
    public ProductHome(ProductType type, float value, int installments, RealEstateType realEstateType,
            float realEstateValue, float outstandingBalance) {
        setType(type);
        setValue(realEstateValue);
        setInstallments(installments);
        setRealEstateType(realEstateType);
        setRealEstateValue(realEstateValue);
        setOutstandingBalance(outstandingBalance);
    }

    public ProductType getType() {
        return type;
    }
    public void setType(ProductType type) {
        this.type = type;
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
    public RealEstateType getRealEstateType() {
        return realEstateType;
    }
    public void setRealEstateType(RealEstateType realEstateType) {
        this.realEstateType = realEstateType;
    }
    public float getRealEstateValue() {
        return realEstateValue;
    }
    public void setRealEstateValue(float realEstateValue) {
        this.realEstateValue = realEstateValue;
    }
    public float getOutstandingBalance() {
        return outstandingBalance;
    }
    public void setOutstandingBalance(float outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }
}
