package dde3.lab1.Iterator;

import dde3.lab1.Hierarchy.Firearm;

import java.util.ArrayList;

public class ArrayListContainer implements Container {
    static ArrayList<Firearm> arraylist = new ArrayList<>();
    @Override
    public Iterator getIterator(){
        return  new ArrayListIterator();
    }

}
