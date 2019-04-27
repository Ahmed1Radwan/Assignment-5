package eg.edu.alexu.csd.datastructure.stack.cs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// junit test for the apllication
class expressionEvaluatorTest {

	@Test
	void test() {
		//some test cases 
		
		IExpressionEvaluator examp_1 = new expressionEvaluator();
		String expected = "-1 5 - ";
		String actual = examp_1.infixToPostfix("-1 - 5");
		assertEquals(expected,actual);
		int expectedRes = -6;
		int actualRes = examp_1.evaluate(examp_1.infixToPostfix("-1 - 5"));
		assertEquals(expectedRes,actualRes);
		
		IExpressionEvaluator examp_2 = new expressionEvaluator();
		String expected2 = "3 1 4 6 + + * 2 + 8 + 5 * 4 7 2 + * + ";
		String actual2 = examp_2.infixToPostfix("(3*(1+(4+6))+2+8)*5+4*(7+2)");
		assertEquals(expected2,actual2);
		int expectedRes2 = 251;
		int actualRes2 = examp_2.evaluate(examp_2.infixToPostfix("(3*(1+(4+6))+2+8)*5+4*(7+2)"));
		assertEquals(expectedRes2,actualRes2);
		
		IExpressionEvaluator examp_3 = new expressionEvaluator();
		String expected3 = "6 2 / 3 - 4 2 * + ";
		String actual3 = examp_3.infixToPostfix("6 / 2 - 3 + 4 * 2");
		assertEquals(expected3,actual3);
		int expectedRes3 = 8;
		int actualRes3 = examp_3.evaluate(examp_3.infixToPostfix("6 / 2 - 3 + 4 * 2"));
		assertEquals(expectedRes3,actualRes3);
		
		IExpressionEvaluator examp_4 = new expressionEvaluator();
		String expected4 = "2 3 4 * + ";
		String actual4 = examp_4.infixToPostfix("2 + 3 * 4");
		assertEquals(expected4,actual4);
		int expectedRes4 = 14;
		int actualRes4 = examp_4.evaluate(examp_4.infixToPostfix("2 + 3 * 4"));
		assertEquals(expectedRes4,actualRes4);
		
		IExpressionEvaluator examp_5 = new expressionEvaluator();
		String expected5 = "1 2 + 7 * ";
		String actual5 = examp_5.infixToPostfix("(1 + 2) * 7");
		assertEquals(expected5,actual5);
		int expectedRes5 = 21;
		int actualRes5 = examp_5.evaluate(examp_5.infixToPostfix("(1 + 2) * 7"));
		assertEquals(expectedRes5,actualRes5);
		
		IExpressionEvaluator examp_6 = new expressionEvaluator();
		String expected6 = "10 12 - 80 * 15 3 / + ";
		String actual6 = examp_6.infixToPostfix("(10 - 12) * 80 + 15 / 3");
		assertEquals(expected6,actual6);
		int expectedRes6 = -155;
		int actualRes6 = examp_6.evaluate(examp_6.infixToPostfix("(10 - 12) * 80 + 15 / 3"));
		assertEquals(expectedRes6,actualRes6);
		
		IExpressionEvaluator examp_7 = new expressionEvaluator();
		String expected7 = "-15 -16 -3 * + 9 + ";
		String actual7 = examp_7.infixToPostfix("-15 + -16 * -3 + 9");
		assertEquals(expected7,actual7);
		int expectedRes7 = 42;
		int actualRes7 = examp_7.evaluate(examp_7.infixToPostfix("-15 + -16 * -3 + 9"));
		assertEquals(expectedRes7,actualRes7);
		
		IExpressionEvaluator examp_8 = new expressionEvaluator();
		String expected8 = "3 1 4 6 + + * 2 8 + + 5 * 4 7 2 + * + ";
		String actual8 = examp_8.infixToPostfix("((((3 * (1 + (4 + 6))) + (2 + 8)) * 5) + (4 * (7 + 2)))");
		assertEquals(expected8,actual8);
		int expectedRes8 = 251;
		int actualRes8 = examp_8.evaluate(examp_8.infixToPostfix("((((3 * (1 + (4 + 6))) + (2 + 8)) * 5) + (4 * (7 + 2)))"));
		assertEquals(expectedRes8,actualRes8);
		
		// example without digits
		IExpressionEvaluator examp_9 = new expressionEvaluator();
		String expected9 = "a b / c - d e * + a c * - ";
		String actual9 = examp_9.infixToPostfix("a / b - c + d * e - a * c");
		assertEquals(expected9,actual9);
		
		IExpressionEvaluator examp_10 = new expressionEvaluator();
		String expected10 = "300 23 + 43 21 - * 84 7 + / ";
		String actual10 = examp_10.infixToPostfix("(300 + 23) * (43 - 21) / (84 + 7)");
		assertEquals(expected10,actual10);
		int expectedRes10 = 78;
		int actualRes10 = examp_10.evaluate(examp_10.infixToPostfix("(300 + 23) * (43 - 21) / (84 + 7)"));
		assertEquals(expectedRes10,actualRes10);
		
		IExpressionEvaluator examp_11 = new expressionEvaluator();
		String expected11 = "4 8 + 6 5 - * 3 2 - 2 2 + * / ";
		String actual11 = examp_11.infixToPostfix("(4 + 8) * (6 - 5) / ((3 - 2) * (2+2))");
		assertEquals(expected11,actual11);
		int expectedRes11 = 3;
		int actualRes11 = examp_11.evaluate(examp_11.infixToPostfix("(4 + 8) * (6 - 5) / ((3 - 2) * (2+2))"));
		assertEquals(expectedRes11,actualRes11);
	}

}
