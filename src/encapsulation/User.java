package encapsulation;

public class User {
    private String name;
    private String id;
    private String account_number;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getUserName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getAccount_number() {
        if (account_number != null) {
            return account_number;
        } else {
            return "This user does not have a bank account!";
        }
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String toString() {
        return "User [Name: " + name + ", ID: "
                + id + ", Account Number: "
                + account_number + "]";
    }
}
