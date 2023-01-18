package br.com.fitbank.domains;



import br.com.fitbank.domains.domains.Identity;
import br.com.fitbank.domains.enumerator.IdentityIssuer;
import br.com.fitbank.domains.enumerator.IdentityType;
import br.com.fitbank.domains.enumerator.State;
import br.com.fitbank.utils.JSON;


public class IdentityTest {
    public static void main(String[] args) {
        Identity identity = new Identity(IdentityType.CARTEIRA_CRC, "number", IdentityIssuer.AERON, State.AC, "issuing date");

        System.out.println(identity);
        System.out.println("_______");

        String s = JSON.getGson().toJson(identity);
        System.out.println(s);
        System.out.println("_______");

        Identity newIdentity = JSON.getGson().fromJson(s, Identity.class);
        System.out.println(newIdentity);
    }
}
