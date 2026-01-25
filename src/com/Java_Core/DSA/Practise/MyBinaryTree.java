package com.Java_Core.DSA.Practise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

class MyBinaryTree {
	public static void main(String[] args) {
	    TreeClass t = new TreeClass ();
		t.insert (56);
		t.insert (86);
		t.insert (56);
		t.insert (16);
		t.insert (1);
		t.insert (19);
		t.insert (96);

//		for (int i = 1; i <= 10; i++) {
////			System.out.println (t.insert (i+1));
//			t.insert ((i*i));
//		}
//		t.in_Order ();
//		System.out.println ();
//		t.level_Order ();
		t.printFromRoot ();
		t.remove (56);
		System.out.println ("----");
		t.printFromRoot ();
		System.out.println (t.contain (25));
	}

}

//creating a node class
class Node{
	Node left;
	int ele;
	Node right;

	public Node(Node left,int ele,Node right){
		this.left = left;
		this.ele = ele;
		this.right = right;
	}
	public Node(int ele){
		this.ele = ele;
	}


}

//creating a TreeClass
class TreeClass{
	private int count = 0;
	private boolean flag;
	private Node root;


	//creating the size()
	public int size(){
		return count;
	}

	//insert()
	public boolean insert(int ele){
		flag = true;
		Node n = new Node (ele);
		root = insert (root,n.ele);
		return flag;
	}

	//insert helper method
	private Node insert(Node n,int ele) {
		if (n == null) {
			count++;
			Node node = new Node (ele);
			flag = true;
			return node;
		}

		if (ele > n.ele) {
			n.right = insert (n.right, ele);
		} else if (ele<n.ele) {
			n.left = insert (n.left, ele);
		}else{
			flag = false;
		}
		return n;
	}

	//contain()
	public boolean contain(int ele){
		return contain (root,ele);
	}
	//contain helper method
	private boolean contain(Node n, int ele){
		if (n == null) return false;
		if (ele == n.ele) return true;
		else if (ele>n.ele) return contain (n.right,ele);
		else return contain (n.left,ele);
	}



	//in-Order
	public void in_Order(){
		in_Order (root);
	}
	private void in_Order(Node n){
		if (n == null) return;
		in_Order (n.left);
		System.out.print (n.ele+"\t");
		in_Order (n.right);
	}

	//pre-Order
	public void pre_Order(){
		pre_Order (root);
	}
	private void pre_Order(Node n){
		if (n == null) return;
		System.out.print (n.ele+"\t");
		pre_Order (n.left);
		pre_Order (n.right);
	}

	//post-Order
	public void post_Order(){
		post_Order (root);
	}
	private void post_Order(Node n){
		if (n == null) return;
		post_Order (n.left);
		post_Order (n.right);
		System.out.print (n.ele+"\t");
	}

	//level-Order
	public void level_Order(){
		Queue<Node> q = new LinkedList<>();
		q.add (root);

		while (!q.isEmpty ()){
			Node n = q.poll ();
			System.out.println (n.ele+"\t");
			if (n.left!=null)q.add (n.left);
			if (n.right!=null)q.add (n.right);
		}
	}

	//Print-Root-Leaf
	public void printFromRoot(){
		printFromRoot(root,new ArrayList<>());
	}
	private void printFromRoot(Node n,ArrayList<Integer> list){
		if (n == null) return;

		list.add (n.ele);
		if (n.right == null && n.left == null)printPath(list);
		else {
			printFromRoot(n.left,list);
			printFromRoot(n.right,list);
		}

		//for backtracking⭐️⭐️⭐️⭐️
		list.remove (list.size ()-1);


	}
	private void printPath (ArrayList<Integer> list) {
		System.out.println (list.stream ().map (String::valueOf).collect (Collectors.joining ("-->")));
	}



	//min() & max()
	private int getMax(Node n){
		int max = n.ele;
		while (n.right!=null){
			max = n.right.ele;
			n = n.right;
		}
		return max;
	}

	private int getMin(Node n){
		int min = n.ele;
		while (n.left!=null){
			min = n.left.ele;
			n = n.left;
		}
		return min;
	}

	//remove()
	public boolean remove(int ele){
		int newSize = count;
		root = remove (root,ele);
		return newSize<count;
	}
	private Node remove(Node n,int ele){
		if (n == null) return null;
		if (n.ele>ele) n.left = remove (n.left,ele);
		else if (n.ele<ele) n.right = remove (n.right,ele);
		else {
			if (n.right == null){
				count--;
				return n.left;
			}else if (n.left == null){
				count--;
				return n.right;
			}else {
				n.ele = getMin(n.right);
				n.right = remove (n.right,n.ele);
			}
		}
		return n;
	}
//	private Node remove(Node n,int ele){
//		if (n == null) return null;
//		if (n.ele > ele) n.left = remove (n.left,ele);
//		else if (n.ele<ele) n.right = remove (n.right,ele);
//		else {
//			if (n.right==null){
//				count--;
//				return 	n.left;
//			}else if (n.left == null){
//				count--;
//				return 	n.right;
//			}else {
//				n.ele = getMin(n.right);
//				n.right = remove(n.right, n.ele);
//			}
//		}
//		return n;
//
//	}

}
