package src.oscsdkjava.domains;

import java.io.Serializable;

public class City implements Serializable{
    private String city;

    public City(){
        
    }

    public City(String city) {
        setCity(city);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
