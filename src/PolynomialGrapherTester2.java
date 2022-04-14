//Ben Germroth
public class PolynomialGrapherTester2 extends PolynomialGrapher {

	public Coordinate xyStart() {
		return new Coordinate(-4,2);
	}
	public double xRange() {
		return 8;
	}
	public double yRange() {
		return 16;
	}
	public double xIncrement() {
		return .1;
	}
	
	public double[] coefficients() {
		return new double[] {1,-3,-4,12};
	}
	public static void main(String[] args) {
		PolynomialGrapherTester2 test = new PolynomialGrapherTester2();
		test.drawGraph(208,208,200,200);
	}
}



