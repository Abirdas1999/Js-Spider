package com.javaAbir.DSA.Stack.ArrayList;

class Demo {
    public static void main(String[] args) {
        MyArrayListStack m = new MyArrayListStack();


        m.push(10);
//        m.push(30);
//        m.push(20);
//        m.push(50);
//        m.push(70);
//        m.push(90);
//        m.push(60);
//        m.push(80);
//        System.out.println(m.pop());
//        System.out.println(m.peek());
        m.remove();
        System.out.println(m.size());
        System.out.println(m);


    }

}

class MyArrayListStack {
    private Object[] arr;
    private int count = 0;

    public MyArrayListStack() {
        arr = new Object[5];
    }

    public MyArrayListStack(int initialize) {
        arr = new Object[initialize];
    }

    //increase size
    private void increaseArraySize() {
        Object[] temp = new Object[arr.length + 3];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;

    }

    //push()
    public void push(Object e) {
        if (count >= arr.length) increaseArraySize();
        arr[count++] = e;
    }

    //size()
    public int size() {
        return count;
    }

    //peek()
    public Object peek() {
        if (size() == 0) {
            throw new RuntimeException("Index does not exits");
        }
        return arr[count - 1];
    }


    //pop()
    public Object pop() {
        if (size() == 0) {
            throw new RuntimeException("Index does not exits");
        }
        --count;
        Object k = arr[count];
        arr[count] = null;
        return k;
    }

    //remove()
    public void remove() {
        if (size() == 0 || arr[0] == null) {
            throw new RuntimeException("Index does not exits");
        }
        --count;
        arr[count] = null;

    }

    @Override
    public String toString() {
        if (size() == 0) return "[]";
        String s = "[ " + arr[0];
        for (int i = 1; i < size(); i++) {
            s = s + ", " + arr[i];
        }
        s += " ]";
        return s;
    }
}
