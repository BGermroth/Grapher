//Ben Germroth
public class FunctionGrapherTester3 extends FunctionGrapher {

	public Coordinate xyStart() {
		return new Coordinate(-10,-10);
	}
	public double xRange() {
		return 20;
	}
	public double yRange() {
		return 20;
	}
	public double xIncrement() {
		return 0.1;
	}

	public double yValue(double xValue) {
		return (xValue-1)/Math.pow(xValue,2);
	}
	public static void main(String[] args) {
		FunctionGrapherTester3 test = new FunctionGrapherTester3();
		test.drawGraph(200,200,400,400);
	}
}
