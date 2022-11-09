package domains;

import java.io.Serializable;

public class ErrorFields implements Serializable{
    private String code;
    private String message;
    private ErrorField errors;


    public ErrorFields(String code, String message, ErrorField errors) {
        setCode(code);
        setMessage(message);
        setErrors(errors);
    }

    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorField getErrors() {
        return errors;
    }

    public void setErrors(ErrorField errors) {
        this.errors = errors;
    }
}
