package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.ConsumerUnit;
import br.com.fitbank.utils.JSON;

public class ConsumerUnitTest {
    public static void main(String[] args) {
        String number = "number";

        ConsumerUnit consumerUnit = new ConsumerUnit(number);

        System.out.println(consumerUnit);
        System.out.println("_______");

        String s = JSON.getGson().toJson(consumerUnit);
        System.out.println(s);
        System.out.println("_______");

        ConsumerUnit newConsumerUnit = JSON.getGson().fromJson(s, ConsumerUnit.class);
        System.out.println(newConsumerUnit);
    }
}
