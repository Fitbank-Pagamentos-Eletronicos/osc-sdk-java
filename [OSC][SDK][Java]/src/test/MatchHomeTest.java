package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.MatchHome;

public class MatchHomeTest {
    public static void main(String[] args) throws JsonProcessingException {
        Integer productId = 1111;
        String name = "name";
        String logo = "logo";
        Integer minValue = 2222;
        Integer maxValue = 3333;
        Integer minInstallment = 4444;
        Integer maxInstallment = 5555;
        float monthlyTax = 6666;

        MatchHome matchHome = new MatchHome(productId, name, logo, minValue, maxValue, minInstallment, maxInstallment, monthlyTax);      
        System.out.println(matchHome);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(matchHome);
        System.out.println(s);
        System.out.println("_______");
        
        MatchHome newMatchHome = new ObjectMapper().readValue(s, MatchHome.class);
        System.out.println(newMatchHome);
    }
}
