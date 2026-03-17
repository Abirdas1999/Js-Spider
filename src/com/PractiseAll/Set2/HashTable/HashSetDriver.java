package com.PractiseAll.Set2.HashTable;

import com.Java_Core.numberPG.Prime;

import java.util.HashSet;

class HashSetDriver {
	public static void main (String[] args) {
//		HashSet<Integer> h = new HashSet<> ();
		MyHashSet<Integer> m = new MyHashSet<> ();
		System.out.println (m.add (23));
		System.out.println (m.add (43));
		System.out.println (m.add (93));
		System.out.println (m.add (20));
		System.out.println (m.add (20));
	}


}

class Node {
	Node next;
	Object ele;

	public Node (Object ele) {
		this.ele = ele;
	}

	public Node (Node next, Object ele) {
		this.next = next;
		this.ele = ele;
	}

}

class MyHashSet<E> {
	private int count = 0;
	private Node[] arr = new Node[10];

	public int size () {
		return count;
	}

	public boolean isEmpty () {
		return count == 0;
	}

	public boolean add (Object key) {
		if (key == null) key += "";//✅handling null values.
		int index = Math.abs (key.hashCode () % arr.length);

		//for the empty array
		if (arr[index] == null) {
			arr[index] = new Node (key);
			count++;
			return true;
		}

		//for existing array position
		Node curr = arr[index];
		while (curr != null) {
			if (curr.ele.equals (key)) return false;
			if (curr.next == null) {
				curr.next = new Node (key);
				count++;
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	public boolean remove(Object key){
		int index = Math.abs (key.hashCode ()%arr.length);
		if (arr[index] == null)return false;
		return  true;
	}


}
