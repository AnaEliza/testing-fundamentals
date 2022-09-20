package loan;

public class Account {

    private String number;
    private String owner;
    private double balance;

    public Account(String number, String owner, double balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

}
