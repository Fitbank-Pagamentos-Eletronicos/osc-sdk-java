package domains;

import java.io.Serializable;

public class MatchLoan implements Serializable{
    

    private Integer productId;
    private String name;
    private String logo;
    private Integer minValue;
    private Integer maxValue;
    private Integer minInstallment;
    private Integer maxInstallment;
    private float monthlyTax;

    public MatchLoan(){
        
    }
    public MatchLoan(Integer productId, String name, String logo, Integer minValue, Integer maxValue, Integer minInstallment, Integer maxInstallment, float monthlyTax) {
        setProductId(productId);
        setName(name);
        setLogo(logo);
        setMinValue(minValue);
        setMaxValue(maxValue);
        setMinInstallment(minInstallment);
        setMaxInstallment(maxInstallment);
        setMonthlyTax(monthlyTax);
    }


    public Integer getProductId() {
        return productId;
    }
    public void setProductId(Integer productId) {
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
    public Integer getMinValue() {
        return minValue;
    }
    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }
    public Integer getMaxValue() {
        return maxValue;
    }
    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }
    public Integer getMinInstallment() {
        return minInstallment;
    }
    public void setMinInstallment(Integer minInstallment) {
        this.minInstallment = minInstallment;
    }
    public Integer getMaxInstallment() {
        return maxInstallment;
    }
    public void setMaxInstallment(Integer maxInstallment) {
        this.maxInstallment = maxInstallment;
    }
    public float getMonthlyTax() {
        return monthlyTax;
    }
    public void setMonthlyTax(float monthlyTax) {
        this.monthlyTax = monthlyTax;
    }


}
