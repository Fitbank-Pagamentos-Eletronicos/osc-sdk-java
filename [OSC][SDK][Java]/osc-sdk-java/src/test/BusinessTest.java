package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.Business;
import domains.City;
import domains.EmploymentSince;
import domains.Occupation;
import domains.Profession;
import domains.State;

public class BusinessTest {
    public static void main(String[] args) throws JsonProcessingException {
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
        City city = new City("cidade");

        Business business = new Business(occupation, profession, companyName, phone, income, employmentSince, payday, benefitNumber, zipCode, adress, number, complement, district, state, city);

        System.out.println(business);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(business);
        System.out.println(s);
        System.out.println("_______");
        
        Business newBusiness = new ObjectMapper().readValue(s, Business.class);
        System.out.println(newBusiness);
    }
}
