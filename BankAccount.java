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
            double result = balance + amount;
            System.out.println(result + " has been successfully deposited into " + accountNumber);
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
