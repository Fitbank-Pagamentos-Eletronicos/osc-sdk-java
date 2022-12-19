package br.com.fitbank.domains;

public class PubSubRequestReturn {

    private String message;
    private String environment;
    private String version;

    public PubSubRequestReturn(){

    }
    public PubSubRequestReturn(String message, String environment, String version){
        setEnvironment(environment);
        setMessage(message);
        setVersion(version);

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
