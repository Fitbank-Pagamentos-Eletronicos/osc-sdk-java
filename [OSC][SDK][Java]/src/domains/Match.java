package domains;

import java.io.Serializable;

public class Match implements Serializable{
    private MatchLoan matchLoan;
    private MatchCard matchCard;
    private MatchAuto matchAuto;
    private MatchHome matchHome;


    public Match(MatchLoan matchLoan, MatchCard matchCard, MatchAuto matchAuto, MatchHome matchHome) {
        setMatchLoan(matchLoan);
        setMatchCard(matchCard);
        setMatchAuto(matchAuto);
        setMatchHome(matchHome);
    }


    public MatchLoan getMatchLoan() {
        return matchLoan;
    }
    public void setMatchLoan(MatchLoan matchLoan) {
        this.matchLoan = matchLoan;
    }
    public MatchCard getMatchCard() {
        return matchCard;
    }
    public void setMatchCard(MatchCard matchCard) {
        this.matchCard = matchCard;
    }
    public MatchAuto getMatchAuto() {
        return matchAuto;
    }
    public void setMatchAuto(MatchAuto matchAuto) {
        this.matchAuto = matchAuto;
    }
    public MatchHome getMatchHome() {
        return matchHome;
    }
    public void setMatchHome(MatchHome matchHome) {
        this.matchHome = matchHome;
    }
}
