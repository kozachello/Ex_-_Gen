package MyGenerics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Козак on 26.10.2016.
 */
public class MyGen<T> {
    private T element;
    private int size;
    private ArrayList<T> list = new ArrayList<T>();
    MyGen() {}
    MyGen(int size) {
        this.size = size;
    }
    Iterator<T> it = list.iterator();
    public T myIterator() {
        while(it.hasNext()) {
            element = it.next();
            return element;
        }
        return null;
    }
    public void add(T element) {
        this.element = element;
        list.add(element);
    }
    public ArrayList<T> getList() {
        return list;
    }
    public T getElement(int index) {
        element = list.get(index);
        return element;
    }
    public int getSize() {
        size = list.size();
        return size;
    }
}
