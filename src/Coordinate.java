//Ben Germroth
public class Coordinate {

	double X,Y;
	boolean drawTo,drawFrom;

	Coordinate(double x, double y) {
		this.X = x;
		this.Y = y;
		this.drawTo = true;
		this.drawFrom = true;
	}

	Coordinate(double x, double y, boolean drawFrom, boolean drawTo) {
		this.X = x;
		this.Y = y;
		this.drawFrom = drawFrom;
		this.drawTo = drawTo;
	}

	public double getX() {
		return X;
	}
	public double getY() {
		return Y;
	}
	public boolean drawTo() {
		return drawTo;
	}
	public boolean drawFrom() {
		return drawFrom;
	}
}



