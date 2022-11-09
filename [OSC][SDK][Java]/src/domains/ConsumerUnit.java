package domains;

import java.io.Serializable;

public class ConsumerUnit implements Serializable{
    
    private String number;

    public ConsumerUnit(String number){
        setNumber(number);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
