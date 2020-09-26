package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import commandPattern.AddCommand;

class AddCommandTest {

	@Test
	public void DefaultConstructorTest() {
		AddCommand tester = new AddCommand();
		assertEquals(0, tester.getX(), "tester1.x must be 0 with default ctor!");
		assertEquals(0, tester.getY(), "tester1.y must be 0 with default ctor!");
	}
	
	@Test
	public void ParamConstructorTest() {
		AddCommand tester = new AddCommand(2, 8);
		assertEquals(2, tester.getX(), "tester1.x must be 2 here!");
		assertEquals(8, tester.getY(), "tester1.x must be 8 here!");
	}
	
	@Test
	public void ExecuteCommandTest() {
		AddCommand tester1 = new AddCommand(4, 6);
		assertEquals(10, tester1.execute(), "The result of 4 + 6 should be 10!");

		AddCommand tester2 = new AddCommand(-1.05, 1.05);
		assertEquals(0, tester2.execute(), "The result of -1.05 + 1.05 should be 0!");
		
		AddCommand tester3 = new AddCommand(3.5, -1.25);
		assertEquals(2.25, tester3.execute(), "The result of 3.5 + -1.25 should be 2.25!");
	}
	
	@Test
	public void ToStringTest() {
		AddCommand tester1 = new AddCommand();
		assertEquals("0.0", tester1.toString(), "Should read 0.0 for doubles!");
		
		AddCommand tester2 = new AddCommand(1, 2);
		assertEquals("3.0", tester2.toString(), "Should read 3.0 for doubles!");
		
	}

}
