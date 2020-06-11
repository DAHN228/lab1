package dde3.lab1.Hierarchy;

public abstract class ColdWeapon extends Weapon {
    private double  blade_length;
    public ColdWeapon(double weight, double price, double blade_length) {
        super(weight, price);
        this.blade_length = blade_length;
    }

    public ColdWeapon() {
        super();
    }

    public double getBlade_length() {
        return blade_length;
    }

    public void setBlade_length(double blade_length) {
        this.blade_length = blade_length;
    }


}
