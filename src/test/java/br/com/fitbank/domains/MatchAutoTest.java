package br.com.fitbank.domains;




import br.com.fitbank.utils.JSON;

public class MatchAutoTest {
    public static void main(String[] args) {
        Integer productId = 1111;
        String name = "name";
        String logo = "logo";
        Integer minValue = 2222;
        Integer maxValue = 3333;
        Integer minInstallment = 4444;
        Integer maxInstallment = 5555;
        float monthlyTax = 6666;

        MatchAuto matchAuto = new MatchAuto(productId, name, logo, minValue, maxValue, minInstallment, maxInstallment, monthlyTax);

        System.out.println(matchAuto);
        System.out.println("_______");

        String s = JSON.getGson().toJson(matchAuto);
        System.out.println(s);
        System.out.println("_______");

        MatchAuto newMatchAuto = JSON.getGson().fromJson(s, MatchAuto.class);
        System.out.println(newMatchAuto);

    }
}
