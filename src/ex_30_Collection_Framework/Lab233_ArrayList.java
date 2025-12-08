package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab233_ArrayList {
    public static void main(String[] args)
    {
        List marks=new ArrayList();
        marks.add(93);
        marks.add(97);
        marks.add(67);
        marks.add(89);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
    }
}
