package dde3.lab1.Iterator;

import dde3.lab1.Hierarchy.Firearm;

import java.util.LinkedList;

public class LinkedListContainer implements Container {
    static LinkedList<Firearm> linkedlist = new LinkedList<>();
    @Override
    public Iterator getIterator(){
        return  new ArrayIterator();
    }

}
