package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MatchTest {
    public static void main(String[] args) throws JsonProcessingException {
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

        String sL = new ObjectMapper().writeValueAsString(matchL);
        String sC = new ObjectMapper().writeValueAsString(matchC);
        String sA = new ObjectMapper().writeValueAsString(matchA);
        String sH = new ObjectMapper().writeValueAsString(matchH);
        System.out.println(sL);
        System.out.println(sC);
        System.out.println(sA);
        System.out.println(sH);
        System.out.println("_______");

        Match newMatchL = new ObjectMapper().readValue(sL, Match.class);
        Match newMatchC = new ObjectMapper().readValue(sC, Match.class);
        Match newMatchA = new ObjectMapper().readValue(sA, Match.class);
        Match newMatchH = new ObjectMapper().readValue(sH, Match.class);
        System.out.println(newMatchL);
        System.out.println(newMatchC);
        System.out.println(newMatchA);
        System.out.println(newMatchH);


    }
}
