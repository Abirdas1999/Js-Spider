package com.javaAbir.DSA.BinarySearchTreee;
import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    public static void main(String[] args) {
        MyBinarySearchTree m = new MyBinarySearchTree();
        m.add(20);
        m.add(10);
        m.add(40);
        m.add(40);
        m.add(60);
        m.add(32);
        m.add(90);
//        m.remove(20);
//        m.In_Order();
//        m.Pre_Order();
        m.level_Order();


    }

}

class Node {
    Node left;
    Node right;
    int key;

    public Node(int ele) {
        this.key = ele;
    }

    public Node(Node left, int ele, Node right) {
        this.left = left;
        this.key = ele;
        this.right = right;
    }
}

class MyBinarySearchTree {
    private Node root;
    private int count = 0;
    private boolean flag;

    public int size() {
        return count;
    }


    //add()
    public boolean add(int key) {
        flag = true;
        Node n = new Node(key);
        root = add(root, key);
        return flag;
    }


    //add() -- helper method
    private Node add(Node n, int key) {
        if (n == null) {
            Node node = new Node(key);
            count++;
            return node;
        }
        if (key < n.key) {
            n.left = add(n.left, key);
        } else if (key > n.key) {
            n.right = add(n.right, key);
        } else {
            flag = false;
        }
        return n;
    }


    //min()
    private int min(Node n) {
        int min = n.key;
        while (n.left != null) {
            min = n.left.key;
            n = n.left;
        }
        return min;
    }

    //max()
    private int max(Node n) {
        int max = n.key;
        while (n.right != null) {
            max = n.right.key;
            n = n.right;
        }
        return max;
    }

    public boolean remove(int key) {
        int oldSize = count;
        root = remove(root, key);
        return count < oldSize;

    }

    //remove()--helper method
    private Node remove(Node n, int key) {
        if (n == null) return null;
        if (key < n.key) n.left = remove(n.left, key);
        else if (key > n.key) n.right = remove(n.right, key);
        else {
            if (n.left == null) {
                count--;
                return n.right;
            } else if (n.right == null) {
                count--;
                return n.left;
            } else {
                n.key = min(n.right);
                n.right = remove(n.right, n.key);
            }
        }
        return n;
    }


    //level_Order
    public void level_Order() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);//adding element to queue
        while (!q.isEmpty()) {
            Node n = q.poll();
            System.out.print(n.key + "\t");
            if (n.left != null) q.add(n.left);
            if (n.right != null) q.add(n.right);
        }
    }


    //Pre_Order
    private void Pre_Order(Node n) {
        if (n == null) return;
        System.out.print(n.key + "\t");
        Pre_Order(n.left);
        Pre_Order(n.right);
    }

    public void Pre_Order() {
        Pre_Order(root);
    }


    //Post_Order
    private void Post_Order(Node n) {
        if (n == null) return;
        Post_Order(n.left);
        Post_Order(n.right);
        System.out.print(n.key + "\t");
    }

    public void Post_Order() {
        Post_Order(root);
    }


    //In_Order
    private void In_Order(Node n) {
        if (n == null) return;
        In_Order(n.left);
        System.out.print(n.key + "\t");
        In_Order(n.right);
    }

    public void In_Order() {
        In_Order(root);
    }

}

