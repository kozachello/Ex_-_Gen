package MyExceptions;

/**
 * Created by Козак on 11.10.2016.
 */
class MyEx1 extends Exception {
    private int[] details;
    private int size;
    MyEx1(int[] arr) {
        details = arr;
        size = details.length;
    }
    public String toString() {
        return "SizeIsToBigException["+size+"]";
    }
}
public class MySecondEx {
    static void checkArrSize(int[] arr) throws MyEx1 {
        System.out.println("checkArrSize is called");
        if(arr.length>10) throw new MyEx1(arr);
        System.out.println("normal size!");
    }
    public static void main(String args[]) {
        int[] arr1 = {0,1,2,3,4,5};
        int[] arr2 = {0,1,2,3,4,5,6,7,8,9,10};
        try {
            checkArrSize(arr1);
            checkArrSize(arr2);
        } catch (MyEx1 e) {
            System.out.println(e+" catched!");
        } catch (NullPointerException e) {
            System.out.println("Null Point");
        }
    }
}
