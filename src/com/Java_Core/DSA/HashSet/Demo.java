package com.Java_Core.DSA.HashSet;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        MyHashSet s = new MyHashSet();
//	    HashSet<Integer> h = new HashSet<> ();
        s.add(30);
        s.add(20);
        s.add(23);
        s.add(25);
	    System.out.println (s.remove(30));
        s.display();
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

class MyHashSet {
	private Node[] a = new Node[10];
	private int count = 0;

	public int size () {
		return count;
	}

	public boolean isEmpty () {
		return count == 0;
	}

	//add()
	public boolean add (Object ele) {
		if (ele == null) ele += "";
		int index = Math.abs (ele.hashCode () % a.length);

		//for the empty
		if (a[index] == null) {
			a[index] = new Node (ele);
			count++;
			return true;
		}

		//for the already occupied
		Node curr = a[index];
		while (true) {
			//duplicate
			if (ele.equals (curr.ele)) return false;
			if (curr.next == null) {
				curr.next = new Node (ele);
				count++;
				return true;
			}
			curr = curr.next;
		}

	}

	//remove
	public boolean remove (Object ele) {
		int index = Math.abs (ele.hashCode () % a.length);

		//for the empty
		if (a[index] == null) {
			return false;
		}
		Node curr = a[index];
		Node prev = null;

		while (curr != null) {
			if (curr.ele.equals (ele)) {
				//for 1st one
				if (prev == null) {
					a[index] = curr.next;
				}
				//for last one
				else if (curr.next == null) {
					prev.next = null;
				}
				//for middle one
				else {
					prev.next = curr.next;
				}

				count--;
				return true;
			}
			prev = curr;
			curr = curr.next;

		}
		return false;

	}

	//clear()
	public void clear(){
		Node[] temp = new Node[a.length];
		a = temp;
		count = 0;
	}

	//contains
	public boolean contains(Object ele){
		if (ele == null) return false;
		int index = Math.abs (ele.hashCode () % a.length);
		//for the empty
		if (a[index] == null) {
			return false;
		}
		Node curr = a[index];

		while (curr != null) {
			if (curr.ele.equals (ele)) {
				return true;
			}
			curr = curr.next;

		}
		return false;
	}

	//display
	public void display () {
		if (isEmpty ()){
			System.out.println ("[]");
			return;
		}

		for (int i = 0; i < a.length; i++) {
			Node curr = a[i];
			while (curr != null) {
				System.out.print (curr.ele + " ");
				curr = curr.next;
			}

		}
	}




}

