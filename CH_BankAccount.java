public class CH_BankAccount {

    private String firstName;
    private String lastName;
    private double balance;


    // The Branch argument is true is customer is performing the transaction
    // at Branch, With a teller
    // it's false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    // The Branch argument is true is customer is performing the transaction
    // at Branch, With a teller
    // it's false if the customer is performing the transaction at an ATM
    public double withdraw(double amount, boolean branch){
        balance -= amount;
        return balance;
    }

    public CH_BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}

