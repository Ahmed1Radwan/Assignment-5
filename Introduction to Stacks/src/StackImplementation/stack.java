package StackImplementation;

import eg.edu.alexu.csd.datastructure.stack.cs.ILinkedList;
import eg.edu.alexu.csd.datastructure.stack.cs.SinglyLinkedList;

public class stack implements IStack {

	public ILinkedList s = new SinglyLinkedList();
	public int top;
	
	stack(){
		top = -1;
	}
	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(top == -1) {
			System.out.println("Stack under flow");
			System.exit(1);
		}else {
			System.out.println(s.get(top) + " Is Removed");
			s.remove(top);
			top--;
		}
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		if(top == -1) {
			System.out.println("Stack under flow");
			System.exit(1);
		}else {
			return s.get(top);
		}
		return -1;
	}

	@Override
	public void push(Object element) {
		// TODO Auto-generated method stub
		s.add(element);
		System.out.println(element +" Is Added");
		top++;
		return;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return s.size();
	}
	

}
