package dde3.lab1.Hierarchy;

public abstract class Weapon {
    private double weight;
    private double price;
    private String name;
    public Weapon(double weight, double price, String name) {
        this.weight = weight;
        this.price = price;
        this.name = name;
    }
    public Weapon(double weight, double price){}

    public Weapon() {

    }
    public String getName () {return name;}
    public double getWeight() { return weight;}

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
