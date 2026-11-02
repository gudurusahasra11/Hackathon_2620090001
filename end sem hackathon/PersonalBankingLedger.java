class BankAccount {
    String name;
    String accNo;
    double balance;
    double totalDeposit = 0;
    double totalWithdraw = 0;

    BankAccount(String name, String accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        totalDeposit += amount;

        System.out.println("\nDeposit Amount : Rs. " + amount);
        System.out.println("Transaction Status : Deposit Successful");
        System.out.println("Updated Balance : Rs. " + balance);
    }

    // Method Overloading
    void deposit(double amount, String description) {
        balance += amount;
        totalDeposit += amount;

        System.out.println("\nDeposit Amount : Rs. " + amount);
        System.out.println("Description : " + description);
        System.out.println("Transaction Status : Deposit Successful");
        System.out.println("Updated Balance : Rs. " + balance);
    }

    void withdraw(double amount) {
        System.out.println("\nWithdrawal Amount : Rs. " + amount);

        if (amount <= balance) {
            balance -= amount;
            totalWithdraw += amount;

            System.out.println("Transaction Status : Withdrawal Successful");
            System.out.println("Updated Balance : Rs. " + balance);
        } else {
            System.out.println("Transaction Status : Insufficient Balance");
            System.out.println("Available Balance : Rs. " + balance);
        }
    }

    void summary() {
        System.out.println("\n---------- ACCOUNT SUMMARY ----------");
        System.out.println("Account Holder : " + name.toUpperCase());
        System.out.println("Account Number : " + accNo);
        System.out.println("Total Deposits : Rs. " + totalDeposit);
        System.out.println("Total Withdrawals : Rs. " + totalWithdraw);
        System.out.println("Final Balance : Rs. " + balance);
    }
}

public class PersonalBankingLedger {
    public static void main(String[] args) {

        BankAccount b = new BankAccount("Ravi Kumar", "1234567890", 10000);

        System.out.println("========== PERSONAL BANKING LEDGER ==========");

        b.deposit(5000);
        b.deposit(1000, "Salary Credit"); // Overloaded method

        b.withdraw(2000);
        b.withdraw(20000);

        b.summary();

        if (b.name.equalsIgnoreCase("RAVI KUMAR"))
            System.out.println("\nAccount Holder Verification: Names Match");
        else
            System.out.println("\nAccount Holder Verification: Names Do Not Match");
    }
}