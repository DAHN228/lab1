package dde3.lab1;

public class Firearm extends Weapon {
    private  double caliber;

    public Firearm(double weight, double price, double caliber) {
        super(weight, price);
        this.caliber = caliber;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    @Override
    public String toString() {
        return "Firearm{" +
                "caliber=" + caliber +
                "} " + super.toString();
    }
}
