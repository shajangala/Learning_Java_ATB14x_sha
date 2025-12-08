package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab232_Nested_ArrayList {
    public static void main(String[] args)
    {
        List<String> fruits= new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("cherry");
        // fruits.add(123);
        System.out.println(fruits);
         List<String> fruits2= new ArrayList();
         fruits2.add("grapes");
         fruits2.add("papaya");
         fruits2.add("mango");
        System.out.println(fruits2);

        System.out.println("----------");
        for(Object o:fruits2)
        {
            System.out.println(o);
        }

        System.out.println("----------");
        Iterator i= fruits2.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

        List vegetable= new ArrayList();
        vegetable.add("potato");
        vegetable.add("Tomato");
        vegetable.add("onion");
        System.out.println(vegetable);

        System.out.println("-----------");
        Iterator i1=vegetable.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }

        List all_fruits_vegetables= new ArrayList();
        all_fruits_vegetables.add(fruits);
        all_fruits_vegetables.add(fruits2);
        all_fruits_vegetables.add(vegetable);
        System.out.println(all_fruits_vegetables);
        System.out.println(all_fruits_vegetables.size());
        System.out.println(all_fruits_vegetables.get(1));

    }
}
