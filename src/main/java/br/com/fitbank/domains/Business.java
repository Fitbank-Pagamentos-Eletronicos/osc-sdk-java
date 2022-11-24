package br.com.fitbank.domains;

import java.io.Serializable;

public class Business implements Serializable{
    private Occupation occupation;
    private Profession profession;
    private String companyName;
    private String phone;
    private String income;
    private EmploymentSince employmentSince;
    private String payday;
    private String benefitNumber;
    private String zipCode;
    private String adress;
    private String number;
    private String complement;
    private String district;
    private State state;
    private City city;

    public Business(){
        
    }

    public Business(Occupation occupation, Profession profession, String companyName, String phone, String income,
            EmploymentSince employmentSince, String payday, String benefitNumber, String zipCode, String adress,
            String number, String complement, String district, State state, City city) {
        setOccupation(occupation);
        setProfession(profession);
        setCompanyName(companyName);
        setPhone(phone);
        setIncome(income);
        setEmploymentSince(employmentSince);
        setPayday(payday);
        setBenefitNumber(benefitNumber);
        setZipCode(zipCode);
        setAdress(adress);
        setNumber(number);
        setComplement(complement);
        setDistrict(district);
        setState(state);
        setCity(city);
    }

    public Occupation getOccupation() {
        return occupation;
    }
    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }
    public Profession getProfession() {
        return profession;
    }
    public void setProfession(Profession profession) {
        this.profession = profession;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getIncome() {
        return income;
    }
    public void setIncome(String income) {
        this.income = income;
    }
    public EmploymentSince getEmploymentSince() {
        return employmentSince;
    }
    public void setEmploymentSince(EmploymentSince employmentSince) {
        this.employmentSince = employmentSince;
    }
    public String getPayday() {
        return payday;
    }
    public void setPayday(String payday) {
        this.payday = payday;
    }
    public String getBenefitNumber() {
        return benefitNumber;
    }
    public void setBenefitNumber(String benefitNumber) {
        this.benefitNumber = benefitNumber;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getComplement() {
        return complement;
    }
    public void setComplement(String complement) {
        this.complement = complement;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }

}
