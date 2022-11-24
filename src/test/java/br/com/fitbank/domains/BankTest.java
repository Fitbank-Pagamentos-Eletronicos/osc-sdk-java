package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BankTest {
    public static void main(String[] args) throws JsonProcessingException {
        Bank bank = new Bank(Banks.CODE_001, AccountType.CONTA_CORRENTE_CONJUNTA, "agency", "account");
        System.out.println(bank);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(bank);
        System.out.println(s);
        System.out.println("_______");

        Bank newBank = new ObjectMapper().readValue(s, Bank.class);
        System.out.println(newBank);
    }
}
