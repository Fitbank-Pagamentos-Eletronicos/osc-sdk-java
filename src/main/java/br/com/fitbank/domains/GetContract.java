package br.com.fitbank.domains;

public class GetContract {
    private String customerServiceNumber;
    private ContractBody[] contracts;

    public GetContract(String customerServiceNumber, ContractBody[] contracts){
        setContracts(contracts);
        setCustomerServiceNumber(customerServiceNumber);
    }


    public String getCustomerServiceNumber() {
        return customerServiceNumber;
    }

    public void setCustomerServiceNumber(String customerServiceNumber) {
        this.customerServiceNumber = customerServiceNumber;
    }

    public ContractBody[] getContracts() {
        return contracts;
    }

    public void setContracts(ContractBody[] contracts) {
        this.contracts = contracts;
    }
}
