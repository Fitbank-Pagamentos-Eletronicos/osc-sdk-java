package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;



public class SignContractTest {
    public static void main(String[] args) {
        SignContract signContract = new SignContract("ACEPTED CHECK SUM");

        System.out.println(signContract);
        System.out.println("_______");

        String S = JSON.getGson().toJson(signContract);
        System.out.println(S);
        System.out.println("_______");

        SignContract newS = JSON.getGson().fromJson(S, SignContract.class);
        System.out.println(newS);
        System.out.println(newS.getAceptedCheckSum());

    }
}
