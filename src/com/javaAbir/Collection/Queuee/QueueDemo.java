package com.javaAbir.Collection.Queuee;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue <Integer> q = new PriorityQueue<>(new DecSort());
        q.add(10);
        q.add(60);
        q.add(40);
        q.add(30);
        q.add(20);
        q.add(90);
        while (!q.isEmpty()) System.out.print(q.poll()+" ");

    }


}
class DecSort implements Comparator {
    @Override
    public int compare(Object o1, Object o2)  {
        return (Integer)o2-(Integer)o1;
    }
}
