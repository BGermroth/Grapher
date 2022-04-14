//Ben Germroth
public class GrapherTester3 extends XYGrapher {

	public Coordinate xyStart() {
		return new Coordinate(-2.5,-2);
	}

	public double xRange() {
		return 5;
	}

	public double yRange() {
		return 5;
	}

	public Coordinate getPoint(int pointNum) {
		Coordinate firstPoint = new Coordinate(-2.5,-2);
		Coordinate secondPoint = new Coordinate(0,3);
		Coordinate thirdPoint = new Coordinate(2.5,-2);
		Coordinate fourthPoint = new Coordinate(-2.5,-2,false,true);
		Coordinate fifthPoint = new Coordinate(-1,-1,true,false);
		Coordinate sixthPoint = new Coordinate(0,1);
		Coordinate seventhPoint = new Coordinate(1,-1);
		Coordinate eighthPoint = new Coordinate(-1,-1);

		Coordinate[] holder = {firstPoint,secondPoint,thirdPoint,
				fourthPoint,fifthPoint,sixthPoint,seventhPoint,eighthPoint};

		if(pointNum<holder.length)
			return holder[pointNum];
		else
			return null;
	}

	public static void main(String[] args) {
		GrapherTester3 grapher = new GrapherTester3();
		grapher.drawGraph(250,250,250,250);
	}
}


