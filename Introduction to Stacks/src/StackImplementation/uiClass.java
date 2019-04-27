package StackImplementation;

import java.util.Scanner;

public class uiClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		IStack s = new stack();
		while(true) {
			System.out.println("Choose Your Operation");
			System.out.println("1- Push");
			System.out.println("2- Pop");
			System.out.println("3- Peek");
			System.out.println("4- Get Size");
			System.out.println("5- Check if Empty");
			char ch = sc.next().charAt(0);
			if(ch == '1') {
				System.out.println("Enter value to push");
				Object e = sc.next();
				s.push(e);
			}else if(ch == '2') {
				s.pop();
			}else if(ch == '3') {
				System.out.println(s.peek());
			}else if(ch == '4') {
				System.out.print("Size is : ");
				System.out.println(s.size());
			}else if(ch == '5') {
				System.out.println(s.isEmpty());
			}else {
				break;
			}
		}
	}

}
