package commandPattern;

public class AddCommand extends MathCommand {
	
	public AddCommand() {
		super();
	}
	
	public AddCommand(double x, double y) {
		super(x, y);
	}

	/**
	 * Executes the additive function of this AddCommand.
	 * @author NoahCedeno
	 */
	@Override
	public double execute() {
		return this.x + this.y;
	}

}