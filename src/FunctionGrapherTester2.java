//Ben Germroth
public class FunctionGrapherTester2 extends FunctionGrapher {

	public Coordinate xyStart() {
		return new Coordinate(0,-1);
	}
	public double xRange() {
		return 20;
	}
	public double yRange() {
		return 2;
	}
	public double xIncrement() {
		return 0.1;
	}

	public double yValue(double xValue) {
		return Math.cos(xValue);
	}
	public static void main(String[] args) {
		FunctionGrapherTester2 test = new FunctionGrapherTester2();
		test.drawGraph(200,200,400,400);
	}
}
