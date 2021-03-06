package dde3.lab1.Hierarchy;

public class Chopping extends ColdWeapon {
    private String name;
    public Chopping(double weight, double price, double blade_length, String name) {
        super(weight, price, blade_length);
        this.name = name;
    }

    public Chopping() {
        super();
    }

    @Override
    public String toString() {
        return "Chopping{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

}
