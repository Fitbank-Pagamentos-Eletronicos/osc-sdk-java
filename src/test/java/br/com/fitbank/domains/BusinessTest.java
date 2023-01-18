package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.*;
import br.com.fitbank.domains.enumerator.EmploymentSince;
import br.com.fitbank.domains.enumerator.Occupation;
import br.com.fitbank.domains.enumerator.Profession;
import br.com.fitbank.domains.enumerator.State;
import br.com.fitbank.utils.JSON;

public class BusinessTest {
    public static void main(String[] args) {
        Occupation occupation = Occupation.APOSENTADO;
        Profession profession = Profession.ACOUGUEIRO;
        String companyName = "company name";
        String phone = "phone";
        String income = "income";
        EmploymentSince employmentSince = EmploymentSince.BETWEEN_FIVE_AND_TEN_YEARS;
        String payday = "payday";
        String benefitNumber = "benefit number";
        String zipCode = "zip code";
        String adress = "adress";
        String number = "number";
        String complement = "complement";
        String district = "district";
        State state = State.AC;
        String city = "cidade";

        Business business = new Business(occupation, profession, companyName, phone, income, payday, benefitNumber, zipCode, adress, number, complement, district, state, city);

        System.out.println(business);
        System.out.println("_______");

        String s = JSON.getGson().toJson(business);
        System.out.println(s);
        System.out.println("_______");

        Business newBusiness = JSON.getGson().fromJson(s, Business.class);
        System.out.println(newBusiness);
    }
}
