package src.oscsdkjava.domains;

import java.io.Serializable;

public class Contract implements Serializable{
    
    private String aceptedCheckSum;
    private LogData logData;

    public Contract(){
        
    }
    public Contract(String acaceptedCheckSum, LogData logData){
        setAceptedCheckSum(acaceptedCheckSum);
        setLogData(logData);
    }

    public String getAceptedCheckSum() {
        return aceptedCheckSum;
    }
    public void setAceptedCheckSum(String aceptedCheckSum) {
        this.aceptedCheckSum = aceptedCheckSum;
    }
    
    public LogData getLogData() {
        return logData;
    }
    public void setLogData(LogData logData) {
        this.logData = logData;
    }

}
