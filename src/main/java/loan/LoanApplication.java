package loan;

public class LoanApplication {

    private Account account;
    private double propertyPrice;
    private boolean granted;

    public LoanApplication(Account account, double propertyPrice, boolean granted) {
        this.account = account;
        this.propertyPrice = propertyPrice;
        this.granted = granted;
    }

    public Account getAccount() {
        return account;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public boolean isGranted() {
        return granted;
    }
}
