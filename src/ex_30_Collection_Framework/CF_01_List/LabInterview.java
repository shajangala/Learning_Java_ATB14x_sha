package ex_30_Collection_Framework.CF_01_List;

import java.util.ArrayList;
import java.util.Collections;

public class LabInterview {
    public static void main(String[] args)
    {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);

        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

        for(Integer i:al)
        {
            System.out.println(6*i);
        }
    }
}
