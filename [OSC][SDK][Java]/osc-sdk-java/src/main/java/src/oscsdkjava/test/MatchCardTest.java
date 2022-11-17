package src.oscsdkjava.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.oscsdkjava.domains.MatchCard;
import src.oscsdkjava.domains.Network;

public class MatchCardTest {
    public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
        
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
