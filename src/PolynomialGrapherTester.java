//Ben Germroth
public class PolynomialGrapherTester extends PolynomialGrapher {

	public Coordinate xyStart() {
		return new Coordinate(0,0);
	}
	public double xRange() {
		return 6;
	}
	public double yRange() {
		return 10;
	}
	public double xIncrement() {
		return .2;
	}
	
	public double[] coefficients() {
		return new double[] {4.8,-1.2,.2};
	}
	public static void main(String[] args) {
		PolynomialGrapherTester test = new PolynomialGrapherTester();
		test.drawGraph(210,200,200,200);
	}
}



