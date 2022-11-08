package domains;

public class ProductLoan {
    private ProductType type;
    private float value;
    private int installments;



    
    public ProductLoan(ProductType type, float value, int installments) {
        setType(type);
        setValue(value);
        setInstallments(installments);
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
}
