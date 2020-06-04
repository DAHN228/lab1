package dde3.lab1;

public class ArrayListIterator implements Iterator {
    int index;

    @Override
    public boolean hasNext() {
        return index < ArrayListContainer.arraylist.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return  ArrayListContainer.arraylist.get(index++).toString();
        }
        return null;
    }
}
