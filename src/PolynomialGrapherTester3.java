//Ben Germroth
public class PolynomialGrapherTester3 extends PolynomialGrapher {

	public Coordinate xyStart() {
		return new Coordinate(-5,0);
	}
	public double xRange() {
		return 10;
	}
	public double yRange() {
		return 16;
	}
	public double xIncrement() {
		return .1;
	}
	
	public double[] coefficients() {
		return new double[] {3,-1,3,-1,-1,.5};
	}
	public static void main(String[] args) {
		PolynomialGrapherTester3 test = new PolynomialGrapherTester3();
		test.drawGraph(200,208,200,200);
	}
}



