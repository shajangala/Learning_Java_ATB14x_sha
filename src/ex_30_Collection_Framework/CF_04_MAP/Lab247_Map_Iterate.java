package ex_30_Collection_Framework.CF_04_MAP;

import java.util.*;

public class Lab247_Map_Iterate {
    public static void main(String[] args)
    {
        Map<String,Integer> m= new HashMap();

        m.put("id",1);
        m.put("id2",2);
        m.put("id3",12);
        m.put("id4",null);
        m.put("id5",null);
        m.put(null,100);
        System.out.println(m);
        System.out.println(m.size());

        for(Map.Entry<String,Integer> item: m.entrySet())
        {
            System.out.println(item.getKey() + "->" + item.getValue());
        }


    }
}
