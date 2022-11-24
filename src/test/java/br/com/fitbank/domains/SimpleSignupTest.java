package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SimpleSignupTest {
    public static void main(String[] args) throws JsonProcessingException {

        String cpf = "01992586357";
        String name = "nome";
        String birthday = "10112022";
        String email = "email@gmail.com";
        String phone = "88999999999";
        String zipCode = "zipcode";
        boolean hasCreditCard = true;
        boolean hasRestriction = true;
        boolean hasOwnHouse = true;
        boolean hasVehicle = true;
        boolean hasAndroid = true;
        LogData logData = new LogData(0, 0, "ocourrence date", "user Agent", "ip ip ip", "mac mac mac");

        SimpleSignup S = new SimpleSignup(cpf, name, birthday, email, phone, zipCode, hasCreditCard, hasRestriction, hasOwnHouse, hasVehicle, hasAndroid, logData);

        System.out.println(S);
        System.out.println(S.getLogData());
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(S);
        System.out.println(s);
        System.out.println("_______");

        SimpleSignup newS = new ObjectMapper().readValue(s, SimpleSignup.class);
        System.out.println(newS);
        System.out.println(newS.getCpf());
        System.out.println(newS.getName());
        System.out.println(newS.getBirthday());
        System.out.println(newS.getEmail());
        System.out.println(newS.getPhone());
        System.out.println(newS.getZipCode());
        System.out.println(newS.isHasCreditCard());
        System.out.println(newS.isHasRestriction());
        System.out.println(newS.isHasOwnHouse());
        System.out.println(newS.isHasVehicle());
        System.out.println(newS.isHasAndroid());
        System.out.println(newS.getLogData());
        System.out.println(newS.getLogData().getIp());
        System.out.println(newS.getLogData().getLatitude());
        System.out.println(newS.getLogData().getLongitude());
        System.out.println(newS.getLogData().getMac());
        System.out.println(newS.getLogData().getOcourrenceDate());
        System.out.println(newS.getLogData().getUserAgent());


    }

}
