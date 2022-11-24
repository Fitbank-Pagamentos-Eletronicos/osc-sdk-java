package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class CityTest {
    public static void main(String[] args) throws JsonProcessingException {
        String city2 = "city";
        City city = new City(city2);

        System.out.println(city);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(city);
        System.out.println(s);
        System.out.println("_______");

        City newCity = new ObjectMapper().readValue(s, City.class);
        System.out.println(newCity);
    }
}
