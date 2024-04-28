package inheretance;

public class Male extends Human {

    public Male() {
        super.setGender("male");
    }

    public Male(String name, int age, String wife) {
        super(name, age, wife);
        super.setGender("male");
    }

    @Override
    public String toString() {
        return super.toString() + (getPartner() != null ? "\nWife: " + getPartner() : "");
    }

}
