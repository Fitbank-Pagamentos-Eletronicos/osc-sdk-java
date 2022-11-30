package br.com.fitbank.domains;

import java.io.Serializable;
import java.time.Instant;

public class Pipeline implements Serializable{
    private String id;
    private String status;
    private String cpf;
    private String name;
    private Instant dateCreated;
    private Instant lastUpdated;


    public Pipeline(){ }

    public Pipeline(String id, String status, String cpf, String name, Instant dateCreated, Instant lastUpdated) {
        setId(id);
        setStatus(status);
        setCpf(cpf);
        setName(name);
        setDateCreated(dateCreated);
        setLastUpdated(lastUpdated);
    }
    

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {    
            this.cpf = cpf;
       
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Instant getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Instant getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Instant lastUpdated) {
        this.lastUpdated = lastUpdated;
    }



    
}
