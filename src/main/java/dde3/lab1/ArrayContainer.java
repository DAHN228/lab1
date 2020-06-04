package dde3.lab1;

public class ArrayContainer implements Container {
    static Firearm [] array = new Firearm[2];
@Override
    public Iterator getIterator(){
        return  new ArrayIterator();
}

}
