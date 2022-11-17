package src.oscsdkjava.domains;

import java.io.Serializable;

public class Auth implements Serializable{
    
    private String client_id;
    private String client_secret;

    public Auth(){

    }

    public Auth(String client_id, String client_secret){
        setClient_id(client_id);
        setClient_secret(client_secret);
    }

    public void setClient_id(String client_id){
        this.client_id = client_id;
    }
    public void setClient_secret(String client_secret){
        this.client_secret = client_secret;
    }
    public String getClient_id(){
        return client_id;
    }
    public String getClient_secret(){
        return client_secret;
    }

    
}