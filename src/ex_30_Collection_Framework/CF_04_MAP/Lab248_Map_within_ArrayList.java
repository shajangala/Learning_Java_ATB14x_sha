package ex_30_Collection_Framework.CF_04_MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab248_Map_within_ArrayList {
    public static void main(String[] args)
    {
        HashMap<String,String> student1= new HashMap();

        student1.put("Name","Shamili");
        student1.put("Roll", "1");
        student1.put("phone","8476596543");
        System.out.println(student1);

        HashMap<String,String> student2= new HashMap();
        student2.put("Name","Sree");
        student2.put("Roll","2");
        student2.put("Phone","8765945321");
        System.out.println(student2);

        List students= new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
