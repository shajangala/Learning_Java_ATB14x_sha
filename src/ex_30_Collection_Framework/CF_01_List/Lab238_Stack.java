package ex_30_Collection_Framework.CF_01_List;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args)
    {
        Stack s= new Stack();
        //Last In First Out LIFO
        s.add("Shamili");
        s.add("Mahima");
        s.add("Bhawna");
        s.add("Mehak");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

        s.add("Shamili");
        s.add("Mini");
        System.out.println(s);
    }
}
