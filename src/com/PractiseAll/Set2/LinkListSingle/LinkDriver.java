package com.PractiseAll.Set2.LinkListSingle;


import java.util.LinkedList;
import java.util.List;

class MyLinkListSingle {
	private Node first;
	private Node last;
	private int count = 0;


	public int size () {
		return count;
	}
	public boolean isEmpty () {
		return count == 0;
	}
//	*************************add******************************
	public void addFirst (Object ele) {
		if (isEmpty ()) {
			first = last = new Node (ele);
			count++;
			return;
		}
		Node n = new Node (first, ele);
		first = n;
		count++;
	}

	public void addLast (Object ele) {
		if (isEmpty ()) {
			first = last = new Node (ele);
			count++;
			return;
		}
		Node n = new Node (ele);
		last.next = n;
		last = n;
		count++;

	}

	public boolean add (Object ele) {
		if (isEmpty ()) {
			addFirst (ele);
			return true;
		} else {
			addLast (ele);
			return true;
		}
	}

	public void add (Object ele, int index) {
		if (index < 0 || index > size ()) {
			throw new IndexOutOfBoundsException ();
		}
		if (index == 0) {
			addFirst (ele);
			return;
		} else if (index == size ()) {
			addLast (ele);
			return;
		}
		Node curr = first;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
		curr.next = new Node (curr.next, ele);
		count++;


	}

//	*************************remove******************************
	public Object removeFirst () {
	if (isEmpty ()) {
		return -1;
	}
	Object key = first.ele;
	first = first.next;
	if (first == null)last=null;
	count--;
	return key;
}

	public Object removeLast () {
		if (isEmpty ()) {
			return -1;
		}

		Object key = last.ele;
		// only one element
		if (first == last) {
			first = last = null;
			count--;
			return key;
		}

		Node curr = first;
		while (curr.next!=last) {
			curr = curr.next;
		}
		last = curr;
		last.next=null;
		count--;
		return key;

	}

	public boolean remove (Object ele) {
		if (isEmpty ()) {
			return false;
		}
		if (first.ele.equals(ele)){
			removeFirst ();
			return true;
		}
		Node curr = first;
		while (curr.next != null){
			if (curr.next.ele.equals(ele)){
				if (curr.next == last) {
					last = curr;
				}
				curr.next=curr.next.next;
				count--;
				return true;
			}
			curr=curr.next;
		}
		return false;
	}

	public void remove (Object ele, int index) {
		if (index < 0 || index >= size ()) {
			throw new IndexOutOfBoundsException ();
		}
		if (index == 0) {
			removeFirst ();
			return;
		} else if (index == size ()-1) {
			removeLast ();
			return;
		}
		Node curr = first;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		count--;
	}

//	*************************get******************************
	public Object getFirst(){
		if (isEmpty ()) {
			return null;
		}
		return first.ele;
	}
	public Object getLast(){
		if (isEmpty ()) {
			return null;
		}
		return last.ele;
	}
	public Object get(int index){
		if (index < 0 || index >= size ()) {
			throw new IndexOutOfBoundsException ();
		}
		if (isEmpty ()) {
			return null;
		}
		if (index==0){
			return getFirst ();
		}
		if (index==size ()-1){
			return getLast ();
		}
		Node curr = first;
		for (int i = 1; i <= index; i++) {
			curr = curr.next;
		}
		return curr.ele;

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

class LinkDriver {
	public static void main (String[] args) {
		List<Integer>l=new LinkedList<> ();

	}

}
