package br.com.fitbank.domains.domains;

import java.io.Serializable;

public class Reference implements Serializable{
    
    private String name;
    private String phone;

    public Reference(){
        
    }
    public Reference(String name, String phone){
        setName(name);
        setPhone(phone);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
}
