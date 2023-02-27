package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.ConsumerUnit;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConsumerUnitTest {
    @Test
    public void consumerUnitTest(){
        String number = "number";

        ConsumerUnit consumerUnit = new ConsumerUnit(number);
        String s = JSON.getGson().toJson(consumerUnit);
        ConsumerUnit newConsumerUnit = JSON.getGson().fromJson(s, ConsumerUnit.class);
        assertNotNull(newConsumerUnit);

    }
}
