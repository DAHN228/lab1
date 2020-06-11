package dde3.lab1.Hierarchy;

public class Pistol extends Firearm {

    public Pistol(double weight, double price, double caliber, String name) {
        super(weight, price, caliber, name);

    }

    public Pistol() {
        super();
    }

    @Override
    public String toString() {
        return "Pistol{" +
                "name = " + getName() + " weight = " + getWeight() + " price = " + getPrice() + " calbiber = " + getCaliber();
    }
}