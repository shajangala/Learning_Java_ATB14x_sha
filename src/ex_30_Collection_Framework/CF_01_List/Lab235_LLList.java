package ex_30_Collection_Framework.CF_01_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab235_LLList {
    public static void main(String[] args)
    {
        List mylist= new ArrayList();
        List mylist1=new ArrayList(10);
        List mylist2= List.of("12","123");

        List mylist3= new LinkedList();
        mylist3.add(2);
        mylist3.add(40);
        mylist3.add(57);
        mylist3.add(61);
        mylist3.add(2);
        System.out.println(mylist3);
    }
}
