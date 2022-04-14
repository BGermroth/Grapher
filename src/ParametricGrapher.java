//Ben Germroth
public abstract class ParametricGrapher extends XYGrapher {

	abstract public double xValue(double value);
	abstract public double yValue(double value);
	abstract public double tStart();
	abstract public double tEnd();
	abstract public double tIncrement();
	public Coordinate getPoint(int pointNum) {
		double tValue = tStart()+(pointNum*tIncrement());
		if(tValue>tEnd())
			return null;
		return new Coordinate(xValue(tValue),yValue(tValue));
	}

}



