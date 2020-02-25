package dde3.lab1;

public class Pistol extends Firearm {
    private String model;
    public Pistol(double weight, double price, double caliber, String model) {
        super(weight, price, caliber);
        this.model = model;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Pistol{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }
}