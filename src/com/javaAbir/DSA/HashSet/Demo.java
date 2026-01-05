package com.javaAbir.DSA.HashSet;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        MyHashSet s = new MyHashSet();
        s.add(30);
        s.add(70);
        s.add(94);
        s.add(54);
        s.add(33);
        s.add(0);
        s.add(40);
        s.add(20);
        s.add(23);
        s.add(25);
        s.remove(23);
        s.display();
    }

}

class Node {
    Node next;
    Object ele;

    public Node(Object ele, Node next) {
        this.ele = ele;
        this.next = next;
    }

    public Node(Object ele) {
        this.ele = ele;
    }
}

class MyHashSet {
    private Node[] a = new Node[10];
    private int count = 0;

    public int size() {
        return count;
    }

    public boolean add(Object ele) {
        if (ele == null) ele += "";
        Node n = new Node(ele);
        int index = Math.abs(ele.hashCode() % a.length);
        if (a[index] == null) {
            a[index] = n;
            count++;
            return true;
        }
        Node curr = a[index];
        Node temp = null;
        while (curr != null) {
            if (curr.ele.equals(ele)) return false;
            temp = curr;
            curr = curr.next;
        }
        temp.next = n;
        count++;
        return true;
    }

    public boolean contains(Object ele) {
        int index = Math.abs(ele.hashCode() % a.length);
        Node curr = a[index];
        while (curr != null) {
            if (curr.ele.equals(ele)) return true;
            curr = curr.next;
        }
        return false;
    }

    public boolean remove(Object ele) {
        int index = Math.abs(ele.hashCode() % a.length);
        Node curr = a[index];
        Node prev = null;
        while (curr != null) {
            if (curr.ele.equals(ele)) {
                if (prev == null) {
                    a[index] = a[index].next;
                    count--;
                    return true;
                }
                prev.next = prev.next.next;
                count--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    public void display() {

        for (int i = 0; i < a.length; i++) {
            Node curr = a[i];
            while (curr != null) {
                System.out.print(curr.ele + " ");
                curr = curr.next;
            }

        }
    }
}

