package com.Java_Core.DSA.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class ArrayListMain<E> {
	private Object[] arr;
	private int count = 0;

	public ArrayListMain () {
		arr = new Object[10];
	}

	public ArrayListMain (int initialized) {
		arr = new Object[initialized];
	}

	private void increasedSize () {
		Object[] temp = new Object[((arr.length * 3) / 2) + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}

	public int size () {
		return count;
	}

	public boolean isEmpty () {
		return count == 0;
	}

	public boolean add (Object key) {
//		if (size () == arr.length - 1) increasedSize ();
		if (isEmpty ()) {
			addFirst (key);
		} else {
			addLast (key);
		}
		return true;
	}
	public void add(int index,Object key){
		if (index < 0 || index > size ()) {
			throw new IndexOutOfBoundsException ();
		}
		if (size() == arr.length - 1) {
			increasedSize ();
		}
		if(index==0){
			addFirst (key);
			return;
		}
		 if (index==size ()){
			addLast (key);
			return;
		}
		for (int i = size (); i >index ; i--) {
			arr[i]=arr[i-1];
		}
		arr[index] = key;
		count++;
	}

	public void addLast (Object key) {
		if (size () == arr.length - 1) increasedSize ();
		arr[count++] = key;
	}

	public void addFirst (Object key) {
		if (size () == arr.length - 1) increasedSize ();
		if (isEmpty ()) {
			arr[0] = key;
			count++;
			return;
		}
		for (int i = size (); i >= 1; i--) {  //[1,2,3,4,4,5,1,-]
			arr[i] = arr[i - 1];
		}
		arr[0] = key;
		count++;

	}

	public Object getFirst () {
		return arr[0];
	}

	public Object getLast () {
		return arr[count - 1];
	}

	public Object get (int index) {
		if (index < 0 || index >= size ()) {
			throw new IndexOutOfBoundsException ();
		}
		return arr[index];
	}

	public Object removeFirst () {
		if (isEmpty ()) return -1;
		Object key = arr[0];
		for (int i = 0; i < size (); i++) {
			arr[i] = arr[i + 1];
		}
		arr[count-1] = null;
		count--;
		return key;
	}

	public Object removeLast () {
		Object key = arr[count - 1];
		arr[count - 1] = null;
		return key;
	}

	public Object remove (int index) {
		if (index < 0 || index >= size ()) {
			throw new IndexOutOfBoundsException ();
		}
		if (index == 0) return removeFirst ();
		else if (index == size () - 1) return removeLast ();

		Object key = arr[index];
		for (int i = index; i < size (); i++) {
			arr[i] = arr[i + 1];
		}
		arr[count-1] = null;
		count--;
		return key;
	}

	@Override
	public String toString () {
		String s = "[ ";
		if (!isEmpty ()) {
			s += arr[0];
			for (int i = 1; i < size (); i++) {
				s += ", " + arr[i];
			}
		}
		s += " ]";
		return s;
	}
}

class MyArrayList {
	public static void main (String[] args) {
		ArrayList<Integer> a = new ArrayList<> ();
		Queue<Integer> q = new LinkedList<> ();
//		a.add
//		ArrayListMain<Integer> a = new ArrayListMain<> ();
		System.out.println (a.add (23));
		System.out.println (a.add (45));
//		System.out.println (a.add (56));
		a.addFirst (3);
		a.addLast (4);
		System.out.println (a.toString ());


	}


}
