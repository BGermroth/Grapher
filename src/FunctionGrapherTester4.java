//Ben Germroth
public class FunctionGrapherTester4 extends FunctionGrapher {

	public Coordinate xyStart() {
		return new Coordinate(-4,-3);
	}
	public double xRange() {
		return 8;
	}
	public double yRange() {
		return 9;
	}
	public double xIncrement() {
		return 0.00001;
	}

	public double yValue(double xValue) {
		return Math.pow(xValue,4)-Math.pow(xValue,3)-(3*Math.pow(xValue,2))+xValue;
	}
	public static void main(String[] args) {
		FunctionGrapherTester4 test = new FunctionGrapherTester4();
		test.drawGraph(200,200,420,400);
	}
}
