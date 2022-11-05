# Home Loan Service

Create a method that decides if a loan application will be granted or not.

For property price smaller than 150_000.00, we will require only 15% down payment.
For property price greater or equal to 150_000.00, we will require 20% down payment.

If the account has enough balance to cover the down payment, the loan request should
be granted. If there isn't enough balance, the request should be rejected.

Test scenario 1:
- Given that property price is 140_000.00
- Given that account balance is 21_000.00
- Assert that final decision is granted


Test scenario 2:
- Given that property price is 125_000.00
- Given that account balance is 18_749.00
- Assert that final decision is not granted


Test scenario 3:
- Given that property price is 150_000.00
- Given that account balance is 30_000.00
- Assert that final decision is granted


Test scenario 4:
- Given that property price is 200_000.00
- Given that account balance is 25_000.00
- Assert that final decision is not granted
