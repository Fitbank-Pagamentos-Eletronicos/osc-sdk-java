package br.com.fitbank.domains;

import java.io.Serializable;

public class Bank implements Serializable{
    private String bank;
    private AccountType type;
    private String agency;
    private String account;
    
    public Bank(){
        
    }
    public Bank(String bank, AccountType type, String agency, String account) {
        setBank(bank);
        setType(type);
        setAgency(agency);
        setAccount(account);
    }

    public String getBank() {
        return bank;
    }
    public void setBank(String bank) {
        this.bank = bank;
    }
    public AccountType getType() {
        return type;
    }
    public void setType(AccountType type) {
        this.type = type;
    }
    public String getAgency() {
        return agency;
    }
    public void setAgency(String agency) {
        this.agency = agency;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
}
