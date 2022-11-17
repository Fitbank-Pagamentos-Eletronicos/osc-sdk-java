package src.oscsdkjava.domains;

import java.io.Serializable;

public class ProductAuto implements Serializable{
    private ProductType type;
    private float value;
    private String vehicleBrand;
    private String vehicleModel;
    private int installments;
    private String vehicleModelYear;
    private String codeFipe;
    private float vehicleFipeValue;

    public ProductAuto(){
        
    }
    public ProductAuto(ProductType type, float value, String vehicleBrand, String vehicleModel, int installments,
            String vehicleModelYear, String codeFipe, float vehicleFipeValue) {
        setType(type);
        setValue(value);
        setVehicleBrand(vehicleBrand);
        setVehicleModel(vehicleModelYear);
        setInstallments(installments);
        setVehicleModelYear(vehicleModelYear);
        setCodeFipe(codeFipe);
        setVehicleFipeValue(vehicleFipeValue);
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
    public String getVehicleBrand() {
        return vehicleBrand;
    }
    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }
    public String getVehicleModel() {
        return vehicleModel;
    }
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    public int getInstallments() {
        return installments;
    }
    public void setInstallments(int installments) {
        this.installments = installments;
    }
    public String getVehicleModelYear() {
        return vehicleModelYear;
    }
    public void setVehicleModelYear(String vehicleModelYear) {
        this.vehicleModelYear = vehicleModelYear;
    }
    public String getCodeFipe() {
        return codeFipe;
    }
    public void setCodeFipe(String codeFipe) {
        this.codeFipe = codeFipe;
    }
    public float getVehicleFipeValue() {
        return vehicleFipeValue;
    }
    public void setVehicleFipeValue(float vehicleFipeValue) {
        this.vehicleFipeValue = vehicleFipeValue;
    }
}
