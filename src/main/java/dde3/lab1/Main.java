package dde3.lab1;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1,false);

       WeaponFactory RusWeaponFactory = new WeaponFactory();
       Firearm RusPistol = RusWeaponFactory.createPistol();
       Firearm RusRifle = RusWeaponFactory.createRifle();

        RusPistol = new Silencer (RusPistol);
        RusRifle = new LaserDesignator(RusRifle);

        System.out.println(RusPistol.toString());
        System.out.println(RusRifle.toString());

        Store WeaponStore = new Store();
        Thread1 thread1 = new Thread1(sem);
        Thread2 thread2 = new Thread2(sem);

        //thread1.start();
       // thread2.start();

    }
}
