package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.MatchLoan;

public class MatchLoanTest {
    public static void main(String[] args) throws JsonProcessingException {
        Integer productId = 1111;
        String name = "name";
        String logo = "logo";
        Integer minValue = 2222;
        Integer maxValue = 3333;
        Integer minInstallment = 4444;
        Integer maxInstallment = 5555;
        float monthlyTax = 6666;

        MatchLoan matchLoan = new MatchLoan(productId, name, logo, minValue, maxValue, minInstallment, maxInstallment, monthlyTax);

        System.out.println(matchLoan);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(matchLoan);
        System.out.println(s);
        System.out.println("_______");
        
        MatchLoan newMatchLoan = new ObjectMapper().readValue(s, MatchLoan.class);
        System.out.println(newMatchLoan);
    }
}
