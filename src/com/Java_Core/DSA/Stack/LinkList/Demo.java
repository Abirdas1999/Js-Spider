package com.Java_Core.DSA.Stack.LinkList;

class Demo {
    public static void main(String[] args) {
        MyLinkListStack m = new MyLinkListStack();
        m.push(10);
        m.push(40);
        m.push(30);
        m.push(20);
        m.push(90);
        m.push(70);
        System.out.println(m);
//        System.out.println(m.peek());
//        System.out.println(m);
//        System.out.println(m.pop());
        m.remove();
        System.out.println(m);

    }
}

class Node {
    Node next;
    Object ele;

    public Node(Object ele) {
        this.ele = ele;
    }

    public Node(Object ele, Node next) {
        this.ele = ele;
        this.next = next;
    }
}

class MyLinkListStack {
    private Node first;
    private Node last;
    private int count = 0;


    //size()
    public int size() {
        return count;
    }

    //add()
    public void push(Object e) {
        if (first == null) {
            first = last = new Node(e);
            count++;
            return;
        }
        ;
        last.next = new Node(e);
        last = last.next;
        count++;
    }

    //peek()
    public Object peek() {
        if (size() == 0 || first == null) {
            throw new RuntimeException("No element is Found");
        }
        ;
        return last.ele;
    }

    //pop()
    public Object pop() {
        if (size() == 0 || first == null) {
            throw new RuntimeException("No element is Found");
        }
        Object o = last.ele;
        Node curr = first;
        while (curr.next.next != null){
            curr = curr.next;
        }
        curr.next =null;
        return o;
    }
    //remove()
    public void remove() {
        if (size() == 0 || first == null) {
            throw new RuntimeException("No element is Found");
        }
        Node curr = first;
        while (curr.next.next != null){
            curr = curr.next;
        }
        curr.next =null;;
    }

    @Override
    public String toString() {
        if (first == null) return "[]";
        Node curr = first;
        String s = "[ " + curr.ele;
        while (curr.next != null) {
            curr = curr.next;
            s = s +", "+curr.ele;
        }
        s += " ]";
        return s;
    }
}
