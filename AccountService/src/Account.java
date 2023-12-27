import java.util.Arrays;

public class Account{
    private long id;
    private long balace;
    private User owner;

    public Account(long id, long balace, User owner) {
        this.id = id;
        this.balace = balace;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalace() {
        return balace;
    }

    public User getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account {\n" +
                "id=" + id +
                ", balace=" + balace +
                ", owner=" + owner +
                '}';
    }
}
class User{
    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{ \n" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}
class AccountServiceImpl implements AccountService{
    Account[] accounts;
    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }
    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account i: accounts) {
            if (i.getOwner().getId() == id) {
                return i;
            }
        }
        return null;
    }
    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        int counter = 0;
        for (Account i: accounts) {
            if (i.getBalace() > value) {
                counter++;
            }
    }
        System.out.println("Number of accounts balace over " + value +"$: " + counter);
        return counter;

}}