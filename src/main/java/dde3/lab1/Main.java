package dde3.lab1;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1,false);

       PistolFactory pistolFactory = new PistolFactory();
       Pistol pistol = pistolFactory.createPistol();

        Pistol pm = new Pistol(0.81,5000, 9.0, "PM" );
        Weapon pm1 = new Pistol(0.81,5000, 9.0, "PM" );
        pm1 = new Discount(pm1);
        Rifle an94 = new Rifle(4.2, 50000, 5.45, "AH-94" );
        Chopping axe = new Chopping(4, 3000, 300, "BattleAxe");
        Stabbing dirk = new Stabbing( 0.2, 5000, 245, "SailorsDirk" );

        System.out.println(pm.toString());
        System.out.println(an94.toString());
        System.out.println(axe.toString());
        System.out.println(dirk.toString());
        System.out.println(pm1.toString());
        System.out.println(pistol.toString());

        Store pistolStore = new Store();
        Thread1 thread1 = new Thread1(sem);
        Thread2 thread2 = new Thread2(sem);

        thread1.start();
        thread2.start();

    }
}
