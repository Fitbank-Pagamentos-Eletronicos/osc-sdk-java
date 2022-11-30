package br.com.fitbank.domains;




import br.com.fitbank.utils.JSON;
public class MatchLoanTest {
    public static void main(String[] args) {
        Integer productId = 1111;
        String name = "name";
        String logo = "logo";
        Integer minValue = 2222;
        Integer maxValue = 3333;
        Integer minInstallment = 4444;
        Integer maxInstallment = 5555;
        float monthlyTax = 6666;

        MatchLoan matchLoan = new MatchLoan(productId, name, logo, minValue, maxValue, minInstallment, maxInstallment, monthlyTax);

        System.out.println(matchLoan);
        System.out.println("_______");

        String s = JSON.getGson().toJson(matchLoan);
        System.out.println(s);
        System.out.println("_______");

        MatchLoan newMatchLoan = JSON.getGson().fromJson(s, MatchLoan.class);
        System.out.println(newMatchLoan);
    }
}
