//Ben Germroth
public abstract class DiscontinuousFunctionGrapher extends FunctionGrapher {

	abstract public Coordinate xyStart();
	abstract public double xRange();
	abstract public double yRange();
	abstract public double xIncrement();
	abstract public double yValue(double xValue);
	
	public Coordinate getPoint(int pointNum) {
		if(exclude(xValue(pointNum)))
			return new Coordinate(0,0,false,false);
		return super.getPoint(pointNum);
	}
	public boolean exclude(double value) {
		return false;
	}
}


