package com.javaAbir.DSA.Queue.ArrayList;

class Demo {
    public static void main(String[] args) {

        System.out.println("----------Length------------");
        ArraylistQueue q = new ArraylistQueue();
        System.out.println(q.getLength());


        System.out.println("----------Length------------");
        ArraylistQueue q2 = new ArraylistQueue(30);
        System.out.println(q2.getLength());




        System.out.println("----------Add------------");
        q.getLength();
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

class ArraylistQueue {
    private Object[] arr;
    private int count = 0;


    public ArraylistQueue() {
        arr = new Object[5];
    }

    public ArraylistQueue(int initialize) {
        arr = new Object[initialize];
    }

    //getting length
    public int getLength(){
        return arr.length;
    }

    //increaseSize()
    private void increaseArraySize() {
        Object[] temp = new Object[arr.length + 3];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    //add()
    public void add(Object e) {
        if (count >= arr.length) increaseArraySize();
        arr[count++] = e;
    }

    //size()
    public int size() {
        return count;
    }

    //peek()
    public Object peek() {
        if (size() == 0 || arr[0] == null) {
            throw new RuntimeException("Index does not exits");
        }
        return arr[0];
    }

    //poll()
    public Object poll() {
        if (size() == 0 || arr[0] == null) {
            throw new RuntimeException("Index does not exits");
        }
        Object k = arr[0];
        for (int i = 1; i < size(); i++) {
            arr[i - 1] = arr[i];
        }
        --count;
        arr[count] = null;
        return k;
    }

    //remove()
    public void remove() {
        if (size() == 0 || arr[0] == null) {
            throw new RuntimeException("Index does not exits");
        }
        for (int i = 1; i < size(); i++) {
            arr[i - 1] = arr[i];
        }
        --count;
        arr[count] = null;

    }

    @Override
    public String toString() {
        if (size() == 0) return "[]";
        String s = "[ " + arr[0];
        for (int i = 0; i < size(); i++) {
            s = s + ", " + arr[i];
        }
        s += " ]";
        return s;
    }


}
