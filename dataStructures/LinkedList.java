package dataStructures;


public class LinkedList {

	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void add(Node n) {
		if(head == null) {
			head = n;
			return;
		}
		Node runner = head;
		while(runner.getNext() != null) {
			runner = runner.getNext();
		}
		runner.setNext(runner, n);
	}
	
	public String toString() {
		String s = "<LinkedList[";
		Node runner = head;
		while(runner != null) {
			s += runner.toString() + ",";
			runner = runner.getNext();
		}
		s = s.replaceAll(",$", "");
		s += "]>";
		return s;
	}
}

class Node {
	
	private int data;
	private Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setData(Node n, int data) {
		n.data = data;
	}
	
	public void setNext(Node n, Node next) {
		n.next = next;
	}
	
	public String toString() {
		String s = "<Node[" + data + "]>";
		return s;
	}
}

class Test {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(new Node(5));
		l.add(new Node(6));
		l.add(new Node(7));
		System.out.println(l.toString());
	}
}



