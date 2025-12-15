package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244_Map_P1 {
    public static void main(String[] args)
    {
        Map m= new HashMap();
        m.put("name", "Shamili");
        m.put("Roll no", "20");
        m.put(true,"Shamili");
        m.put(3.14,"Pi value");


        Map m1= new HashMap();
        m1.put("name", "Shamili");
        m1.put("Roll no", 12);
        m1.put("Phone no",867543297);
        System.out.println(m1);

        Map m2= new LinkedHashMap();
        m2.put("Name","Shamili");
        m2.put("Roll no",12);
        m2.put("Phone no",897658765);
        System.out.println(m2);

        Map m3= new TreeMap();
        m3.put("Name", "Shamili");
        m3.put("Roll no", 12);
        m3.put("Phone no",876549876);
        System.out.println(m3);
    }
}
