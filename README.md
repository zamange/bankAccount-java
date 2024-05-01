BankAccount Class

Description:
The BankAccount class represents a simple bank account with basic operations like deposit and withdraw.

Usage:
1. Create a BankAccount object with an account number and initial balance.
2. Deposit money into the account using the deposit method.
3. Withdraw money from the account using the withdraw method.
4. Retrieve the current balance or account number using the getBalance and getAccountNumber methods.

Example:
BankAccount account = new BankAccount("1234567890", 1000.0);
account.deposit(500.0);
account.withdraw(200.0);
