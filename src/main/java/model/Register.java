package model;

import java.util.UUID;

/**
 * Created by etovladislav on 19.11.16.
 */
public class Register {

    private UUID id;

    private Double balance;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
