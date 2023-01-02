package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank("001", AccountType.CONTA_CORRENTE_CONJUNTA, "agency", "account");
        System.out.println(bank);
        System.out.println("_______");

        String s = JSON.getGson().toJson(bank);
        System.out.println(s);
        System.out.println("_______");

        Bank newBank = JSON.getGson().fromJson(s, Bank.class);
        System.out.println(newBank);
    }
}
