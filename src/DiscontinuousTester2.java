//Ben Germroth
public class DiscontinuousTester2 extends DiscontinuousFunctionGrapher {

	public Coordinate xyStart() {
		return new Coordinate(-3,-3);
	}
	public double xRange() {
		return 6;
	}
	public double yRange() {
		return 6;
	}
	public double xIncrement() {
		return .2;
	}
	public double yValue(double xValue) {
		return 1/xValue;
	}
	public boolean exclude(double value) {
		if(value == 0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		DiscontinuousTester2 test = new DiscontinuousTester2();
		test.drawGraph(204,204,200,200);
	}
}


