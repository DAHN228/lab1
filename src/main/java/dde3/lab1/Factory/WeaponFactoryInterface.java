package dde3.lab1.Factory;

import dde3.lab1.Hierarchy.Chopping;
import dde3.lab1.Hierarchy.Pistol;
import dde3.lab1.Hierarchy.Rifle;
import dde3.lab1.Hierarchy.Stabbing;

public interface WeaponFactoryInterface {
    Pistol createPistol();
    Rifle createRifle();
    Stabbing createStabbing();
    Chopping createChopping();

}
