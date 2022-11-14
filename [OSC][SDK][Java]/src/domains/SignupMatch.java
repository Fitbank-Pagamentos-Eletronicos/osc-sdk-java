package domains;

import java.io.Serializable;
import java.util.InputMismatchException;

public class SignupMatch implements Serializable{
    
    private String cpf;
    private String name;
    private String birthday;
    private String email;
    private String phone;
    private String zipCode;
    private Education education;
    private Banks banks;
    private Occupation occupation;
    private float income;
    private boolean hasCreditCard;
    private boolean hasRestriction;
    private boolean hasOwnHouse;
    private boolean hasVehicle;
    private boolean hasAndroid;
    private Products products;
    private LogData logData;


    public SignupMatch(){
        
    }


    public SignupMatch(String cpf, String name, String birthday, String email, String phone, String zipCode, Education education, Banks banks, Occupation occupation, float income, boolean hasCreditCard,boolean hasRestriction, boolean hasOwnHouse, boolean hasVehicle, boolean hasAndroid, Products products, LogData logData) {
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
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
            this.email = email;
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

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
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
                num = (int)(CPF.charAt(i) - 48);
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
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
        } catch (InputMismatchException erro) {
            return(false);
        }
    }

}