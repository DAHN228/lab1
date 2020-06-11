package dde3.lab1.Hierarchy;

public class Rifle extends Firearm {

    public Rifle(double weight, double price, double caliber, String name) {
        super(weight, price, caliber, name);

    }

    public Rifle() {
        super();
    }

    @Override
    public String toString() {
        return "Rifle{" +
                "name = " + getName() + " weight = " + getWeight() + " price = " + getPrice() + " calbiber = " + getCaliber();
    }
}
