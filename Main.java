package BANK;



public class Main {
    public static void main(String[] args) {
        User user1   =new User();
        User user2   =new User();
        CurrentAccount currentAccount= new CurrentAccount();
        user1.setDepositAmount(10000);
        user1.setWithdrawAmount(0);
        user1.setAccountType("CURRENT");
        user1.setAccountNumber("123456");
        user1.setName("hello");

        SavingAccount savingAccount=new SavingAccount();
        System.out.println(user1.getAccountType());
        savingAccount.setAccountNumber(user1.getAccountNumber());
        savingAccount.deposit(user1.getDepositAmount());
        savingAccount.withdraw(user1.getWithdrawAmount());
        savingAccount.enableOverdraft();
        int balance= currentAccount.getBalance();
        user1.setBalance(balance);

        System.out.println();

        user2.setDepositAmount(50000);
        user2.setWithdrawAmount(0);
        user2.setAccountType("SAVINGS");
        user2.setAccountNumber("12345");
        user2.setName("hello");
        System.out.println( user2.getAccountType());
        currentAccount.setAccountNumber(user2.getAccountNumber());
        currentAccount.deposit(user2.getDepositAmount());
        currentAccount.withdraw(user2.getWithdrawAmount());
        currentAccount.enableOverdraft();
        int balance2= currentAccount.getBalance();
        user2.setBalance(balance2);





    }
}
