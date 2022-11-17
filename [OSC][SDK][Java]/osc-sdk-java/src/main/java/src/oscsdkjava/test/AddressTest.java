package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.Address;
import src.oscsdkjava.domains.City;
import src.oscsdkjava.domains.HomeSince;
import src.oscsdkjava.domains.HomeType;
import src.oscsdkjava.domains.State;

public class AddressTest {
    public static void main(String[] args) throws JsonProcessingException {
        Address address = new Address("zip Code", "Address", "complement", "district", State.AC, new City("CIDADE"), HomeType.ALUGADA, HomeSince.MAIOR_2_ANOS);
        
        System.out.println(address);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(address);
        System.out.println(s);
        System.out.println("_______");
        
        Address newAddress = new ObjectMapper().readValue(s, Address.class);
        System.out.println(newAddress);
    
    }
}
