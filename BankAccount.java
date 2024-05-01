public class BankAccount {
    //properties

    private String accountNumber;
    private double balance;

    //constructor
    public BankAccount ( String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }


    //deposit method
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(amount + " has been successfully deposited into " + accountNumber);
            System.out.print("New balance: "+ balance);
        }
        else{
            System.out.println("Invalid deposit amount.");
            System.out.print("Balance: "+ balance);
        }
    }

    //withdraw method
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + "has been successfully withdraw from " + accountNumber);
            System.out.print("New balance: "+ balance);
        }
        else {
            System.out.println("Invalid withdrawal amount.");
            System.out.println("Balance "+ balance);
        }

    }



}
