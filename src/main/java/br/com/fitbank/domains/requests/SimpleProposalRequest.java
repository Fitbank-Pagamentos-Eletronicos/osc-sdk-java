package br.com.fitbank.domains.requests;

import br.com.fitbank.domains.domains.*;
import br.com.fitbank.domains.enumerator.Gender;
import br.com.fitbank.domains.enumerator.Nationality;
import br.com.fitbank.domains.enumerator.RelationshipStatus;
import br.com.fitbank.domains.enumerator.State;

import java.io.Serializable;

public class SimpleProposalRequest implements Serializable{
    private String mother;
    private Gender gender;
    private Nationality nationality;
    private State hometownState;
    private RelationshipStatus relationshipStatus;
    private Identity identity;
    private Address address;
    private Business business;
    private ProductBankAccount products;
    
    public SimpleProposalRequest(){
        
    }
    public SimpleProposalRequest(String mother, Gender gender, Nationality nationality, State hometownState,
                                 RelationshipStatus relationshipStatus, Identity identity, Address address, Business business,
                                 ProductBankAccount products) {
        setMother(mother);
        setGender(gender);
        setNationality(nationality);
        setHometownState(hometownState);
        setRelationshipStatus(relationshipStatus);
        setIdentity(identity);
        setAddress(address);
        setBusiness(business);
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
    public Nationality getNationality() {
        return nationality;
    }
    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }
    public State getHometownState() {
        return hometownState;
    }
    public void setHometownState(State hometownState) {
        this.hometownState = hometownState;
    }
    public RelationshipStatus getRelationshipStatus() {
        return relationshipStatus;
    }
    public void setRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
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
    public Business getBusiness() {
        return business;
    }
    public void setBusiness(Business business) {
        this.business = business;
    }
    public ProductBankAccount getProducts() {
        return products;
    }
    public void setProducts(ProductBankAccount products) {
        this.products = products;
    }
}
