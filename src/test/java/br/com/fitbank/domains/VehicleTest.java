package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Vehicle;
import br.com.fitbank.utils.JSON;



public class VehicleTest {
    public static void main(String[] args) {
        String license_plate = "licence plate test";

        Vehicle v = new Vehicle(license_plate);

        System.out.println(v);
        System.out.println("_______");

        String s = JSON.getGson().toJson(v);
        System.out.println(s);
        System.out.println("_______");

        Vehicle newVehicle = JSON.getGson().fromJson(s, Vehicle.class);
        System.out.println(newVehicle);
        System.out.println(newVehicle.getLicensePlate());
    }
}
