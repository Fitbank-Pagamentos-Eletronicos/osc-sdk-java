package br.com.fitbank.domains.requests;

import br.com.fitbank.domains.domains.LogData;

import java.io.Serializable;
import java.util.InputMismatchException;

public class SimpleSignupRequest implements Serializable{
    
    private String cpf;
    private String name;
    private String birthday;
    private String email;
    private String phone;
    private String zipCode;
    private boolean hasCreditCard;
    private boolean hasRestriction;
    private boolean hasOwnHouse;
    private boolean hasVehicle;
    private boolean hasAndroid;
    private LogData logData;


 
    public SimpleSignupRequest(){
        
    }

    public SimpleSignupRequest(String cpf, String name, String birthday, String email, String phone, String zipCode, boolean hasCreditCard, boolean hasRestriction, boolean hasOwnHouse, boolean hasVehicle, boolean hasAndroid, LogData logData) {
        setCpf(cpf);
        setName(name);
        setBirthday(birthday);
        setEmail(email);
        setPhone(phone);
        setZipCode(zipCode);
        setHasCreditCard(hasCreditCard);
        setHasRestriction(hasRestriction);
        setHasOwnHouse(hasOwnHouse);
        setHasVehicle(hasVehicle);
        setHasAndroid(hasAndroid);
        setLogData(logData);
    }
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        if(isCPF(cpf)){
            this.cpf = cpf;
        }
        else{
            //erro 
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.length() <= 100){
            this.name = name;
        }
        else{
            //erro
        }
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
   //     Date verificardor = birthday.format("yyyy-MM-dd	", birthday);
        this.birthday = birthday;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        if(isValidEmailAddress(email)){
            this.email = email;
        }
        else{
            //erro
        }
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public boolean isHasCreditCard() {
        return hasCreditCard;
    }

    public void setHasCreditCard(boolean hasCreditCard) {
        this.hasCreditCard = hasCreditCard;
    }


    public boolean isHasRestriction() {
        return hasRestriction;
    }

    public void setHasRestriction(boolean hasRestriction) {
        this.hasRestriction = hasRestriction;
    }

    public boolean isHasOwnHouse() {
        return hasOwnHouse;
    }

    public void setHasOwnHouse(boolean hasOwnHouse) {
        this.hasOwnHouse = hasOwnHouse;
    }
    
    
    public boolean isHasVehicle() {
        return hasVehicle;
    }

    public void setHasVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }

    
    public boolean isHasAndroid() {
        return hasAndroid;
    }

    public void setHasAndroid(boolean hasAndroid) {
        this.hasAndroid = hasAndroid;
    }

    public LogData getLogData() {
        return logData;
    }

    public void setLogData(LogData logData) {
        this.logData = logData;
    }
    
    


    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
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
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        
        try {
       
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
                num = CPF.charAt(i) - 48;
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); 

            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = CPF.charAt(i) - 48;
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);


            return (dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10));
        } catch (InputMismatchException erro) {
            return(false);
        }
    }

}