//Ben Germroth
public class ParametricTester extends ParametricGrapher {

	public Coordinate xyStart() {
		return new Coordinate(-1,-1);
	}
	public double xRange() {
		return 2;
	}
	public double yRange() {
		return 2;
	}
	public double xValue(double value) {
		return Math.cos(value);
	}
	public double yValue(double value) {
		return Math.sin(value);
	}
	public double tStart() {
		return Math.PI/2;
	}
	public double tEnd() {
		return (3.0/2.0)*Math.PI;
	}
	public double tIncrement() {
		return 0.05*Math.PI;
	}
	public static void main(String[] args) {
		ParametricTester test = new ParametricTester();
		test.drawGraph(200,200,200,200);
	}
}


