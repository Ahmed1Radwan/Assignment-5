package eg.edu.alexu.csd.datastructure.stack.cs;

public class Node {
	Node next; // reference
	Object data; // data in stored in each node
	
	public Node(Object val) { // constructor
		next = null;
		data = val;
	}
	public Node(Object val,Node nextVal) { // to point to specific Node
		next = nextVal;
		data = val;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object val) {
		data = val;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node nextVal) {
		next = nextVal;
	}
}
