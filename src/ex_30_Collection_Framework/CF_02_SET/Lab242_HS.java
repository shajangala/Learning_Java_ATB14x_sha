package ex_30_Collection_Framework.CF_02_SET;

import java.util.Set;
import java.util.TreeSet;

public class Lab242_HS {
    public static void main(String[] args)
    {
        Set<Integer> ts= new TreeSet<>();
        ts.add(6);
        ts.add(5);
        ts.add(9);
        ts.add(0);
        ts.add(-1);
        System.out.println(ts);
    }
}
