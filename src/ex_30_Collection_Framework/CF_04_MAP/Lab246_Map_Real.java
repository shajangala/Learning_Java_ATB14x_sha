package ex_30_Collection_Framework.CF_04_MAP;

import java.util.*;

public class Lab246_Map_Real {
    public static void main(String[] args)
    {
        Map<String,Object> student1= new HashMap();
        student1.put("Name","Shamili");
        student1.put("Phone",897654987);
        student1.put("Address","PNK");
        student1.put("Home_Address","AP");
        System.out.println(student1);

        Map<String,Object> student2= new LinkedHashMap();
        student2.put("Name","Sree");
        student2.put("Phone",987689876);
        student2.put("Address","PNK");
        student2.put("Home_Address","HP");
        System.out.println(student2);

        Set book_read_items= new HashSet();
        book_read_items.add("Rich dad poor dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");
        System.out.println(book_read_items);

    }
}
