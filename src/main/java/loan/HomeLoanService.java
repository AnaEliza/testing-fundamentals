package loan;

import java.time.LocalDate;

public class HomeLoanService {

    /**
     * This method evaluates if a bank customer is eligible for a home loan.
     * It receives the account and the propertyPrice as parameters.
     * <p>
     * For customers with accounts older than 5 years, we will require only 15% down payment.
     * For customers with accounts younger than 5 years, we will require 20% down payment.
     * <p>
     * The down payment is calculated based on the propertyPrice and the age of the account.
     * If the account has enough balance to cover the down payment, the loan request should
     * be granted. If there isn't enough balance, the request should be rejected.
     */
    public LoanApplication applyForHomeLoan(Account account, double propertyPrice) {
        // dateToCheck is created based on today's date minus 5 years
        LocalDate dateToCheck = LocalDate.now().minusYears(5);

        // isOldAccount is true if the account was created more than 5 years ago,
        // meaning that it was created before the dateToCheck we just calculated
        boolean isOldAccount = account.getDateCreated().isBefore(dateToCheck);

        return null;
    }

}
