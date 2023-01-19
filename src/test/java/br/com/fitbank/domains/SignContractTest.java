package br.com.fitbank.domains;


import br.com.fitbank.domains.response.SignContractResponse;
import br.com.fitbank.utils.JSON;



public class SignContractTest {
    public static void main(String[] args) {
        SignContractResponse signContractResponse = new SignContractResponse("ACEPTED CHECK SUM");

        System.out.println(signContractResponse);
        System.out.println("_______");

        String S = JSON.getGson().toJson(signContractResponse);
        System.out.println(S);
        System.out.println("_______");

        SignContractResponse newS = JSON.getGson().fromJson(S, SignContractResponse.class);
        System.out.println(newS);
        System.out.println(newS.getAceptedCheckSum());

    }
}
