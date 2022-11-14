package test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



import domains.Vehicle;

@JsonIgnoreProperties
public class VehicleTest {
    public static void main(String[] args) throws JsonProcessingException {
        String license_plate = "licence plate test";

        Vehicle v = new Vehicle(license_plate);

        System.out.println(v);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(v);
        System.out.println(s);
        System.out.println("_______");
        
        Vehicle newVehicle = new ObjectMapper().readValue(s, Vehicle.class);
        System.out.println(newVehicle);
        System.out.println(newVehicle.getLicensePlate());
    }
}
