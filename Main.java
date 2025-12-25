package BankingApp;

public class Main {
    public static  void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        SavingAccount savingAccount = new SavingAccount();
        CurrentAccount currentAccount= new CurrentAccount();
        user1.setAccountType("SAVINGS");
        user1.setName("Sans");
        user1.setDepositAmount(10000);
        user1.setWithDrawAmount(1);
        user1.setAccountNumber(123456789);
        user1.setBalance(10000);
        if(user1.getAccountType()=="SAVINGS") {

            savingAccount.setOwnerName(user1.getName());
            System.out.println(savingAccount.setdeposit(user1.getDepositAmount()));
            savingAccount.setBalance(user1.getBalance());

           //System.out.println(" "+ savingAccount.getOwnerName());
            System.out.println("USER 1: "+user1.getAccountType());
            System.out.println("Deposit "+ savingAccount.getdeposit());
           System.out.println("Balance "+ savingAccount.getBalance());
           savingAccount.createFixedDeposit();
        }
        System.out.println();
        user2.setAccountType("CURRENT");
        user2.setName("Sans");
        user2.setDepositAmount(50000);
        user2.setWithDrawAmount(1);
        user2.setAccountNumber(123456789);
        user2.setBalance(50000);
        if(user2.getAccountType()=="CURRENT"){
            currentAccount.setOwnerName(user2.getName());
            System.out.println(currentAccount.setdeposit(user2.getDepositAmount()));
            currentAccount.setBalance(user2.getBalance());

            //System.out.println(" "+ savingAccount.getOwnerName());
            System.out.println("USER 2: "+user2.getAccountType());
            System.out.println("Deposit "+ currentAccount.getdeposit());
            System.out.println("Balance "+ currentAccount.getBalance());
            currentAccount.enableOverDraft();
        }




























//        if(user1.getAccountType()=="SAVINGS"){
//            savingAccount.setOwnerNumber(user1.getName());
//            System.out.println(savingAccount.getOwnerNumber());
//            savingAccount.setAccountNumber(user1.accountNumber());
//        }
//
//        user2.setAccountType("CURRENT");
//        user2.setName("San");
//        user2.setDepositAmount(10);
//        user2.setWithDrawAmount(1);
//        user2.setAccountNumber(123456789);
//        user2.setBalance(50);
//        if (user1.getAccountType() == "SAVINGS") {
//
//return 0;
//        }
//        else{
//return 0;
    }





    }


//         Use if-condition to route to correct account
// * Call unique method for each

// ─────────────────
// Expected Output:
// USER 1: SAVINGS
// Deposited: 10000
// Balance: 10000
// Fixed Deposit Created


// USER 2: CURRENT
// Deposited: 50000
// Balance: 50000
// Overdraft Enabled