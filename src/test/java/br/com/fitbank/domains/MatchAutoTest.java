package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.MatchAuto;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatchAutoTest {
    @Test
    public void MatchAutoTest(){
        Integer productId = 1111;
        String name = "name";
        String logo = "logo";
        Integer minValue = 2222;
        Integer maxValue = 3333;
        Integer minInstallment = 4444;
        Integer maxInstallment = 5555;
        float monthlyTax = 6666;

        MatchAuto matchAuto = new MatchAuto(productId, name, logo, minValue, maxValue, minInstallment, maxInstallment, monthlyTax);

        String s = JSON.getGson().toJson(matchAuto);
        MatchAuto newMatchAuto = JSON.getGson().fromJson(s, MatchAuto.class);
        assertNotNull(newMatchAuto);

    }
}
