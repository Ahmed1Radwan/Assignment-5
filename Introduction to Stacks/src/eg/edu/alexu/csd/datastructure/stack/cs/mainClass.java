package eg.edu.alexu.csd.datastructure.stack.cs;

import java.util.Scanner;

public class mainClass { // main for the application
	//(3*(1+(4+6))+2+8)*5+4*(7+2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		IExpressionEvaluator sol = new expressionEvaluator();
		System.out.println("Enter the infix expression");
		String s = "";
		s= scan.nextLine();
		System.out.print("Postfix expression is : ");
		System.out.println(sol.infixToPostfix(s));
		System.out.print("Result is : ");
		System.out.println(sol.evaluate(sol.infixToPostfix(s)));
			
		
	}

}
