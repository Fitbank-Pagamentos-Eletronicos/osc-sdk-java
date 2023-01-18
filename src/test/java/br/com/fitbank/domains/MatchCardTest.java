package br.com.fitbank.domains;




import br.com.fitbank.domains.domains.MatchCard;
import br.com.fitbank.domains.enumerator.Network;
import br.com.fitbank.utils.JSON;

public class MatchCardTest {
    public static void main(String[] args) {

        int productId = 1111;
        String name = "name";
        String logo = "logo";
        float annuity = 2222;
        Network network = Network.ELO;

        MatchCard matchCard = new MatchCard(productId, name, logo, annuity, network);

        System.out.println(matchCard);
        System.out.println("_______");

        String s = JSON.getGson().toJson(matchCard);
        System.out.println(s);
        System.out.println("_______");

        MatchCard newMatchCard = JSON.getGson().fromJson(s, MatchCard.class);
        System.out.println(newMatchCard);
    }
}
