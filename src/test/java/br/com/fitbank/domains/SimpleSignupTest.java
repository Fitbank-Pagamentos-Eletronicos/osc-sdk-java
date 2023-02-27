package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.LogData;
import br.com.fitbank.domains.requests.SimpleSignupRequest;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class SimpleSignupTest {
    @Test
    public void authTest(){
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

        SimpleSignupRequest S = new SimpleSignupRequest(cpf, name, birthday, email, phone, zipCode, hasCreditCard, hasRestriction, hasOwnHouse, hasVehicle, hasAndroid, logData);

        String s = JSON.getGson().toJson(S);
        SimpleSignupRequest newS = JSON.getGson().fromJson(s, SimpleSignupRequest.class);
        assertNotNull(newS);

    }


}
