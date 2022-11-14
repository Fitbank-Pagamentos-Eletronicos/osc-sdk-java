package domains;

import java.io.Serializable;
import java.util.InputMismatchException;

public class PipelineExpire implements Serializable{
    private String id;
    private String status;
    private String cpf;
    private String name;
    private String dateCreated;
    private String lastUpdated;

    public PipelineExpire(){

    }

    public PipelineExpire(String id, String status, String cpf, String name, String dateCreated, String lastUpdated) {
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



   
}
