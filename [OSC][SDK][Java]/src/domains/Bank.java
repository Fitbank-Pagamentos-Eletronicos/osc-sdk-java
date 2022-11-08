package domains;

public class Bank {
    private Banks bank;
    private AccountType type;
    private String agency;
    private String account;
    
    public Bank(Banks bank, AccountType type, String agency, String account) {
        setBank(bank);
        setType(type);
        setAgency(agency);
        setAccount(account);
    }

    public Banks getBank() {
        return bank;
    }
    public void setBank(Banks bank) {
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
