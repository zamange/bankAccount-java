public class BankAccount {
    //properties

    private String accountNumber;
    private Double balance;

    //constructor
    public BankAccount ( String accountNumber, Double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }


    public void deposit (double amount){


    }

    public void withdraw{
        Double amount = 0.0;
        double result = balance - amount;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
