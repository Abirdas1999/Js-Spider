package com.Java_Core.ZZpractise;

import java.util.LinkedList;
import java.util.List;

class Node {
	Node next;
	Object ele;
	public Node(Object ele){
		this.ele = ele;
	}
	public Node(Node next,Object ele){
		this.next = next;
		this.ele = ele;
	}
}
class MyLinkList{
	Node first;
	Node last;
	int count = 0;
	public int size(){return count;}
	public boolean isEmpty(){return count==0;}
	public void display(){
		Node curr = first;
		while (curr != null){
			System.out.print (curr.ele+" --> ");
			curr = curr.next;
		}
	}
	@Override
	public String toString() {
		if (first == null) return "[]";
		Node curr = first;
		String s = "[ " + curr.ele;
		while (curr.next != null) {
			curr = curr.next;
			s += ", " + curr.ele;
		}
		s += "] ";
		return s;
	}

	public boolean add(Object ele){
		if (isEmpty ()){
			first = last = new Node(ele);
			count++;
			return true;
		}
		Node n = new Node(ele);
		last.next = n;
		last = n;
		count++;
		return  true;
	}
	public void add(Object ele,int index){
		if (index<0 || index > size ()){
			throw new  IndexOutOfBoundsException("provide current index");
		}
		if (index==0){
			first = new Node(first,ele);
			count++;
			return;
		}
		if (index == size ()){
			Node n = new Node (ele);
			last.next = n;
			last = n;
			count++;
			return;
		}
		Node curr = first;
		for (int i = 1; i <index ; i++) {
			curr = curr.next;
		}
		curr.next = new Node (curr.next,ele);
		count++;

	}

}
class Demo {
	public static void main(String[] args) {
//		List<Integer> l = new LinkedList<> ();

		MyLinkList m = new MyLinkList ();
		System.out.println (m.add (23));
		System.out.println (m.add (33));
		System.out.println (m.add (35));
		m.add (12,3);

		System.out.println (m.toString ());






	}

}
