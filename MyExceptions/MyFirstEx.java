package MyExceptions;

/**
 * Created by Козак on 11.10.2016.
 */
class MyEx extends Exception {
    private int detail;
    MyEx(int a) {
        detail = a;
    }
    public String toString() {
        return "exception["+detail+"]";
    }
}
public class MyFirstEx {
    static void compute(int a) throws MyEx {
        System.out.println("compute is called with param "+a);
        if(a>9) throw new MyEx(a);
        System.out.println("normal action!");
    }
    public static void main(String args[]) {
        try {
            compute(1);
            compute(9);
            compute(16);
        } catch (MyEx e) {
            System.out.print(e+" catched!");
        }
    }
}
