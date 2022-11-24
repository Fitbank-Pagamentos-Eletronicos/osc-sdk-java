package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MatchCardTest {
    public static void main(String[] args) throws JsonProcessingException {

        int productId = 1111;
        String name = "name";
        String logo = "logo";
        float annuity = 2222;
        Network network = Network.ELO;

        MatchCard matchCard = new MatchCard(productId, name, logo, annuity, network);

        System.out.println(matchCard);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(matchCard);
        System.out.println(s);
        System.out.println("_______");

        MatchCard newMatchCard = new ObjectMapper().readValue(s, MatchCard.class);
        System.out.println(newMatchCard);
    }
}
