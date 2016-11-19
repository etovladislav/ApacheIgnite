package model;

import model.enums.OperationType;

import java.util.UUID;

/**
 * Created by etovladislav on 19.11.16.
 */
public class Operation {

    private UUID id;

    private OperationType operationType;

    private Double amount;

    private Contract contract;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
