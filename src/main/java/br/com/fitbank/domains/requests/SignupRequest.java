package br.com.fitbank.domains.requests;

import br.com.fitbank.domains.domains.*;
import br.com.fitbank.domains.enumerator.Banks;
import br.com.fitbank.domains.enumerator.Education;
import br.com.fitbank.domains.enumerator.Occupation;

import java.io.Serializable;
import java.util.InputMismatchException;

public class SignupRequest extends SimpleSignupRequest implements Serializable {


    private Education education;
    private Banks banks;
    private Occupation occupation;
    private float income;
    private Products[] products;
    public SignupRequest() {

    }
    public SignupRequest(String cpf, String name, String birthday, String email, String phone, String zipCode, Education education, Banks banks, Occupation occupation, float income, boolean hasCreditCard, boolean hasRestriction, boolean hasOwnHouse, boolean hasVehicle, boolean hasAndroid, Products[] products, LogData logData) {
        setCpf(cpf);
        setName(name);
        setBirthday(birthday);
        setEmail(email);
        setPhone(phone);
        setZipCode(zipCode);
        setEducation(education);
        setBanks(banks);
        setOccupation(occupation);
        setIncome(income);
        setHasCreditCard(hasCreditCard);
        setHasRestriction(hasRestriction);
        setHasOwnHouse(hasOwnHouse);
        setHasVehicle(hasVehicle);
        setHasAndroid(hasAndroid);
        setProducts(products);
        setLogData(logData);

    }
    public Banks getBanks() {
        return banks;
    }

    public void setBanks(Banks banks) {

        this.banks = banks;
    }
    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {

        this.occupation = occupation;
    }
    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }
    public Products[] getProducts() {
        return products;

    }
    public void setProducts(Products[] products) {
        this.products = products;

    }
    public static boolean isCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
                CPF.equals("11111111111") ||
                CPF.equals("22222222222") || CPF.equals("33333333333") ||
                CPF.equals("44444444444") || CPF.equals("55555555555") ||
                CPF.equals("66666666666") || CPF.equals("77777777777") ||
                CPF.equals("88888888888") || CPF.equals("99999999999") ||
                (CPF.length() != 11))
            return (false);

        char dig10, dig11;
        int sm, i, r, num, peso;


        try {

            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                num = CPF.charAt(i) - 48;
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char) (r + 48);

            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = CPF.charAt(i) - 48;
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else dig11 = (char) (r + 48);


            return (dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10));
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

}