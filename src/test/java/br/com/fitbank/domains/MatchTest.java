package br.com.fitbank.domains;



import br.com.fitbank.domains.domains.*;
import br.com.fitbank.domains.enumerator.Network;
import br.com.fitbank.utils.JSON;


public class MatchTest {
    public static void main(String[] args) {
        MatchLoan matchLoan = new MatchLoan(1111, "name", "logo", 2222, 3333, 4444, 5555, 6666);
        MatchCard matchCard = new MatchCard(1111, "name", "logo", 2222, Network.ELO);
        MatchAuto matchAuto = new MatchAuto(1111, "name", "logo", 2222, 3333, 4444, 5555, 6666);
        MatchHome matchHome = new MatchHome(1111, "name", "logo", 2222, 3333, 4444, 5555, 6666);

        Match matchL = new Match(matchLoan);
        Match matchC = new Match(matchCard);
        Match matchA = new Match(matchAuto);
        Match matchH = new Match(matchHome);

        System.out.println(matchL);
        System.out.println(matchC);
        System.out.println(matchA);
        System.out.println(matchH);
        System.out.println("_______");

        String sL = JSON.getGson().toJson(matchL);
        String sC = JSON.getGson().toJson(matchC);
        String sA = JSON.getGson().toJson(matchA);
        String sH = JSON.getGson().toJson(matchH);
        System.out.println(sL);
        System.out.println(sC);
        System.out.println(sA);
        System.out.println(sH);
        System.out.println("_______");

        Match newMatchL = JSON.getGson().fromJson(sL, Match.class);
        Match newMatchC = JSON.getGson().fromJson(sC, Match.class);
        Match newMatchA = JSON.getGson().fromJson(sA, Match.class);
        Match newMatchH = JSON.getGson().fromJson(sH, Match.class);
        System.out.println(newMatchL);
        System.out.println(newMatchC);
        System.out.println(newMatchA);
        System.out.println(newMatchH);


    }
}
