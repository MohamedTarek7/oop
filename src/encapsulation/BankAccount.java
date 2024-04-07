package encapsulation;

public class BankAccount {
    private double balance;
    private String account_number;
    private User account_holder;

    public BankAccount(double balance, String account_number, User account_holder) {
        this.balance = balance;
        this.account_number = account_number;
        this.account_holder = account_holder;
        account_holder.setAccount_number(account_number);
    }

    public String getAccountNumber() {
        if (this.hasAccess()) {
            return account_number;
        } else {
            return "Unautherized access!";
        }
    }

    public double getBalance() {
        if (this.hasAccess()) {
            return balance;
        } else {
            System.out.println("Unautherized access!");
            return 1;
        }
    }

    public User getAccountHolderInfo() {
        if (hasAccess()) {
            return account_holder;
        } else {
            System.out.println("Unautherized access!");
            return null;
        }
    }

    public boolean hasAccess() {
        return account_number == account_holder.getAccount_number();
    }

    public String toString() {
        return "BankAccount [Balance: " + balance + ", Account Number: " + account_number + ", Account Holder: "
                + account_holder + "]";
    }
}
