package ex_30_Collection_Framework.CF_02_SET;

import java.util.*;

public class Lab241_SET_HS_LHS_TS {
    public static void main(String[] args)
    {
        Set<String> hs= new HashSet<>();
        //Hashing mechanism to store the element , no order
        // no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Grapes");
        hs.add("Watermelon");
        hs.add("Watermelon");
      //hs.add(123);
        hs.add(null);
        System.out.println(hs);
        System.out.println("------Linked Hashset--------");
        Set lhs= new LinkedHashSet();
        //Linked list mechanism to store the element,
        // order will maintain, no duplicates

        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Guava");
        lhs.add("Orange");
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("------TreeSet---------");
        Set ts= new TreeSet();
        //Black and Red Tree mechanism to store the element
        // natural sorting order will be maintained.

        ts.add("Apple");
        ts.add("Pineapple");
        ts.add("Grapes");
        ts.add("Apple");
        ts.add("Orange");
        System.out.println(ts);


    }
}
