package dde3.lab1.Hierarchy;

public class Stabbing extends ColdWeapon {
    private String name;

    public Stabbing(double weight, double price, double blade_length, String name) {
        super(weight, price, blade_length);
        this.name = name;

    }

    public Stabbing() {
        super();
    }

    @Override
    public String toString() {
        return "Stabbing{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
