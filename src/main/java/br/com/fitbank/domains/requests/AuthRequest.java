package br.com.fitbank.domains.requests;

import java.io.Serializable;

public class AuthRequest implements Serializable{
    
    private String client_id;
    private String client_secret;
    private String[] scopes;

    public AuthRequest(){

    }

    public AuthRequest(String client_id, String client_secret){
        setClient_id(client_id);
        setClient_secret(client_secret);
        scopes[0] = "api-external";
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