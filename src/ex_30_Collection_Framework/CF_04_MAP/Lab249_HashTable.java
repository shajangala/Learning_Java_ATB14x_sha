package ex_30_Collection_Framework.CF_04_MAP;

import java.util.Hashtable;

public class Lab249_HashTable {
    public static void main(String[] args)
    {
        //Map k,v,null values allows
        // Hashtable -Synchronised, Slow and Legacy Class- Thread Safe
        // T1,T2 they will use one by one

        Hashtable<Integer, String> ht1= new Hashtable();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
        // ht1.put(4,null);     //NullPointerException
        // ht1.put(null,"five");  //NullPointerException

    }
}
