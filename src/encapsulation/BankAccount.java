package encapsulation;

public class BankAccount {
    private double balance;
    private String account_number;
    private User account_holder;
    private boolean account_status;

    public BankAccount(double balance, String account_number, User account_holder, boolean account_status) {
        this.balance = balance;
        this.account_number = account_number;
        this.account_holder = account_holder;
        this.account_status = account_status;
    }

    public boolean hasAccess(User user) {
        return user.geBankAccount() == this ? true : false;
    }

    public String getAccountNumber() {
        return account_number;
    }

    public String getAccountInfo() {
        return "BankAccount [Balance: " + balance + ", Account Number: " + account_number + ", Account Holder: "
                + account_holder.getUserName() + ", Account Status: " + account_status + "]";
    }

}
