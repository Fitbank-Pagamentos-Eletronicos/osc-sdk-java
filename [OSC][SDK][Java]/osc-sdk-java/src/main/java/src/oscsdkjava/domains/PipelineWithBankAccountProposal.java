package src.oscsdkjava.domains;

import java.io.Serializable;

public class PipelineWithBankAccountProposal implements Serializable{
    private String id;
    private String status;
    private int cpf;
    private String name;
    private String dateCreated;
    private String lastUpdated;
    private BankAccount proposals;
    
    public PipelineWithBankAccountProposal(){
        
    }
    public PipelineWithBankAccountProposal(String id, String status, int cpf, String name, String dateCreated,
            String lastUpdated, BankAccount proposals) {
        setId(id);
        setStatus(status);
        setCpf(cpf);
        setName(name);
        setDateCreated(dateCreated);
        setLastUpdated(lastUpdated);
        setProposals(proposals);
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
    public BankAccount getProposals() {
        return proposals;
    }
    public void setProposals(BankAccount proposals) {
        this.proposals = proposals;
    }
}
