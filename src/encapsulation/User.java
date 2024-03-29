package encapsulation;

public class User {
    private String name;
    private String id;
    private int age;
    private String birth;
    private BankAccount bank_account;

    public User(String name, String id, int age, String birth, BankAccount bank_account) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.birth = birth;
        this.bank_account = bank_account;
    }

    public void withdraw() {}

    public boolean hasBankAccount() {
        return bank_account != null;
    }

    public BankAccount geBankAccount() {
        return this.bank_account;
    }

    public String getUserName() {
        return this.name;
    }

    public boolean dataIsValid() {
        if (name == null || name.length() < 5) {
            System.out.println("Error: Name can't be empty or less than 5 letters!");
            return false;
        }

        if (id == null || id.length() < 5) {
            System.out.println("Error: ID most be 5 digits!");
            return false;
        }

        if (age < 16) {
            System.out.println("Error: Age most be 16 or above!");
            return false;
        }

        if (bank_account == null) {
            System.out.println("Error: You should have at least one bank account!");
            return false;
        }

        if (birth == null || birth.length() < 10) {
            System.out.println("Error: Date of birth most be 10 digits!...\nUse: dd-mm-yyyy / 01-06-2000");
            return false;
        }

        return true;
    }

    public String getUserInfo() {
        if (dataIsValid()) {
            return "User [Name: " + name + ", Age: " + age + ", Birth: " + birth + ", Bank Account: "
                    + bank_account.getAccountNumber() + ", ID: "
                    + id + "]";
        } else {
            return "Fix: follow the error message!";
        }
    }

}
