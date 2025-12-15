package ex_30_Collection_Framework.CF_01_List;

import java.util.ArrayList;
import java.util.*;

public class Lab237_AL_Iteration {
    public static void main(String[] args)
    {
        List<String> mylist= new ArrayList();
        mylist.add("Shamili");
        mylist.add("Sreenidhi");
        mylist.add("Sriya");
        mylist.add("Avinash");
        System.out.println("-To print ArrayList - 1");
        for(String str:mylist)
        {
            System.out.println(str);
        }
        System.out.println();
        System.out.println("-To print ArrayList - 2");
        Iterator<String> ite=mylist.iterator();
        while (ite.hasNext())
        {
            System.out.println(ite.next());
        }
        System.out.println();
        System.out.println("-To print ArrayList - 3");
        for(int i=0;i<mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }
    }
}
