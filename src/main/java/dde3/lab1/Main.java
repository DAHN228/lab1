package dde3.lab1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public int numOfPistols = 0;
    private  ArrayList<Pistol> pBox = new ArrayList<Pistol>();
    public ArrayList<Pistol> getPistols()
    {return pBox;}
    public void addPistols(Pistol pistol)
    {pBox.add(pistol);}

   /* class AffableThread extends Thread
    {
        @Override
        public void run()	//Этот метод будет выполнен в побочном потоке
        {
            System.out.println("Привет из побочного потока!");
            for (int i = 0; i<10; i++) {
                pBox.get(1);
                numOfPistols--;
            }
        }
    }
    static AffableThread mSecondThread;

        void thread1(){
        for (int i = 0; i<10; i++)
        {
            pBox.add(new Pistol(0.81,5000, 9.0, "PM" ));
            numOfPistols++;
        }
    }*/
    public static void main(String[] args) {
       /* mSecondThread = new AffableThread();	//Создание потока
        mSecondThread.start();					//Запуск потока
        thread1();
        System.out.println("Главный поток завершён...");
*/
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



    }
}
