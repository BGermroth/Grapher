//Ben Germroth
public abstract class FunctionGrapher extends XYGrapher {

	abstract public Coordinate xyStart();
	abstract public double xRange();
	abstract public double yRange();
	abstract public double xIncrement();
	abstract public double yValue(double xValue);

	public Coordinate getPoint(int pointNum) {
		if(xValue(pointNum)>=xyStart().getX()+xRange()&&
				xValue(pointNum)-xIncrement()<=xyStart().getX()+xRange())
			return new Coordinate(xyStart().getX()+xRange(),yValue(xyStart().getX()+xRange()));
		else if(xValue(pointNum)>=xyStart().getX()+xRange())
			return null;
		else return new Coordinate(xValue(pointNum),yValue(xValue(pointNum)));
	}
	public double xValue(int pointNum) {
		return xyStart().getX()+(xIncrement()*pointNum);
	}
}
