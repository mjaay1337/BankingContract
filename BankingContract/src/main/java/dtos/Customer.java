package dtos;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String cpr;
    private String name;
    private Bank bank;
    private Map<String, Account> accounts = new HashMap<>();

    public Customer(String cpr, String name, Bank bank, Map<String, Account> accounts) {
        this.cpr = cpr;
        this.name = name;
        this.bank = bank;
        this.accounts = accounts;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }
}
