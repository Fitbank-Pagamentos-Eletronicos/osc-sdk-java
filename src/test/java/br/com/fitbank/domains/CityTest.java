package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.City;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CityTest {
    @Test
    public void cityTest(){
        String city2 = "city";
        City city = new City(city2);
        String s = JSON.getGson().toJson(city);
        City newCity = JSON.getGson().fromJson(s, City.class);
        assertNotNull(newCity);
    }
}
