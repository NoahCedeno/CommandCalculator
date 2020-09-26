package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import commandPattern.MultiplyCommand;

class MultiplyCommandTest {

	@Test
	public void DefaultConstructorTest() {
		MultiplyCommand tester = new MultiplyCommand();
		assertEquals(0, tester.getX(), "tester1.x must be 0 with default ctor!");
		assertEquals(0, tester.getY(), "tester1.y must be 0 with default ctor!");
	}
	
	@Test
	public void ParamConstructorTest() {
		MultiplyCommand tester = new MultiplyCommand(2, 8);
		assertEquals(2, tester.getX(), "tester1.x must be 2 here!");
		assertEquals(8, tester.getY(), "tester1.x must be 8 here!");
	}
	
	@Test
	public void ExecuteCommandTest() {
		MultiplyCommand tester1 = new MultiplyCommand(4, 6);
		assertEquals(24, tester1.execute(), "The result of 4 * 6 should be 24!");

		MultiplyCommand tester2 = new MultiplyCommand(-1.05, 1.05);
		assertEquals(-1.1025, tester2.execute(), "The result of -1.05 * 1.05 should be -1.1025!");
		
		MultiplyCommand tester3 = new MultiplyCommand(3.5, -1.25);
		assertEquals(-4.375, tester3.execute(), "The result of 3.5 * -1.25 should be -4.375!");
	}
	
	@Test
	public void ToStringTest() {
		MultiplyCommand tester1 = new MultiplyCommand();
		assertEquals("0.0", tester1.toString(), "Should read 0.0 for doubles!");
		
		MultiplyCommand tester2 = new MultiplyCommand(1, 2);
		assertEquals("2.0", tester2.toString(), "Should read 2.0 for doubles!");
		
	}

}
