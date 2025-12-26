package com.javaAbir.DSA.ArrayList;

class Demo {
    public static void main(String[] args) {
        MyArrayList m = new MyArrayList();
//        System.out.println(m);
        m.add(10);
        m.add(30);
        m.add(20);
        m.add(50);
        m.add(60);
        System.out.println(m);
        System.out.println(m.get(3));
        m.add(3,60);
//        System.out.println(m.size());
//        m.remove(3);
        System.out.println(m);
    }

}

class MyArrayList {
    private Object[] arr;
    private int p = 0;

    public MyArrayList() {
        arr = new Object[5];
    }

    public MyArrayList(int initialize) {
        arr = new Object[initialize];

    }

    //add()
    public void add(Object e) {
        if (p >= arr.length) increaseArraySize();
        arr[p++] = e;
    }

    //size()
    public int size() {
        return p;
    }


    //get()
    public Object get(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }


    //add(index,e)
    public void add(int index, Object e) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (p >= arr.length) increaseArraySize();
        for (int i = size() - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = e;
        p++;
    }

    //increaseSize()
    private void increaseArraySize() {
        Object[] temp = new Object[arr.length + 3];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;

    }

    //remove()
    public void remove(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index + 1; i < size(); i++) {
            arr[i - 1] = arr[i];
        }
        --p;
        arr[p] = null;
    }

    //clear()
    public void clear() {
        arr = new Object[5];
        p = 0;
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
