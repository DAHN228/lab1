package dde3.lab1.Builder;

import dde3.lab1.Factory.WeaponFactory;
import dde3.lab1.Hierarchy.Pistol;
import dde3.lab1.Hierarchy.Rifle;

public class BuilderMain {
    public static void main(String[] args) {
        WeaponFactory ruweaponfactory = new WeaponFactory();
        WeaponStore ruweaponstore = new WeaponStore.Builder()
                .withName("PutIn Weapons")
                .withPistol( (Pistol)ruweaponfactory.createPistol())
                .withRifle((Rifle)ruweaponfactory.createRifle())
                .build();
        ruweaponstore.showAssortment();
    }
}
