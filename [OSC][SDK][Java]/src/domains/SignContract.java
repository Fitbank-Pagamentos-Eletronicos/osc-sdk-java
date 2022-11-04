package domains;

public class SignContract {
    private String aceptedCheckSum;

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
