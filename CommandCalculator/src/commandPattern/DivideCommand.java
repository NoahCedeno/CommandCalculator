package commandPattern;

public class DivideCommand extends MathCommand {
	
	public DivideCommand() {
		super();
	}
	
	public DivideCommand(double x, double y) {
		super(x, y);
	}
	
	/**
	 * Executes the dividing function of this DivideCommand. Accounts for dividing by zero.
	 * @author NoahCedeno
	 */
	@Override
	public double execute() {
		double result = 0.0;
		
		try {
			result =  this.x / this.y;
		}
		catch (ArithmeticException exOb) {
			System.out.println("EY YO you can't divide by zero!");
		}
		// Ultimately return result (or 0.0 if dividing by zero).
		return result;
	}

}
