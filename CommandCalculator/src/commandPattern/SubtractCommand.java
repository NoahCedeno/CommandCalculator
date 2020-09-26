package commandPattern;

public class SubtractCommand extends MathCommand {
	
	public SubtractCommand() {
		super();
	}
	
	public SubtractCommand(double x, double y) {
		super(x, y);
	}
	
	/**
	 * Executes the subtractive function of this AddCommand.
	 * @author NoahCedeno
	 */
	@Override
	public double execute() {
		return this.x - this.y;
	}
	
}
