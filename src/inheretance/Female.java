package inheretance;

public class Female extends Human {

    public Female() {
        super.setGender("female");
    }

    public Female(String name, int age, String husband) {
        super(name, age, husband);
        super.setGender("female");
    }

    @Override
    public String toString() {
        return super.toString() + (getPartner() != null ? "\nHusband: " + getPartner() : "");
    }
}
