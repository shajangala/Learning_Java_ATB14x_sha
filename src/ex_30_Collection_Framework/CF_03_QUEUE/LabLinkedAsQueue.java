package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LabLinkedAsQueue {
    public static void main(String[] args)
    {
        Queue<Integer> queue= new LinkedList();
        queue.add(6);
        queue.add(4);
        queue.add(9);

        Iterator ite= queue.iterator();
        while (ite.hasNext())
        {
            System.out.println(ite.next());
        }

    }
}
