package StackImplementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stackTest {

	@Test
	void test() {
		IStack s = new stack();
		assertEquals(true,s.isEmpty());
		s.push(1);
		assertEquals(false,s.isEmpty());
		s.pop();
		assertEquals(true,s.isEmpty());
		s.push(5);
		s.push(6);
		int expected = 6;
		int actual = (int)s.peek();
		assertEquals(expected,actual);
		int expectedSize = 2;
		int actualSize = s.size();
		assertEquals(expectedSize,actualSize);
		s.pop();
		s.pop();
		expectedSize = 0;
		actualSize = s.size();
		assertEquals(expectedSize,actualSize);
		assertEquals(true,s.isEmpty());
	}

}
