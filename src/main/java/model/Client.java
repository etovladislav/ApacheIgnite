package model;

import java.util.UUID;

/**
 * Created by etovladislav on 19.11.16.
 */
public class Client {

    private UUID id;

    private String firstname;

    private String lasttname;

    private Contract contract;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

}
