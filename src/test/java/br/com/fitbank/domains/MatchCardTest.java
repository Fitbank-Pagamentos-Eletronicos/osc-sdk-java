package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.MatchCard;
import br.com.fitbank.domains.enumerator.Network;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatchCardTest {
    @Test
    public void matchCardTest(){
        int productId = 1111;
        String name = "name";
        String logo = "logo";
        float annuity = 2222;
        Network network = Network.ELO;

        MatchCard matchCard = new MatchCard(productId, name, logo, annuity, network);
        String s = JSON.getGson().toJson(matchCard);
        MatchCard newMatchCard = JSON.getGson().fromJson(s, MatchCard.class);
        assertNotNull(newMatchCard);

    }
}
