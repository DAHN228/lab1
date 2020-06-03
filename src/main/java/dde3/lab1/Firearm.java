package dde3.lab1;

public abstract class Firearm extends Weapon {
    private  double caliber;

    public Firearm(double weight, double price, double caliber, String name) {
        super(weight, price, name);
        this.caliber = caliber;
    }

    public Firearm() {
        
    }

    public Firearm(double weight, double price, double caliber) {
    }


    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }
    @Override
    public String toString() {
        return
                "name = " + getName() + " weight = " + getWeight() + " price = " + getPrice() + " calbiber = " + getCaliber();
    }
}
