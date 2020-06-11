package dde3.lab1;
import dde3.lab1.Decorator.LaserDesignator;
import dde3.lab1.Decorator.Silencer;
import dde3.lab1.Factory.WeaponFactory;
import dde3.lab1.Hierarchy.Firearm;
import dde3.lab1.Iterator.ArrayContainer;
import dde3.lab1.Iterator.ArrayListContainer;
import dde3.lab1.Iterator.Iterator;
import dde3.lab1.Iterator.LinkedListContainer;
import dde3.lab1.Threads.Store;
import dde3.lab1.Threads.Thread1;
import dde3.lab1.Threads.Thread2;

import java.util.concurrent.Semaphore;


public class Main {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1,false);

       WeaponFactory RusWeaponFactory = new WeaponFactory();
       Firearm RusPistol = RusWeaponFactory.createPistol();
       Firearm RusRifle = RusWeaponFactory.createRifle();

        RusPistol = new Silencer(RusPistol);
        RusRifle = new LaserDesignator(RusRifle);

       // System.out.println(RusPistol.toString());
        //System.out.println(RusRifle.toString());

        Store WeaponStore = new Store();
        Thread1 thread1 = new Thread1(sem);
        Thread2 thread2 = new Thread2(sem);

        thread1.start();
        thread2.start();

        ArrayContainer.array[0] = RusPistol;
        ArrayContainer.array[1] = RusRifle;
        ArrayContainer arrayContainer = new ArrayContainer();
        Iterator arrayiterator = arrayContainer.getIterator();
        while(arrayiterator.hasNext()){
            System.out.println(arrayiterator.next());
        }

        ArrayListContainer.arraylist.add(RusPistol);
        ArrayListContainer.arraylist.add(RusRifle);
        ArrayListContainer arraylistContainer = new ArrayListContainer();
        Iterator arraylistiterator = arraylistContainer.getIterator();
        while(arraylistiterator.hasNext()){
            System.out.println(arraylistiterator.next());
        }

        ArrayListContainer.arraylist.add(RusPistol);
        ArrayListContainer.arraylist.add(RusRifle);
        LinkedListContainer linkedlistContainer = new LinkedListContainer();
        Iterator linkedlistiterator = linkedlistContainer.getIterator();
        while(linkedlistiterator.hasNext()){
            System.out.println(linkedlistiterator.next());
        }
    }
}
