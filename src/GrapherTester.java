//Ben Germroth
public class GrapherTester extends XYGrapher {

	public Coordinate xyStart() {
		return new Coordinate(-2,-2);
	}

	public double xRange() {
		return 4;
	}

	public double yRange() {
		return 4;
	}

	public Coordinate getPoint(int pointNum) {
		Coordinate firstPoint = new Coordinate(-1,-1);
		Coordinate secondPoint = new Coordinate(1,-1);
		Coordinate thirdPoint = new Coordinate(1,1);
		Coordinate fourthPoint = new Coordinate(-1,1);
		Coordinate fifthPoint = new Coordinate(-1,-1);

		Coordinate[] holder = {firstPoint,secondPoint,thirdPoint,fourthPoint,fifthPoint};

		if(pointNum<holder.length)
			return holder[pointNum];
		else
			return null;
	}

	public static void main(String[] args) {
		GrapherTester grapher = new GrapherTester();
		grapher.drawGraph(200,200,400,400);
	}
}


