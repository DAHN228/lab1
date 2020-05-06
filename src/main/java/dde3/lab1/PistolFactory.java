package dde3.lab1;

public class PistolFactory implements WeaponFactory {
    @Override
    public Pistol createPistol() {
        return new Pistol();
    }
}
