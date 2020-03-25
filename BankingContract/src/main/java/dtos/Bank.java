package dtos;

import java.util.Map;

public class Bank {

    private String cvr;
    private String name;
    private Map<String, Account> accounts;

    public Bank(String cvr, String name, Map<String, Account> accounts){
        this.cvr = cvr;
        this.name = name;
        this.accounts = accounts;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }
}