//Tiar Saroha Simamora

package java_oop1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Constructor
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    // Getter and Setter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please deposit a positive amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds. Withdrawal failed. Current balance: $" + balance);
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please withdraw a positive amount.");
        }
    }

    public static void main(String[] args) {
        // Testing the BankAccount class
        BankAccount myAccount = new BankAccount("123456789", 1000.0, "Tiar", "tiar@example.com", "123-456-789");

        // Display initial account information
        System.out.println("Initial Account Information:");
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Customer Name: " + myAccount.getCustomerName());
        System.out.println("Customer Email: " + myAccount.getCustomerEmail());
        System.out.println("Customer Phone: " + myAccount.getCustomerPhone());
        System.out.println("Balance: $" + myAccount.getBalance());

        // Perform deposit and withdrawal
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(1500.0); // Should print an error message

        // Display updated account information
        System.out.println("\nUpdated Account Information:");
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Customer Name: " + myAccount.getCustomerName());
        System.out.println("Customer Email: " + myAccount.getCustomerEmail());
        System.out.println("Customer Phone: " + myAccount.getCustomerPhone());
        System.out.println("Balance: $" + myAccount.getBalance());
    }

}
