package com.Exam.LinkList;
class Demo{
	public static void main(String[] args) {
	    MyLinkList  m = new MyLinkList ();
		m.add (2);
		m.add (20);
		m.add (12);
		m.add (25);
		m.add (21);
		m.add (32);
		System.out.println ("original -> "+m.toString ());
		m.reverse ();
		System.out.println ("reversed -> "+m.toString ());

	}

}
class Node {
	Node next;
	Object ele;
	public Node (Object ele){
		this.ele=ele;
	}
	public Node (Node next,Object ele){
		this.next = next;
		this.ele=ele;
	}
}
class MyLinkList{
	private Node first = null;
	private Node last = null;
	private int count = 0;

	//add()
	public void add(Object e) {
		if (first == null) {
			first = last = new Node (null,e);
			count++;
			return;
		}
		last.next = new Node ( null,e);
		last = last.next;
		count++;
	}

	public void reverse(){
		Node curr = first;
		Node next = null;
		Node prev = null;

		while (curr!= null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		first = prev;
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
}
