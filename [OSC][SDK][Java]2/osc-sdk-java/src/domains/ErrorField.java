package domains;

import java.io.Serializable;

public class ErrorField implements Serializable{
    private String field;
    private String message;

    public ErrorField(){
        
    }
    public ErrorField(String field, String message){
        setField(field);
        setMessage(message);
    }

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
}
