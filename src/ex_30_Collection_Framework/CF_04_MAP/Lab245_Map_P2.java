package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;

public class Lab245_Map_P2 {
    public static void main(String[] args)
    {
        // Map m= new HashMap();
        HashMap m1= new HashMap();
        m1.put("id",1);
        m1.put("id",2);
        m1.put("id2",100);
        m1.put("id4",null);
        m1.put(null,02);
        System.out.println(m1);

        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey("id2"));
        System.out.println(m1.containsValue(100));

        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.get("id2"));
    }
}
