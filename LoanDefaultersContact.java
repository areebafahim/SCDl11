public class LoanDefaultersContact implements BankInterface {
    private String customerName;
    private double overdueAmount;

    public LoanDefaultersContact(String customerName, double overdueAmount) {
        this.customerName = customerName;
        this.overdueAmount = overdueAmount;
    }

    @Override
    public void performOperation() {
        System.out.println("Contacting loan defaulter...");
        System.out.println("Customer: " + customerName);
        System.out.println("Overdue Amount: $" + overdueAmount);
        System.out.println("Please make the payment at the earliest!");
    }
}

