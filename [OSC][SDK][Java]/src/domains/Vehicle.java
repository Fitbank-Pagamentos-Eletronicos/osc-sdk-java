package domains;

import java.io.Serializable;

public class Vehicle implements Serializable{
    private String licensePlate;

    public Vehicle(String licensePlate){
        setLicensePlate(licensePlate);
    }

    public String getLicenseplate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
