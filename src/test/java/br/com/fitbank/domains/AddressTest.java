package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Address;
import br.com.fitbank.domains.enumerator.HomeSince;
import br.com.fitbank.domains.enumerator.HomeType;
import br.com.fitbank.domains.enumerator.State;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AddressTest {

    @Test
    public void addressTest(){
        Address address = new Address("zip Code", "Address","2", "complement", "district", State.AC, "CIDADE", HomeType.ALUGADA, HomeSince.MAIOR_2_ANOS);
        String s = JSON.getGson().toJson(address);
        Address newAddress = JSON.getGson().fromJson(s, Address.class);
        assertNotNull(newAddress);

    }

}
