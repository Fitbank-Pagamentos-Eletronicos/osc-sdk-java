package br.com.fitbank.domains.domains;

public class ContractBody {

    private String checksum;
    private String contract;

    public ContractBody(String checksum, String contract){
        setContract(contract);
        setChecksum(checksum);
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
}
