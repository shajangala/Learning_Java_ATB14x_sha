package ex_30_Collection_Framework.CF_01_List;
import java.util.ArrayList;
import java.util.List;

public class Lab227_List {
    public static void main(String[] args)
    {
        List fruits= List.of("Banana", "apple","guava","mango","watermelon");
        System.out.println(fruits);

        List arrayList= new ArrayList();
        arrayList.add("Sreenidhi");
        arrayList.add(2015);
        arrayList.add("Sriya");
        arrayList.add(true);


        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
