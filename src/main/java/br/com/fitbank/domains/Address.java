package br.com.fitbank.domains;

import java.io.Serializable;

public class Address implements Serializable {
    private String zipCode;
    private String address;
    private String number;
    private String complement;
    private String district;
    private State state;
    private String city;
    private HomeType homeType;
    private HomeSince homeSince;

    public Address(){
        
    }
    public Address(String zipCode, String address,String number, String complement, String district, State state, String city,
            HomeType homeType, HomeSince homeSince) {
        setZipCode(zipCode);
        setAddress(address);
        setNumber(number);
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
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
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
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
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
