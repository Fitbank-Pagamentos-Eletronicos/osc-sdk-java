package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.MatchLoan;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatchLoanTest {
    @Test
    public void matchLoanTest(){
        Integer productId = 1111;
        String name = "name";
        String logo = "logo";
        Integer minValue = 2222;
        Integer maxValue = 3333;
        Integer minInstallment = 4444;
        Integer maxInstallment = 5555;
        float monthlyTax = 6666;

        MatchLoan matchLoan = new MatchLoan(productId, name, logo, minValue, maxValue, minInstallment, maxInstallment, monthlyTax);
        String s = JSON.getGson().toJson(matchLoan);
        MatchLoan newMatchLoan = JSON.getGson().fromJson(s, MatchLoan.class);
        assertNotNull(newMatchLoan);

    }
}
