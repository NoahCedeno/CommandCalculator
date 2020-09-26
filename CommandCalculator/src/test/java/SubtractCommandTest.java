package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import commandPattern.SubtractCommand;

class SubtractCommandTest {

	@Test
	public void DefaultConstructorTest() {
		SubtractCommand tester = new SubtractCommand();
		assertEquals(0, tester.getX(), "tester1.x must be 0 with default ctor!");
		assertEquals(0, tester.getY(), "tester1.y must be 0 with default ctor!");
	}
	
	@Test
	public void ParamConstructorTest() {
		SubtractCommand tester = new SubtractCommand(2, 8);
		assertEquals(2, tester.getX(), "tester1.x must be 2 here!");
		assertEquals(8, tester.getY(), "tester1.x must be 8 here!");
	}
	
	@Test
	public void ExecuteCommandTest() {
		SubtractCommand tester1 = new SubtractCommand(4, 6);
		assertEquals(-2, tester1.execute(), "The result of 4 - 6 should be -2!");

		SubtractCommand tester2 = new SubtractCommand(-1.05, 1.05);
		assertEquals(-2.1, tester2.execute(), "The result of -1.05 - 1.05 should be -2.1!");
		
		SubtractCommand tester3 = new SubtractCommand(3.5, -1.25);
		assertEquals(4.75, tester3.execute(), "The result of 3.5 + -1.25 should be 4.75!");
	}
	
	@Test
	public void ToStringTest() {
		SubtractCommand tester1 = new SubtractCommand();
		assertEquals("0.0", tester1.toString(), "Should read 0.0 for doubles!");
		
		SubtractCommand tester2 = new SubtractCommand(1, 2);
		assertEquals("-1.0", tester2.toString(), "Should read -1.0 for doubles!");
		
	}

}
