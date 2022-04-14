//Ben Germroth
public abstract class PolynomialGrapher extends FunctionGrapher {

	abstract public Coordinate xyStart();
	abstract public double xRange();
	abstract public double yRange();
	abstract public double xIncrement();
	public double yValue(double xValue) {
		double through = 0;
		for(int i = 0; i < coefficients().length; i++) {
			through += Math.pow(xValue,i)*coefficients()[i];
		}
		return through;
	}
	abstract public double[] coefficients();
}



