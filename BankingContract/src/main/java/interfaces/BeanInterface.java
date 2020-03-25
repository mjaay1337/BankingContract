package interfaces;

import dtos.Account;
import dtos.Bank;
import dtos.Customer;
import dtos.Movement;

import javax.ejb.Remote;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Remote
public interface BeanInterface {

    Bank getBank();

    Customer getCustomer();

    String getNumber();

    void transfer(long amount, Account target);

    void transfer(long amount, String targetNumber);

    long getBalance();

    List<Movement> getWithdrawals();

    List<Movement> getDeposits();

    void deposit(long amount);

    void withdraw(long amount);

    String getCvr();

    String getName();

    Account getAccount(String number);

    Map<String, Account> getAccounts(Customer customer);


    String getCpr();

    Map<String, Account> getAccounts();

    void addAccount(Account account);

    List<Movement> getListOfWithdrawal(String accNumber);

    List<Movement> getListOfDeposits(String accNumber);


    LocalDateTime getTime();

    long getAmount();
}
