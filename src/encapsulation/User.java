package encapsulation;

public class User {
    private String name;
    private int id;
    private int age;
    private String birth;

    public User(String name, int id, int age, String birth, BankAccount bank_account) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.birth = birth;
        this.bank_account = bank_account;
    }

    private BankAccount bank_account;
    
    public void withdraw() {

    }

    public boolean hasBankAccount() {
        return bank_account != null;
    }

    public BankAccount geBankAccount() {
        return this.bank_account;
    }

    public String getUserName() {
        return this.name;
    }

    public String getUserInfo() {
        return "User [Name: " + name + ", Age: " + age + ", Birth: " + birth + ", Bank Account: "
                + bank_account.getAccountNumber() + ", ID: "
                + id + "]";
    }

    public static void main(String[] args) {
        User user1 = new User("Mohamed Tarek", 100, 26, "1-jun-1998", null);

        user1.bank_account = new BankAccount(500, "1", user1, true);
        System.out.println(user1.getUserInfo());
    }

}
