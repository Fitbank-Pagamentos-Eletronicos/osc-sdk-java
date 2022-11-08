package domains;

public class Proposals {
    private Loan loan;
    private Card card;
    private Auto auto;
    private Home home;

    public Proposals(Loan loan, Card card, Auto auto, Home home) {
        setLoan(loan);
        setCard(card);
        setAuto(auto);
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
