package br.com.fitbank.domains.domains;

import java.io.Serializable;

public class PipelineMatchLoan implements Serializable{
    private String id;
    private String status;
    private int cpf;
    private String name;
    private String dateCreated;
    private String lastUpdated;
    private Match matches;


    public PipelineMatchLoan(){
        
    }
    public PipelineMatchLoan(String id, String status, int cpf, String name, String dateCreated, String lastUpdated,
            Match matches) {
        setId(id);
        setStatus(status);
        setCpf(cpf);
        setName(name);
        setDateCreated(dateCreated);
        setLastUpdated(lastUpdated);
        setMatches(matches);
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
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    public String getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public Match getMatches() {
        return matches;
    }
    public void setMatches(Match matches) {
        this.matches = matches;
    }
}
