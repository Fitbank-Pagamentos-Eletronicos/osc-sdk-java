package br.com.fitbank.domains;

import java.io.Serializable;

public class Address implements Serializable {
    private String zipCode;
    private String address;
    private String complement;
    private String district;
    private State state;
    private City city;
    private HomeType homeType;
    private HomeSince homeSince;

    public Address(){
        
    }
    public Address(String zipCode, String address, String complement, String district, State state, City city,
            HomeType homeType, HomeSince homeSince) {
        setZipCode(zipCode);
        setAddress(address);
        setComplement(complement);
        setDistrict(district);
        setState(state);
        setCity(city);
        setHomeType(homeType);
        setHomeSince(homeSince);
    }

    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getComplement() {
        return complement;
    }
    public void setComplement(String complement) {
        this.complement = complement;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    public HomeType getHomeType() {
        return homeType;
    }
    public void setHomeType(HomeType homeType) {
        this.homeType = homeType;
    }
    public HomeSince getHomeSince() {
        return homeSince;
    }
    public void setHomeSince(HomeSince homeSince) {
        this.homeSince = homeSince;
    }
}
