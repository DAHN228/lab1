package dde3.lab1.Decorator;

import dde3.lab1.Hierarchy.Weapon;

public class Discount extends Decorator{
    Weapon weapon;
    public Discount (Weapon weapon) {
        this.weapon = weapon;
    }
    public double getPrice(){
        return weapon.getPrice() - 500;
    }
}
