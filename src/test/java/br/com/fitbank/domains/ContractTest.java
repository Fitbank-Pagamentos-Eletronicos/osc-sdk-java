package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;

public class ContractTest {
    public static void main(String[] args) {
        String[] aceptedCheckSum = {"acepted check Sum"};
        LogData logData = new LogData(1111, 2222, "ocurrence Date", "User Agent", "ip", "mac");

        Contract contract = new Contract(aceptedCheckSum, logData);

        System.out.println(contract);
        System.out.println("_______");

        String s = JSON.getGson().toJson(contract);
        System.out.println(s);
        System.out.println("_______");

        Contract newContract = JSON.getGson().fromJson(s, Contract.class);
        System.out.println(newContract);
    }
}
