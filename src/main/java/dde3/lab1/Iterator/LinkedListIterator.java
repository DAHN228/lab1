package dde3.lab1.Iterator;

public class LinkedListIterator implements Iterator {
    int index;

    @Override
    public boolean hasNext() {
        return index < LinkedListContainer.linkedlist.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return  LinkedListContainer.linkedlist.get(index++).toString();
        }
        return null;
    }
}