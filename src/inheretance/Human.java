package inheretance;

public class Human {
    private String gender;
    private String name;
    private int age;
    private String partner;

    public Human() {
    }

    public Human(String name, int age, String partner) {
        this.name = name;
        this.age = age;
        this.partner = partner;
    }

    @Override
    public String toString() {
        return (name != null ? "\nName: " + name : "") + (age > 0 ? "\nAge: " + age : "");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public boolean equalss(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        Human thatHuman = (Human) that;
        return name == thatHuman.name && age == thatHuman.age && partner == thatHuman.partner
        ;
    }

}
