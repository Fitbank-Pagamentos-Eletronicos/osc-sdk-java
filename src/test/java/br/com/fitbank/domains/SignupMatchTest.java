package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.*;
import br.com.fitbank.domains.enumerator.*;
import br.com.fitbank.domains.requests.SignupRequest;
import br.com.fitbank.utils.JSON;




public class SignupMatchTest {
    public static void main(String[] args) {
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
        boolean hasRestriction = true;
        boolean hasOwnHouse = true;
        boolean hasVehicle = true;
        boolean hasAndroid = true;
        ProductHome productHome = new ProductHome(ProductType.REFINANCING_HOME, 12034, 23231, RealEstateType.apartment, 43434, 112222);
        Products[] products = new Products[]{new Products(productHome)};
        LogData logData = new LogData(1111, 2222, "ocourrence Date", "User Agent", "ip", "email");

        SignupRequest signupRequest = new SignupRequest(cpf, name, birthday, email, phone, zipCode, education, banks, occupation, income, hasCreditCard, hasRestriction, hasOwnHouse, hasVehicle, hasAndroid, products, logData);

        System.out.println(signupRequest);
        System.out.println("_______");

        String s = JSON.getGson().toJson(signupRequest);
        System.out.println(s);
        System.out.println("_______");

        SignupRequest newSignupRequest = JSON.getGson().fromJson(s, SignupRequest.class);
        System.out.println(newSignupRequest);
    }
}
