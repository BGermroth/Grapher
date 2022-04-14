//Ben Germroth
public class DiscontinuousTester extends DiscontinuousFunctionGrapher {

	public Coordinate xyStart() {
		return new Coordinate(0,0);
	}
	public double xRange() {
		return 3;
	}
	public double yRange() {
		return 5;
	}
	public double xIncrement() {
		return .2;
	}
	public double yValue(double xValue) {
		return (Math.pow(xValue,2)-1)/(xValue-1);
	}
	public boolean exclude(double value) {
		if(value == 1)
			return true;
		return false;
	}
	public static void main(String[] args) {
		DiscontinuousTester test = new DiscontinuousTester();
		test.drawGraph(201,200,200,200);
	}
}


