package dde3.lab1.Iterator;

public class ArrayIterator implements Iterator {
    int index;

    @Override
    public boolean hasNext() {
        return index < ArrayContainer.array.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return  ArrayContainer.array[index++].toString();
        }
        return null;
    }
}
