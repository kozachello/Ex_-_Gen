package MyGenerics;

import MyExceptions.MyEx2;


/**
 * Created by Козак on 26.10.2016.
 */
public class GenUse {
    public static double getAverage(MyGen<Integer> list) throws MyEx2 {
        double mid;
        double current;
        double sum = 0;
        for(int i=0; i<list.getSize(); i++) {
            current = list.getElement(i);
            sum+=current;
        }
        if(list.getSize()==0) {
            throw new MyEx2();
        }
        mid = sum/list.getSize();
        return mid;
    }
    public static void main(String args[]) {
        int[] arr = {23,32,46,39,70,23,45,67,12,78};
        int[] newarr = new int[0];
        MyGen<Integer> list = new MyGen<>();
        MyGen<Integer> newlist = new MyGen<>();
        for(int x: arr) {
            list.add(x);
        }
        System.out.println("our list ==> "+list.getList()+" with size ==> "+list.getSize());
        try {
            System.out.println("average in the list is ==> "+GenUse.getAverage(list));
        } catch (MyEx2 ex) {
            System.out.println(ex);
        }
        for(int x: newarr) {
            newlist.add(x);
        }
        System.out.println("our list ==> "+newlist.getList()+" with size ==> "+newlist.getSize());
        try {
            System.out.println("average in the list is ==> "+GenUse.getAverage(newlist));
        } catch (MyEx2 ex) {
            System.out.println(ex);
        }
    }
}
