package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MatchAutoTest {
    public static void main(String[] args) throws JsonProcessingException {
        Integer productId = 1111;
        String name = "name";
        String logo = "logo";
        Integer minValue = 2222;
        Integer maxValue = 3333;
        Integer minInstallment = 4444;
        Integer maxInstallment = 5555;
        float monthlyTax = 6666;

        MatchAuto matchAuto = new MatchAuto(productId, name, logo, minValue, maxValue, minInstallment, maxInstallment, monthlyTax);

        System.out.println(matchAuto);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(matchAuto);
        System.out.println(s);
        System.out.println("_______");

        MatchAuto newMatchAuto = new ObjectMapper().readValue(s, MatchAuto.class);
        System.out.println(newMatchAuto);

    }
}
