package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.LogData;
import br.com.fitbank.domains.requests.SignContractRequest;
import br.com.fitbank.utils.JSON;

public class ContractTest {
    public static void main(String[] args) {
        String[] aceptedCheckSum = {"acepted check Sum"};
        LogData logData = new LogData(1111, 2222, "ocurrence Date", "User Agent", "ip", "mac");

        SignContractRequest signContractRequest = new SignContractRequest(aceptedCheckSum, logData);

        System.out.println(signContractRequest);
        System.out.println("_______");

        String s = JSON.getGson().toJson(signContractRequest);
        System.out.println(s);
        System.out.println("_______");

        SignContractRequest newSignContractRequest = JSON.getGson().fromJson(s, SignContractRequest.class);
        System.out.println(newSignContractRequest);
    }
}
