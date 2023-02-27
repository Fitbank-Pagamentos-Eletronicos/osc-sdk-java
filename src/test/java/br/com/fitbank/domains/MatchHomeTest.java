package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.MatchHome;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatchHomeTest {
    @Test
    public void matchHomeTest(){
        Integer productId = 1111;
        String name = "name";
        String logo = "logo";
        Integer minValue = 2222;
        Integer maxValue = 3333;
        Integer minInstallment = 4444;
        Integer maxInstallment = 5555;
        float monthlyTax = 6666;

        MatchHome matchHome = new MatchHome(productId, name, logo, minValue, maxValue, minInstallment, maxInstallment, monthlyTax);
        String s = JSON.getGson().toJson(matchHome);
        MatchHome newMatchHome = JSON.getGson().fromJson(s, MatchHome.class);
        assertNotNull(newMatchHome);

    }
}
