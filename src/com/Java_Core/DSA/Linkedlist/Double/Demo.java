package com.Java_Core.DSA.Linkedlist.Double;

class Demo {
	public static void main (String[] args) {
		MyDoublyLinkedList m = new MyDoublyLinkedList ();
		m.add (23);
		m.add (54);
		m.add (63);
		m.add (20);
		m.add (83);
		m.addFirst (1);
		m.addLast (999);
		System.out.println (m.toString ());
//		m.clear ();
//		System.out.println (m.get (6));
//		System.out.println (m.getFirst ());
//		System.out.println (m.getLast ());
		System.out.println (m.toString ());
		//-------**********----Remove----*********------------
//		System.out.println (m.remove (20));
//		System.out.println (m.remove (Integer.valueOf (999)));//here you should pass the object ...
		//System.out.println (m.remove (2));//here you should pass the index here...
		//System.out.println (m.toString ());
	}
}

class Node {
	Node prev;
	Object ele;
	Node next;

	public Node (Object ele) {
		this.ele = ele;
	}

	public Node (Node prev, Object ele, Node next) {
		this.prev = prev;
		this.ele = ele;
		this.next = next;
	}

}

class MyDoublyLinkedList {
	private Node first;
	private Node last;
	private int count = 0;

	//1....Size()
	public int size () {
		return count;
	}

	//2....isEmpty()
	public boolean isEmpty () {
		return size () == 0;
	}

	//3...ADD()
	public boolean add (Object ele) {
		if (first == null) {
			first = last = new Node (ele);
		} else {
			last.next = new Node (last, ele, null);
			last = last.next;
		}
		count++;
		return true;
	}

	//4....ADDFirst
	public void addFirst (Object ele) {
		if (first == null) {
			first = last = new Node (ele);
		} else {
			first.prev = new Node (null, ele, first);
			first = first.prev;
		}
		count++;
	}

	//5...ADDLAST
	public void addLast (Object ele) {
		if (first == null) {
			first = last = new Node (ele);
		} else {
			last.next = new Node (last, ele, null);
			last = last.next;
		}
		count++;
	}

	//6...Remove()-->based on element value and return boolean...
	public boolean remove (Object ele) {
		if (first == null) return false;

		Node curr = first;

		while (curr != null) {
			if (curr.ele.equals (ele)) {

				// only one node
				if (first == last) {
					first = last = null;
				}
				// removing first
				else if (curr == first) {
					first = first.next;
					first.prev = null;
				}
				// removing last
				else if (curr == last) {
					last = last.prev;
					last.next = null;
				}
				// middle node
				else {
					curr.prev.next = curr.next;
					curr.next.prev = curr.prev;
				}

				count--;
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	//7...Remove() -->based on index value return integer...
	public Object remove (int index) {
		Object value = null;
		if (index < 0 || index >= size ()) {
			throw new IndexOutOfBoundsException ("Index value is not Exist");
		}
		Node curr = first;
		int i = 0;
		while (curr != null) {
			if (i == index) {
				// only one node
				if (first == last) {
					value = first.ele;
					first = last = null;
				}
				// removing first
				else if (curr == first) {
					value = first.ele;
					first = first.next;
					first.prev = null;
				}
				// removing last
				else if (curr == last) {
					value = last.ele;
					last = last.prev;
					last.next = null;
				}
				// removing middle
				else {
					value = curr.ele;
					curr.prev.next = curr.next;
					curr.next.prev = curr.prev;
				}

				count--;
				return value;

			} else {
				curr = curr.next;
			}
			i++;
		}
		return value;

	}

	//8...RemoveFirst() ---> no argument
	public Object removeFirst () {
		Object value = null;
		if (first == null) return value;

		//for only 1st element
		else if (first == last) {
			value = first.ele;
			first = last = null;
		}

		// removing first
		else {
			value = first.ele;
			first = first.next;
			first.prev = null;
		}
		count--;
		return value;
	}

	//9...RemoveLast() ---> no argument
	public Object removeLast () {
		Object value = null;

		if (first == null) return value;

		//for only 1st element
		else if (first == last) {
			value = first.ele;
			first = last = null;
		}

		// removing last
		else {
			value = last.ele;
			last = last.prev;
			last.next = null;
		}
		count--;
		return value;
	}

	//10....clear() -->removing all
	public void clear(){
		first = last = null;
		count = 0;
	}

	//11....getting value...get()--by index
	public Object get (int index) {
		if (index < 0 || index >= size ()) {
			throw new IndexOutOfBoundsException ("Index value is not Exist");
		}
		Node curr = first;
		for (int i = 0; i <index ; i++) {
			curr = curr.next;
		}

		return curr.ele;

	}

	//12....getting value...getFirst()--No argument
	public Object getFirst () {
		if (first == null){
			throw new RuntimeException ("No element found");
		}
		return first.ele;
	}

	//13....getting value...getLast()--No argument
	public Object getLast () {
		if (first == null){
			throw new RuntimeException ("No element found");
		}
		return last.ele;
	}

	//14...contain()
	public boolean contains (Object ele) {
		if (first == null) return false;

		Node curr = first;
		while (curr != null) {
			if (curr.ele.equals (ele)) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	//toString() printing the linklist...
	@Override
	public String toString () {
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
