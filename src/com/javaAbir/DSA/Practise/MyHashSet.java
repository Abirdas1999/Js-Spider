package com.javaAbir.DSA.Practise;

class MyHashSet {
    public static void main(String[] args) {

    }

}
class Node {
    Node next;
    Object ele;
    public Node(Object ele){
        this.ele = ele;
    }
    public Node(Object ele, Node next){
        this.ele = ele;
        this.next = next;
    }
}
class HashsetMethod{
    private Node [] a = new Node[10];
    private int count  = 0;


    public int size(){
        return count;
    }
    public boolean add(){

        return false;
    }


}
