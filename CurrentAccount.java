package BANK;

public class CurrentAccount {
    private String accountNumber;
    private int balance;
    private String userName;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void deposit(int amount){
        this.balance=this.balance+amount;
        System.out.println(this.balance);
    }
    public void withdraw(int amount){
        this.balance=this.balance-amount;
        System.out.println(this.balance);
    }
    public void enableOverdraft(){
        System.out.println("Overdraft Enabled");
    }


}
