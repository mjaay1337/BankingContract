package dtos;

import java.util.List;

public class Account {
    private Bank bank;
    private Customer customer;
    private String number;
    private int balance = 0;
    private List<Movement> withdrawals;
    private List<Movement> deposits;

    public Account(Bank bank, Customer customer, String number, int balance, List<Movement> withdrawals, List<Movement> deposits) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
        this.withdrawals = withdrawals;
        this.deposits = deposits;
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Movement> getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(List<Movement> withdrawals) {
        this.withdrawals = withdrawals;
    }

    public List<Movement> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<Movement> deposits) {
        this.deposits = deposits;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}