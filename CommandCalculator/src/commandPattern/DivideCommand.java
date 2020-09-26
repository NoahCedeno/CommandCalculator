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
	public double execute() throws ArithmeticException {
		double result;
		
		try {
			if (this.y == 0) {
				throw new ArithmeticException();
			}
			result = this.x / this.y;
		}
		catch (ArithmeticException exOb) {
			// Accounts for NaN results and Infinity results
			// As well, result, x, and y are all defined for more diverse exception handling.
			// TODO: More verbose exception handling? (Setting exOb text or something? Would have to test it too...)
			System.out.println("EY YO you can't divide by zero!");
			result = 0.0; // Return 0.0 (Maybe not helpful..?)
		}
		// Ultimately return result (or 0.0 if dividing by zero).
		return result;
	}

}
