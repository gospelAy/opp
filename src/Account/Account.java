package Account;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){
        this("56789", 2.50, "Default name", "Default address","Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameter called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }
    public  Account(String customerName, String email, String phoneNumber){
        this("99999", 100.55, customerName, email, phoneNumber);
    }
    public void deposit(double depositAmount){
        this.balance = balance + depositAmount;
        System.out.println("Deposit of " + depositAmount + " made, New balance is " + balance);
    }

    public void withdraw(double withdrawAmount){
        if (balance - withdrawAmount < 0){
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        }else{
            this.balance = balance - withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed, Remaining balance = " + balance);
        }
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
