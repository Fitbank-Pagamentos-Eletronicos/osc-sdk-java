package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.BorrowerInfo;
import br.com.fitbank.utils.JSON;


public class BorrowerInfoTest {
    public static void main(String[] args) {
        BorrowerInfo borrowerInfo = new BorrowerInfo(true, false);

        System.out.println(borrowerInfo);
        System.out.println("_______");

        String s = JSON.getGson().toJson(borrowerInfo);
        System.out.println(s);
        System.out.println("_______");

        BorrowerInfo newBorrowerInfo = JSON.getGson().fromJson(s, BorrowerInfo.class);
        System.out.println(newBorrowerInfo);
        System.out.println(newBorrowerInfo.isRegistred());
        System.out.println(newBorrowerInfo.isBlocked());

    }
}
