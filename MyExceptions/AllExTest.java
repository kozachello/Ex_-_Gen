package MyExceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Козак on 25.10.2016.
 */
public class AllExTest {
    public static double devide(int i, int j) throws MyEx2 {
        if(j==0) {
            throw new MyEx2();
        }
        double result = (double)i /(double) j;
        return result;
    }
    public static void main(String args[]) {
        int i,j;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,2,7,3,3,0));
        Iterator<Integer> it = list.iterator();
        try {
            while (it.hasNext()) {
                i = it.next();
                j = it.next();
                System.out.println(String.format("%.2f",AllExTest.devide(i, j)));
            }
        } catch(MyEx2 ex) {
            System.out.println(ex);
        }
    }
}
