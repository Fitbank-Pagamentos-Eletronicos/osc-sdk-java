package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;

public class AddressTest {
    public static void main(String[] args) {
        Address address = new Address("zip Code", "Address", "complement", "district", State.AC, new City("CIDADE"), HomeType.ALUGADA, HomeSince.MAIOR_2_ANOS);

        System.out.println(address);
        System.out.println("_______");

        String s = JSON.getGson().toJson(address);
        System.out.println(s);
        System.out.println("_______");

        Address newAddress = JSON.getGson().fromJson(s, Address.class);
        System.out.println(newAddress);

    }
}
