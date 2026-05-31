import java.util.Scanner;

class BankAccount {
    String name;
    long accNo;
    String type;
    double balance;
    static final double rate = 3.5; // Static interest rate

    // Default Constructor
    BankAccount() {
        name = "Unknown";
        accNo = 0;
        type = "Savings";
        balance = 0.0;
    }

    // Parameterized Constructor
    BankAccount(String name, long accNo, String type, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.type = type;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (checking minimum balance)
    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 500) { // Assuming ₹500 as the minimum balance
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal failed. Insufficient balance or minimum balance requirement not met.");
        }
    }

    // Display account details
    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Type: " + type);
        System.out.println("Balance: ₹" + balance);
    }

    // Static method to display interest rate
    static void displayRateOfInterest() {
        System.out.println("Rate of Interest: " + rate + "%");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using Default Constructor
        BankAccount defaultAcc = new BankAccount();
        System.out.println("Default Account:");
        defaultAcc.display();

        // Using Parameterized Constructor
        System.out.println("\nEnter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Account Number: ");
        long accNo = sc.nextLong();
        sc.nextLine(); // Consume newline
        System.out.println("Enter Account Type: ");
        String type = sc.nextLine();
        System.out.println("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount userAcc = new BankAccount(name, accNo, type, balance);
        System.out.println("\nAccount Created Successfully!\n");
        userAcc.display();

        // Performing deposit
        System.out.println("\nEnter deposit amount: ");
        double depositAmount = sc.nextDouble();
        userAcc.deposit(depositAmount);
        userAcc.display();

        // Performing withdrawal
        System.out.println("\nEnter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        userAcc.withdraw(withdrawAmount);
        userAcc.display();

        // Display interest rate
        BankAccount.displayRateOfInterest();

        sc.close();
    }
}
