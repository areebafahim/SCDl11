public class BillPayment implements BankInterface {
    private String customerName;
    private double amount;

    public BillPayment(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void performOperation() {
        System.out.println("Processing bill payment...");
        System.out.println("Customer: " + customerName);
        System.out.println("Amount Paid: $" + amount);
    }
}
