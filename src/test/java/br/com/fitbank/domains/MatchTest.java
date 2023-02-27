package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.*;
import br.com.fitbank.domains.enumerator.Network;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class MatchTest {
    @Test
    public void matchTest(){
        MatchLoan matchLoan = new MatchLoan(1111, "name", "logo", 2222, 3333, 4444, 5555, 6666);
        MatchCard matchCard = new MatchCard(1111, "name", "logo", 2222, Network.ELO);
        MatchAuto matchAuto = new MatchAuto(1111, "name", "logo", 2222, 3333, 4444, 5555, 6666);
        MatchHome matchHome = new MatchHome(1111, "name", "logo", 2222, 3333, 4444, 5555, 6666);

        Match matchL = new Match(matchLoan);
        Match matchC = new Match(matchCard);
        Match matchA = new Match(matchAuto);
        Match matchH = new Match(matchHome);
        String sL = JSON.getGson().toJson(matchL);
        String sC = JSON.getGson().toJson(matchC);
        String sA = JSON.getGson().toJson(matchA);
        String sH = JSON.getGson().toJson(matchH);
        Match newMatchL = JSON.getGson().fromJson(sL, Match.class);
        Match newMatchC = JSON.getGson().fromJson(sC, Match.class);
        Match newMatchA = JSON.getGson().fromJson(sA, Match.class);
        Match newMatchH = JSON.getGson().fromJson(sH, Match.class);
        assertNotNull(newMatchL);
        assertNotNull(newMatchC);
        assertNotNull(newMatchA);
        assertNotNull(newMatchH);

    }
}
