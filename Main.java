public class Main {
    public static void main(String[] args) {
        // Example 1: Bill Payment
        BankInterface billPayment = new BillPayment("John Doe", 150.75);
        billPayment.performOperation();
        System.out.println();

        // Example 2: Account Opening
        BankInterface accountOpening = new AccountOpening("Jane Smith", "Savings");
        accountOpening.performOperation();
        System.out.println();

        // Example 3: Loan Defaulters Contact
        BankInterface loanDefaulter = new LoanDefaultersContact("Robert Brown", 1200.50);
        loanDefaulter.performOperation();
    }
}

