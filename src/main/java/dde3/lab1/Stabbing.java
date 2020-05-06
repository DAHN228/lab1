package dde3.lab1;

public class Stabbing extends ColdWeapon {
    private String name;

    public Stabbing(double weight, double price, double blade_length, String name) {
        super(weight, price, blade_length);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stabbing{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
