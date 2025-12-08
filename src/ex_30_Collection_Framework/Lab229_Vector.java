package ex_30_Collection_Framework;

import java.util.Vector;

public class Lab229_Vector {
    public static void main(String[] args){
        Vector vector = new Vector();
        vector.add("Shamili");
        vector.add("Sriya");
        vector.add("Legacy");
        System.out.println(vector);
        vector.remove("Shamili");
        System.out.println(vector);
        System.out.println(vector.contains("Sriya"));
    }
}
