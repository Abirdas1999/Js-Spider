package com.Exam.HashSet;

class Node {
	Node next ;
	Object ele;
	public Node(Node next,Object ele){
		this.next = next;
		this.ele = ele;
	}
	public Node(Object ele){
		this.ele = ele;
	}
}
class MyHashSet{
	private Node [] arr = new Node [10];//
	private int count = 0;

	public int size(){
		return count;
	}
	public boolean isEmpty(){
		return count == 0;
	}
//	public boolean add(Object ele){
//
//		if (ele == null) ele += "";
//		int index = Math.abs (ele.hashCode () % arr.length); //hashing
//
//		//empty
//		if (arr[index] == null){
//			arr[index] = new Node (ele);
//			count++;
//			return true;
//		}
//		//already occupy
//		Node curr = arr[index];
//		Node prev = null;
//		while (curr != null){
//
//			if (curr.next == null) {
//
//			}
//		}
//
//
//
//
//
//
//
//
//
//
//
//	}






}


