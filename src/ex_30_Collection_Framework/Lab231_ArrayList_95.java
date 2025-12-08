package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab231_ArrayList_95 {
    public static void main(String[] args){
        List list= new ArrayList<>();
        list.add("Bread");
        list.add("Milk");
        list.add("Butter");
        list.add("Paneer");
        list.add("Jam");
        list.add("cheeze");
        list.add(123);
        list.add(true);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("1"));

        System.out.println("------------");
        for (int i=0;i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("-------------");
        for(Object o:list)
        {
            System.out.println(o);
        }

        System.out.println("-------------");
        Iterator i=list.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
