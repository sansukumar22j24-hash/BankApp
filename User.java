package BankingApp;
public class User {
    int depositAmount;
    int withdrawAmount;
    String accountType;
    int accountNumber;
    String name;
    double balance;

    int getDepositAmount(){
        return depositAmount;
    }
    int getWithDrawAmount(){
        return withdrawAmount;
    }
    String getAccountType(){
        return accountType;
    }
    int getAccountNumber(){
        return accountNumber;
    }
    String getName(){
        return name;
    }
    double getBalance(){
        return balance;
    }
    void setDepositAmount(int depositAmount){
        this.depositAmount=depositAmount;
    }
    void setWithDrawAmount(int withdrawAmount){
        this.withdrawAmount=withdrawAmount;
    }
    void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    void setAccountType(String accountType){
        this.accountType=accountType;
    }
    void setName(String name){
        this.name= name;
    }
    void setBalance(double balance){
        this.balance=balance;
    }







}


