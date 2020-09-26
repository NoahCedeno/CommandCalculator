package commandPattern;

public abstract class MathCommand {
	protected double x, y;
	
	public MathCommand() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public MathCommand(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * To be implemented in subclasses, will execute the 'MathCommand'.
	 * @return The (double) result of the 'MathCommand'.
	 */
	public abstract double execute();
	
	@Override
	public String toString() {
		return Double.toString(this.execute());
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}

}
