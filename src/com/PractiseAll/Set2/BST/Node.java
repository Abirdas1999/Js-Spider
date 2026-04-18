package com.PractiseAll.Set2.BST;

import com.sun.source.tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class MyBSTDriver{
	public static void main(String[] args) {
	}

}
class Node {
	Node left;
	Node right;
	int ele;

	public Node (int ele) {
		this.ele = ele;
	}

	public Node (Node left, Node right, int ele) {
		this.left = left;
		this.right = right;
		this.ele = ele;
	}
}

class MyBST {
	private int count = 0;
	private boolean flag;
	private Node root;

	public int size () {
		return count;
	}

	public boolean isEmpty () {
		return count == 0;
	}

	//insert
	public boolean insert (int key) {
		flag = true;
		root = insert (root, key);
		return flag;
	}
	private Node insert (Node n, int key) {
		if (n == null && isEmpty ()) {
			Node node = new Node (key);
			count++;
			flag = true;
			return node;
		}
		if (n.ele > key) {
			n.left = insert (n.left, key);
		} else if (n.ele < key) {
			n.right = insert (n.right, key);
		} else {
			flag = false;
		}
		return n;
	}

	//delete
	public boolean delete(int key){
		int oldCount = count;
		root = delete (root,key);
		return oldCount>count;
	}
	private int getMin(Node n){
		while (n.left != null){
			n = n.left;
		}
		return n.ele;
	}
	private Node delete(Node n,int key){
		if (n == null){
			return n;
		}
		if (n.ele>key){
			n.left = delete (n.left,key);
		}else if (n.ele<key){
			n.right = delete (n.right,key);
		}else {
			if (n.right == null){
				count--;
				return n.left;
			}else if (n.left == null){
				count--;
				return n.right;
			}else {

				n.ele = getMin(n.right);
				//delete again duplicate value...
				n.right = delete (n.right,n.ele);
			}
		}
		return n;
	}

	//search
	public boolean search(int key){
		return search (root,key);
	}
	private boolean search(Node n,int key){
		if (n == null){
			return false;
		}
		if (n.ele>key){
			return search (n.left, key);
		}else if (n.ele<key){
			return search (n.right,key);
		}else {
			return true;
		}
	}

	//traversal
	//in_order
	public void in_order(){
		in_order (root);
	}
	private void in_order(Node n){
		if (n==null)return;
		in_order (n.left);
		System.out.println (n.ele+"\t");
		in_order (n.right);
	}
	//level_order
	public void level_order(){
		Queue<Node> q = new LinkedList<> ();
		q.add (root);
		while (!q.isEmpty ()){
			Node n = q.poll ();
			System.out.println (n.ele+"\t");
			if (n.left!=null)q.add (n.left);
			if (n.right!=null)q.add (n.right);
		}

	}

}
