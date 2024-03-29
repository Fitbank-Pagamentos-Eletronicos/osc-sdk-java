package br.com.fitbank.domains.response;

import br.com.fitbank.domains.domains.Match;
import br.com.fitbank.domains.enumerator.PipelineStatus;
import br.com.fitbank.domains.domains.Proposals;

import java.io.Serializable;
import java.time.Instant;

public class PipelineResponse implements Serializable{
    private String id;
    private PipelineStatus status;
    private String cpf;
    private String name;
    private Instant dateCreated;
    private Instant lastUpdated;
    private Match[] matches;
    private Proposals[] proposals;

    public PipelineResponse(){ }

    public PipelineResponse(String id, PipelineStatus status, String cpf, String name, Instant dateCreated, Instant lastUpdated) {
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
    public PipelineStatus getStatus() {
        return status;
    }
    public void setStatus(PipelineStatus status) {
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


    public Proposals[] getProposals() {
        return proposals;
    }

    public void setProposals(Proposals[] proposals) {
        this.proposals = proposals;
    }

    public Match[] getMatches() {
        return matches;
    }

    public void setMatches(Match[] matches) {
        this.matches = matches;
    }
}
