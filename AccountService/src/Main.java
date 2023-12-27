public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"Stefan","Mitr");
        User user2 = new User(2,"Nikola","Jov");
        User user3 = new User(3,"Nikola","Jov");

        Account acc1 = new Account(1,100,user1);
        Account acc2 = new Account(2,120,user2);
        Account acc3 = new Account(3,120,user3);

        Account[] accounts = {acc1,acc2,acc3};

        AccountService service = new AccountServiceImpl(accounts);

        System.out.println(service.findAccountByOwnerId(3 ));
        //service.countAccountsWithBalanceGreaterThan(109);
        //service.countAccountsWithBalanceGreaterThan(1);
    }
}