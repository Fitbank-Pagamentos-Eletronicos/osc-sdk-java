package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;

public class CityTest {
    public static void main(String[] args) {
        String city2 = "city";
        City city = new City(city2);

        System.out.println(city);
        System.out.println("_______");

        String s = JSON.getGson().toJson(city);
        System.out.println(s);
        System.out.println("_______");

        City newCity = JSON.getGson().fromJson(s, City.class);
        System.out.println(newCity);
    }
}
