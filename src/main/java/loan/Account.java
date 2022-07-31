package loan;

import java.time.LocalDate;

public class Account {

    private String number;
    private String owner;
    private double balance;
    private LocalDate dateCreated;

    public Account(String number, String owner, double balance, LocalDate dateCreated) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
        this.dateCreated = dateCreated;
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

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
