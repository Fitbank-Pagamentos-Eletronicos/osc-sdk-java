package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Vehicle;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class VehicleTest {
    @Test
    public void authTest(){
        String license_plate = "licence plate test";

        Vehicle v = new Vehicle(license_plate);
        String s = JSON.getGson().toJson(v);
        Vehicle newVehicle = JSON.getGson().fromJson(s, Vehicle.class);
        assertNotNull(newVehicle);

    }
}
