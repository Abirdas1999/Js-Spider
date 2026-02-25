package com.Java_Core.DSA.Practise2;

import java.util.ArrayList;

class Demo {
	public static void main (String[] args) {
//		ArrayList<Integer> ae = new ArrayList<> ();
//		ae.add (45);
		MyArrayList m = new MyArrayList ();
		m.addLast (23);
		m.add (34);
		m.add (67);
		m.addLast (53);
		m.add (86);
		m.add (3, 39);
		m.addFirst (21);
		System.out.println (m);
	}

}

class MyArrayList {
	private Object[] arr;
	private int count = 0;

	//constructor
	public MyArrayList () {
		arr = new Object[5];
	}

	public MyArrayList (int initialize) {
		arr = new Object[initialize];
	}

	//increaseSize()
	private void increaseSize () {
		Object[] temp = new Object[arr.length + 3];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}

	//size()
	public int size () {
		return count;
	}

	//isEmpty()
	public boolean isEmpty () {
		return count == 0;
	}

	//add(element)
	public boolean add (Object e) {
		if (size () >= arr.length) increaseSize ();
		arr[size ()] = e;
		count++;
		return true;
	}

	//add(index,element)
	public void add (int index, Object e) {
		if (index < 0 || index >= size ()) {
			throw new RuntimeException ("Index is not valid");
		}
		if (size () >= arr.length) increaseSize ();
		for (int i = size () - 1; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index] = e;
		count++;
	}

	//addLast()
	public void addLast (Object e) {
		if (size () >= arr.length) increaseSize ();
		arr[count] = e;
		count++;
	}

	//addFirst()
	public void addFirst (Object e) {
		if (size () >= arr.length) increaseSize ();
		for (int i = size () - 1; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = e;
		count++;
	}


	//toString
	@Override
	public String toString () {
		String s = "";
		if (size () == 0) return s += "[]";

		s = s + "[" + arr[0];
		for (int i = 1; i < size (); i++) {
			s += "," + arr[i];
		}
		s += "]";
		return s;
	}
}

