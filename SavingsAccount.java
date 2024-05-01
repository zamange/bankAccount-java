public class SavingsAccount extends BankAccount{
    private double interestRate;


    //constructor
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest calculated and added to account " + getAccountNumber());
    }
    public static void main(String[] args) {
        // Testing the SavingsAccount class
        SavingsAccount savingsAccount = new SavingsAccount("1234567890", 1000.0, 5.0); // 5% interest rate
        System.out.println("Initial Balance: " + savingsAccount.getBalance());
        savingsAccount.calculateInterest();
        System.out.println("Current Balance after interest: " + savingsAccount.getBalance());
    }
}