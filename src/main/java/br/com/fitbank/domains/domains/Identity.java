package br.com.fitbank.domains.domains;

import br.com.fitbank.domains.enumerator.IdentityIssuer;
import br.com.fitbank.domains.enumerator.IdentityType;
import br.com.fitbank.domains.enumerator.State;

import java.io.Serializable;

public class Identity implements Serializable{
    private IdentityType type;
    private String number;
    private IdentityIssuer issuer;
    private State state;
    private String issuingDate;
    
    public Identity(){
        
    }
    public Identity(IdentityType type, String number, IdentityIssuer issuer, State state, String issuingDate) {
        setType(type);
        setNumber(number);
        setIssuer(issuer);
        setState(state);
        setIssuingDate(issuingDate);
    }

    public IdentityType getType() {
        return type;
    }
    public void setType(IdentityType type) {
        this.type = type;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public IdentityIssuer getIssuer() {
        return issuer;
    }
    public void setIssuer(IdentityIssuer issuer) {
        this.issuer = issuer;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public String getIssuingDate() {
        return issuingDate;
    }
    public void setIssuingDate(String issuingDate) {
        this.issuingDate = issuingDate;
    }

}
