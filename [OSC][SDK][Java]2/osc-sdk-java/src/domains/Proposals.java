package domains;

import java.io.Serializable;

public class Proposals implements Serializable{
    private Loan loan;
    private Card card;
    private Auto auto;
    private Home home;

    public Proposals(){

    }

    public Proposals(Loan loan) {
        setLoan(loan);
    }
    public Proposals(Card card) {
        setCard(card);
    }
    public Proposals(Auto auto) {
        setAuto(auto);
    }
    public Proposals(Home home) {
        setHome(home);
    }

    public Loan getLoan() {
        return loan;
    }
    public void setLoan(Loan loan) {
        this.loan = loan;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    public Auto getAuto() {
        return auto;
    }
    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    public Home getHome() {
        return home;
    }
    public void setHome(Home home) {
        this.home = home;
    }
}
