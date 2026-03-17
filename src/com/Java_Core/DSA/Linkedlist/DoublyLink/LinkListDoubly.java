package com.Java_Core.DSA.Linkedlist.DoublyLink;

class LinkListDoubly {
	public static void main (String[] args) {
		MyLinklistDoubly<Integer> m = new MyLinklistDoubly<> ();
		System.out.println (m.add (34));
		System.out.println (m.add (44));
		System.out.println (m.add (38));
		System.out.println (m.add (30));
		System.out.println (m.toString ());
		m.addFirst (23);
		m.addLast (90);
		m.add (3,77);
		System.out.println (m.toString ());
//		m.removeFirst ();
//		m.removeLast ();
//		m.remove (3);
//		m.remove ((Integer)90);//clash with index and value
		System.out.println (m.toString ());



	}

}

class Node {
	Node prev;
	Node next;
	Object ele;

	public Node (Object ele) {
		this.ele = ele;
	}

	public Node (Node prev, Node next, Object ele) {
		this.prev = prev;
		this.next = next;
		this.ele = ele;
	}

}

class MyLinklistDoubly<E> {
	private Node first;
	private Node last;
	private int count = 0;

	public int size () {
		return count;
	}

	public boolean isEmpty () {
		return count == 0;
	}

	public boolean contain (Object key) {
		Node curr = first;
		for (int i = 0; i < size (); i++) {
			if (key == null ? curr.ele == null : curr.ele.equals (key)) {
				return true;
			} else {
				curr = curr.next;
			}
		}
		return false;
	}

	public void addFirst (Object ele) {
		Node n = new Node (null, first, ele);
		if (isEmpty ()) {
			first = last = n;
		} else {
			first.prev = n;
		}
		first = n;
		count++;
	}

	public void addLast (Object ele) {
		Node n = new Node (last, null, ele);
		if (isEmpty ()) {
			first = last = n;
		} else {
			last.next = n;
		}
		last = n;
		count++;
	}

	public boolean add (Object ele) {
		if (isEmpty ()) {
			addFirst (ele);
		} else {
			addLast (ele);
		}
		return true;
	}

	public void add (int index, Object ele) {
		if (index < 0 || index > size ()) {
			throw new IndexOutOfBoundsException ();
		}
		if (index == 0) {
			addFirst (ele);
		} else if (index == size ()) {
			addLast (ele);
		} else {
			Node curr = first;
			for (int i = 1; i < index; i++) {
				curr = curr.next;
			}
			Node n = new Node (curr, curr.next, ele);
			curr.next = n;
			curr.next.next.prev = n;
			count++;
		}

	}

	public Object removeFirst () {
		if (isEmpty ()) {
			return null;
		}
		Object key = first.ele;
		if (first == last) {
			first = last = null;
		} else {
			first = first.next;
			first.prev = null;
		}
		count--;
		return key;
	}

	public Object removeLast () {
		if (isEmpty ()) return null;
		Object key = last.ele;
		if (first == last) {
			first = last = null;
		} else {
			last = last.prev;
			last.next = null;
		}
		count--;
		return key;
	}

	public Object remove (int index) {
		if (index < 0 || index >= size ()) {
			throw new IndexOutOfBoundsException ();
		}
		if (index == 0) return removeFirst ();
		else if (index == size () - 1) return removeLast ();
		else {
			Node curr = first;
			for (int i = 1; i < index; i++) {
				curr = curr.next;
			}
			Object key = curr.next.ele;
			curr.next = curr.next.next;
			curr.next.prev = curr;
			count--;
			return key;
		}


	}

	public boolean remove (Object key) {
		if (isEmpty ())return false;
		if (first.ele.equals (key)) {
			removeFirst ();
			return true;
		} else if (last.ele.equals (key)) {
			removeLast ();
			return true;
		} else {
			Node curr = first.next;
			for (int i = 1; i < size ()-1; i++) {
				if (curr.ele.equals (key)) {
					curr.next.prev = curr.prev;
					curr.prev.next = curr.next;
					count--;
					return true;
				} else {
					curr = curr.next;
				}
			}

		}
		return false;
	}
	@Override
	public String toString () {
		String s = "[ ";
		if (!isEmpty ()) {
			Node curr = first.next;
			s += first.ele;
			for (int i = 1; i < size (); i++) {
				s += ", " + curr.ele;
				curr=curr.next;
			}
		}
		s += " ]";
		return s;
	}


}