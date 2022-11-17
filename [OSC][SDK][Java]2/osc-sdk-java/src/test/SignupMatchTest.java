package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.Banks;
import domains.Education;
import domains.LogData;
import domains.Occupation;
import domains.ProductHome;
import domains.ProductType;
import domains.Products;
import domains.RealEstateType;
import domains.SignupMatch;

public class SignupMatchTest {
    public static void main(String[] args) throws JsonProcessingException {
        String cpf = "cpf";
        String name = "name";
        String birthday = "birthday";
        String email = "email";
        String phone = "phone";
        String zipCode = "zip code";
        Education education = Education.ENSINO_FUNDAMENTAL_COMPLETO;
        Banks banks = Banks.CODE_001;
        Occupation occupation = Occupation.APOSENTADO;
        float income = 2222;
        boolean hasCreditCard = true;
        boolean hasRestriction= true;
        boolean hasOwnHouse= true;
        boolean hasVehicle= true;
        boolean hasAndroid= true;
        ProductHome productHome = new ProductHome(ProductType.REFINANCING_HOME, 12034, 23231, RealEstateType.apartment, 43434, 112222);
        Products products = new Products(productHome);
        LogData logData = new LogData(1111, 2222, "ocourrence Date", "User Agent", "ip", "email");
    
        SignupMatch signupMatch = new SignupMatch(cpf, name, birthday, email, phone, zipCode, education, banks, occupation, income, hasCreditCard, hasRestriction, hasOwnHouse, hasVehicle, hasAndroid, products, logData);

        System.out.println(signupMatch);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(signupMatch);
        System.out.println(s);
        System.out.println("_______");
        
        SignupMatch newSignupMatch = new ObjectMapper().readValue(s, SignupMatch.class);
        System.out.println(newSignupMatch);
    }
}
