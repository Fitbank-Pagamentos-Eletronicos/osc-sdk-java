package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Bank;
import br.com.fitbank.domains.enumerator.AccountType;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    @Test
    public void bankTest(){
        Bank bank = new Bank("001", AccountType.CONTA_CORRENTE_CONJUNTA, "agency", "account");
        String s = JSON.getGson().toJson(bank);
        Bank newBank = JSON.getGson().fromJson(s, Bank.class);
        assertNotNull(newBank);

    }
}
