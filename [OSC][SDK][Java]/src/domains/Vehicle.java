package domains;

public class Vehicle {
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
