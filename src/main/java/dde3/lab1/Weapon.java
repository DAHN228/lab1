package dde3.lab1;

public abstract class Weapon {
    private double weight;
    private double price;
    public Weapon(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }
    public Weapon(){}

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "weapon{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
