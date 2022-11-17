package src.oscsdkjava.domains;

import java.io.Serializable;

public class Match implements Serializable{
    private MatchLoan matchLoan;
    private MatchCard matchCard;
    private MatchAuto matchAuto;
    private MatchHome matchHome;

    public Match(){
        
    }

    public Match( MatchCard matchCard) {        
        setMatchCard(matchCard);
        
    }
    public Match(MatchLoan matchLoan) {
        setMatchLoan(matchLoan);
        
    }

    public Match( MatchAuto matchAuto) {        
        setMatchAuto(matchAuto);
        
    }

    public Match(MatchHome matchHome) {
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
