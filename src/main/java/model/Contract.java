package model;

import model.enums.ContractType;

import java.util.Date;
import java.util.UUID;

/**
 * Created by etovladislav on 19.11.16.
 */
public class Contract {

    private UUID id;

    private ContractType contractType;

    private Register register;

    private Date date;

    private Client client;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }
}
