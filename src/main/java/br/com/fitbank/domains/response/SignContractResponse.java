package br.com.fitbank.domains.response;

import java.io.Serializable;

public class SignContractResponse implements Serializable{
    private String aceptedCheckSum;

    public SignContractResponse(){

    }
    public SignContractResponse(String aceptedCheckSum){
        setAceptedCheckSum(aceptedCheckSum);
    }

    public String getAceptedCheckSum() {
        return aceptedCheckSum;
    }

    public void setAceptedCheckSum(String aceptedCheckSum) {
        this.aceptedCheckSum = aceptedCheckSum;
    }

}
