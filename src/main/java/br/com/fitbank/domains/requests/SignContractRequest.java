package br.com.fitbank.domains.requests;

import br.com.fitbank.domains.domains.LogData;

import java.io.Serializable;

public class SignContractRequest implements Serializable{
    
    private String[] aceptedCheckSum;
    private LogData logData;

    public SignContractRequest(){
        
    }
    public SignContractRequest(String[] acaceptedCheckSum, LogData logData){
        setAceptedCheckSum(acaceptedCheckSum);
        setLogData(logData);
    }

    public String[] getAceptedCheckSum() {
        return aceptedCheckSum;
    }
    public void setAceptedCheckSum(String aceptedCheckSum[]) {
        this.aceptedCheckSum = aceptedCheckSum;
    }
    
    public LogData getLogData() {
        return logData;
    }
    public void setLogData(LogData logData) {
        this.logData = logData;
    }

}
