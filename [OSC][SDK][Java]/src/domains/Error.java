package domains;

public class Error {

    private String code;
    private String message;

    public Error(String code, String message){
        setCode(code);
        setMessage(message);
    }
    

    public String getField() {
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

}
