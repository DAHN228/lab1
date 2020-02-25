package dde3.lab1;

public class Main {
    public static void main(String[] args) {
        Pistol pm = new Pistol(0.81,5000, 9.0, "PM" );
        Rifle an94 = new Rifle(4.2, 50000, 5.45, "AH-94" );
        Chopping axe = new Chopping(4, 3000, 300, "BattleAxe");
        Stabbing dirk = new Stabbing( 0.2, 5000, 245, "SailorsDirk" );

        System.out.println(pm.toString());
        System.out.println(an94.toString());
        System.out.println(axe.toString());
        System.out.println(dirk.toString());
    }
}
