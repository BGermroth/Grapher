//Ben Germroth
public class GrapherTester2 extends XYGrapher {

	public Coordinate xyStart() {
		return new Coordinate(-4,-4);
	}

	public double xRange() {
		return 8;
	}

	public double yRange() {
		return 8;
	}

	public Coordinate getPoint(int pointNum) {
		Coordinate firstPoint = new Coordinate(-2.5,-4);
		Coordinate secondPoint = new Coordinate(0,4);
		Coordinate thirdPoint = new Coordinate(2.5,-4);
		Coordinate fourthPoint = new Coordinate(-4,1);
		Coordinate fifthPoint = new Coordinate(4,1);
		Coordinate sixthPoint = new Coordinate(-2.5,-4);

		Coordinate[] holder = {firstPoint,secondPoint,thirdPoint,fourthPoint,fifthPoint,sixthPoint};

		if(pointNum<holder.length)
			return holder[pointNum];
		else
			return null;
	}

	public static void main(String[] args) {
		GrapherTester2 grapher = new GrapherTester2();
		grapher.drawGraph(280,280,280,280);
	}
}


