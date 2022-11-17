package src.oscsdkjava.domains;

import java.io.Serializable;

public class SignContract implements Serializable{
    private String aceptedCheckSum;

    public SignContract(){

    }
    public SignContract(String aceptedCheckSum){
        setAceptedCheckSum(aceptedCheckSum);
    }

    public String getAceptedCheckSum() {
        return aceptedCheckSum;
    }

    public void setAceptedCheckSum(String aceptedCheckSum) {
        this.aceptedCheckSum = aceptedCheckSum;
    }

}
