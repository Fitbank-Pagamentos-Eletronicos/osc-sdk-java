package src.oscsdkjava.domains;

import java.io.Serializable;

public class Proposal implements Serializable{
    private String mother;
    private Gender gender;
    private State hometownState;
    private City hometown;
    private Education education;
    private RelationshipStatus relationshipStatus;
    private String phoneLandline;
    private Identity identity;
    private Address address;
    private Vehicle vehicle;
    private ConsumerUnit consumerUnit;
    private Business business;
    private Bank bank;
    private Reference reference;
    private Products products;

    public Proposal(){
        
    }
    public Proposal(String mother, Gender gender, State hometownState, City hometown, Education education,
            RelationshipStatus relationshipStatus, String phoneLandline, Identity identity, Address address,
            Vehicle vehicle, ConsumerUnit consumerUnit, Business business, Bank bank, Reference reference,
            Products products) {
        setMother(mother);
        setGender(gender);
        setHometown(hometown);
        setHometownState(hometownState);
        setEducation(education);
        setRelationshipStatus(relationshipStatus);
        setPhoneLandline(phoneLandline);
        setIdentity(identity);
        setAddress(address);
        setVehicle(vehicle);
        setConsumerUnit(consumerUnit);
        setBusiness(business);
        setBank(bank);
        setReference(reference);
        setProducts(products);
    }

    public String getMother() {
        return mother;
    }
    public void setMother(String mother) {
        this.mother = mother;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public State getHometownState() {
        return hometownState;
    }
    public void setHometownState(State hometownState) {
        this.hometownState = hometownState;
    }
    public City getHometown() {
        return hometown;
    }
    public void setHometown(City hometown) {
        this.hometown = hometown;
    }
    public Education getEducation() {
        return education;
    }
    public void setEducation(Education education) {
        this.education = education;
    }
    public RelationshipStatus getRelationshipStatus() {
        return relationshipStatus;
    }
    public void setRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }
    public String getPhoneLandline() {
        return phoneLandline;
    }
    public void setPhoneLandline(String phoneLandline) {
        this.phoneLandline = phoneLandline;
    }
    public Identity getIdentity() {
        return identity;
    }
    public void setIdentity(Identity identity) {
        this.identity = identity;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public ConsumerUnit getConsumerUnit() {
        return consumerUnit;
    }
    public void setConsumerUnit(ConsumerUnit consumerUnit) {
        this.consumerUnit = consumerUnit;
    }
    public Business getBusiness() {
        return business;
    }
    public void setBusiness(Business business) {
        this.business = business;
    }
    public Bank getBank() {
        return bank;
    }
    public void setBank(Bank bank) {
        this.bank = bank;
    }
    public Reference getReference() {
        return reference;
    }
    public void setReference(Reference reference) {
        this.reference = reference;
    }
    public Products getProducts() {
        return products;
    }
    public void setProducts(Products products) {
        this.products = products;
    }

}
