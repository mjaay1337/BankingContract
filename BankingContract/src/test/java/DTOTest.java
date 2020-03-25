import dtos.Account;
import dtos.Bank;
import dtos.Customer;
import dtos.Movement;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class DTOTest {
    @Test
    public void AddToBalanceAccount() {
        Map<String, Account> accounts = new HashMap<>();
        List<Movement> withdrawals = new ArrayList<>();
        List<Movement> deposits = new ArrayList<>();
        Bank bank = new Bank("2131", "Bank of Banks", accounts);
        Customer customer = new Customer("281097-2131", "heyblyat", bank, accounts);
        Account account = new Account(bank, customer, "1234", 0, withdrawals, deposits);
        account.setBalance(100);
        assertEquals(100, account.getBalance());
    }

}
