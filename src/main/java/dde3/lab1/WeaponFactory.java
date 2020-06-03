package dde3.lab1;

public class WeaponFactory implements WeaponFactoryInterface {
    @Override
    public  Pistol createPistol() {
        return new Pistol(0.81,5000.0, 9.0, "PM" );
    }

    @Override
    public  Rifle createRifle() {
        return new Rifle(4.2, 50000.0, 5.45, "AH-94" );
    }

    @Override
    public Stabbing createStabbing() {
        return new Stabbing( 0.2, 5000.0, 245.0, "SailorsDirk" );
    }

    @Override
    public Chopping createChopping() {
        return new Chopping(4.0, 3000.0, 300.0, "BattleAxe");
    }
}
