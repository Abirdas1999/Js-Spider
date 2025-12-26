package com.javaAbir.DSA.Queue.LinkedList;

class Demo {
    public static void main(String[] args) {

        LinklistQueue q = new LinklistQueue();

        System.out.println("----------Add------------");
        q.add(10);
        q.add(30);
        q.add(20);
        q.add(90);
        System.out.println(q);

        System.out.println("----------Peek------------");
        System.out.println(q.peek());
        System.out.println(q);

        System.out.println("----------Poll------------");
        System.out.println(q.poll());
        System.out.println(q);


        System.out.println("----------Remove------------");
        q.remove();
        System.out.println(q);

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

class LinklistQueue{
    private  Node first = null;
    private Node last = null;
    private int count = 0;

    //add()
    public void add(Object e) {
        if (first == null) {
            first = last = new Node(e);
            count++;
            return;
        }
        last.next = new Node(e);
        last = last.next;
        count++;
    }

    //size()
    public int size() {
        return count;
    }

    //peek()
    public Object peek() {
        if (first == null){
            throw new RuntimeException("No Element Found");
        }
        return first.ele;
    }

    //poll()
    public Object poll() {
        if (first == null){
            throw new RuntimeException("No Element Found");
        }
        Object o = first.ele;
        first = first.next;
        return o;
    }

    //remove()
    public void remove() {
        if (first == null){
            throw new RuntimeException("No Element Found");
        }
        first = first.next;
    }

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
