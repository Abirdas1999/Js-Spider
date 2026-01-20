package com.Java_Core.DSA.Linkedlist.Single;

class Demo {
    public static void main(String[] args) {
        Node first = null;
        first = new Node(10, null);
        first.next = new Node(20, null);
        first.next.next = new Node(30, null);
        first.next.next.next = new Node(40, null);

        Node curr = first;
        while (curr != null) {
            System.out.println(curr.ele);
            curr = curr.next;
        }
        //custom methods
        MyLinkedlList m = new MyLinkedlList();
        m.add(50);
    }

}

class Demo2 {
    public static void main(String[] args) {
        MyLinkedlList l = new MyLinkedlList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(1, 40);//adding logic for last position
        System.out.println(l.get(2));
//        l.remove(2);
        System.out.println("Size = "+l.size());
        System.out.println("Array = "+l);

    }

}

class Node {
    Node next;
    Object ele;

    public Node(Object ele, Node next) {
        this.ele = ele;
        this.next = next;
    }
}

class MyLinkedlList {
    private Node first = null;
    private Node last = null;
    private int count = 0;


    //add()
    public void add(Object e) {
        if (first == null) {
            first = last = new Node(e, null);
            count++;
            return;
        }
        last.next = new Node(e, null);
        last = last.next;
        count++;
    }


    //size()
    public int size() {
        return count;
    }

    //get()
    public Object get(int index) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node curr = first;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        return curr.next.ele;
    }

    //add(index,Object e)
    public void add(int index, Object e) {
        if (index <= -1 || index >=size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = new Node(e, first);
            count++;
            return;
        }
        Node curr = first;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        curr.next = new Node(e, curr.next);
        count++;

    }

    //remove()
    public void remove(int index) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = first.next;
            if (first == null) last = null;
            count--;
            return;
        }
        Node curr = first;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        if (curr.next == null) last = curr;
        count--;

    }

    //toString()

    @Override
    public String toString() {
        if (first == null) return "[]";
        Node curr = first;
        String s = "[ " + curr.ele;
        while (curr.next != null) {
            curr = curr.next;
            s += ", " + curr.ele;
        }
        s += "] ";
        return s;
    }
}
