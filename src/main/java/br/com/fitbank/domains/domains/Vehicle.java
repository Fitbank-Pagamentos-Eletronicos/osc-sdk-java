package br.com.fitbank.domains.domains;

import java.io.Serializable;

public class Vehicle implements Serializable{
    private String licensePlate;

    public Vehicle(){

    }

    public Vehicle(String licensePlate){
        setLicensePlate(licensePlate);
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
