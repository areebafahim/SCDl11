public class AccountOpening implements BankInterface {
    private String customerName;
    private String accountType;

    public AccountOpening(String customerName, String accountType) {
        this.customerName = customerName;
        this.accountType = accountType;
    }

    @Override
    public void performOperation() {
        System.out.println("Opening a new account...");
        System.out.println("Customer: " + customerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account successfully opened!");
    }
}
