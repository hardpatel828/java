// Create a Java class BankAccount with accountNumber, accountHolderName,
// and balance. Include methods to deposit, withdraw, and display balance. Use a
// BankDemo class to test all methods.


class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void setDetails(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class P4_2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setDetails(101, "Rahul", 5000);

        account.displayBalance();

        account.deposit(2000);
        account.withdraw(1500);

        account.displayBalance();
    }
}