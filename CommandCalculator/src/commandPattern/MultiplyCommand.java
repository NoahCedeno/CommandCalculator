package commandPattern;

public class MultiplyCommand extends MathCommand {
	
	public MultiplyCommand() {
		super();
	}
	
	public MultiplyCommand(double x, double y) {
		super(x, y);
	}

	/**
	 * Executes the multiplicative function of this AddCommand.
	 * @author NoahCedeno
	 */
	@Override
	public double execute() {
		return this.x * this.y;
	}

}
