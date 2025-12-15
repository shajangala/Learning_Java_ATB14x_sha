package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.PriorityQueue;

public class Lab243_Queue {

    public static void main(String[] args)
    {
        PriorityQueue pq= new PriorityQueue();
        pq.add("Sree");
        pq.add("Sri");
        pq.add("SS");
        System.out.println(pq);  //natural sorting

        System.out.println(pq.peek());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
