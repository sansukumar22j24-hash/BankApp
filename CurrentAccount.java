package BankingApp;
public class CurrentAccount
{
    private double balance;
    private  String  ownerName;
    private int accountNumber;

    //private int deposit;

    int getAccountNumber(){
        return accountNumber;
    }
    double getBalance(){
        return balance;
    }
    String getOwnerName(){
        return ownerName;
    }
    double getdeposit(){
        return balance;
    }


    void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    void setBalance(double balance){
        this.balance=balance;
    }
    void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }

    int setdeposit(double amount){

        this.balance=amount+1;
        return 0;
    }
    void  withdraw(double amount){

        balance= amount-1;
    }
    void enableOverDraft(){
        System.out.println("Overdraft Enabled ");
    }



}

