package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import commandPattern.DivideCommand;


class DivideCommandTest {

	@Test
	public void DefaultConstructorTest() {
		DivideCommand tester = new DivideCommand();
		assertEquals(0, tester.getX(), "tester1.x must be 0 with default ctor!");
		assertEquals(0, tester.getY(), "tester1.y must be 0 with default ctor!");
	}
	
	@Test
	public void ParamConstructorTest() {
		DivideCommand tester = new DivideCommand(2, 8);
		assertEquals(2, tester.getX(), "tester1.x must be 2 here!");
		assertEquals(8, tester.getY(), "tester1.x must be 8 here!");
	}
	
	@Test
	public void ExecuteCommandTest() {
		DivideCommand tester1 = new DivideCommand(6, 6);
		assertEquals(1, tester1.execute(), "The result of 6 / 6 should be 1!");

		DivideCommand tester2 = new DivideCommand(-1, 2);
		assertEquals(-0.5, tester2.execute(), "The result of -1 / 2 should be -0.5!");
		
		

		DivideCommand tester3 = new DivideCommand(); // x = 0, y = 0
		assertEquals(0.0, tester3.execute(), "The result of 0/0 should be NaN WITH AN ARITHMETICEXCEPTION!");
		
		// TODO: Add more complex division (2/3) with tolerance-based tests.
	}
	
	@Test
	public void DivideByZeroExceptionTest() {
		DivideCommand tester = new DivideCommand(3, 0); // x = 0, y = 0
		assertEquals(0, tester.execute(), "Division by 0 returns 0 in this calculator, throws an ArithmeticException.");
		// Listen for the ArithmeticException!
		assertThrows(ArithmeticException.class, () -> {
			throw new ArithmeticException();
		});
	}
	
	
	@Test
	public void ToStringTest() {
		DivideCommand tester1 = new DivideCommand();
		assertEquals("0.0", tester1.toString(), "Should read 0.0 for doubles!");
		
		DivideCommand tester2 = new DivideCommand(20, 2);
		assertEquals("10.0", tester2.toString(), "Should read 10.0 for doubles!");
		
	}

}
