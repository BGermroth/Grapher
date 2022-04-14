import java.awt.*;
import javax.swing.*;

//Ben Germroth
public abstract class XYGrapher {

	abstract public Coordinate xyStart();
	abstract public double xRange();
	abstract public double yRange();
	abstract public Coordinate getPoint(int pointNum);
	public void drawGraph(int xPixelStart, int yPixelStart, int pixelsWide, int pixelsHigh) {
		JFrame frame = new JFrame("Graph");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		class Draw extends JPanel {
			int xPixelStart, yPixelStart, pixelsWide, pixelsHigh;
			JFrame frame;
			private void getVariables(int xPixelStartHold, int yPixelStartHold, int pixelsWideHold, int pixelsHighHold, JFrame frameHold) {
				xPixelStart = xPixelStartHold;
				yPixelStart = yPixelStartHold;
				pixelsWide = pixelsWideHold;
				pixelsHigh = pixelsHighHold;
				frame = frameHold;
			}
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Double xRange = xRange();
				Double yRange = yRange();
				Coordinate first = getPoint(0);
				Coordinate start = xyStart();
				double xPixel = xPixelStart + (first.getX()-start.getX())*(pixelsWide/xRange);
				double yPixel = yPixelStart + (start.getY()+yRange-first.getY())*(pixelsHigh/yRange);
				if(start.getX() < 0 && start.getX()+xRange > 0) {
					double xLine = xPixelStart-start.getX()*(pixelsWide/xRange);
					g.setColor(Color.GREEN);
					g.drawLine((int)xLine,0,(int)xLine,(int)frame.getSize().getHeight());
				}
				if(start.getY() < 0 && start.getY()+yRange > 0) {
					double yLine = yPixelStart+(start.getY()+yRange)*(pixelsHigh/yRange);
					g.drawLine(0,(int)yLine,(int)frame.getSize().getWidth(),(int)yLine);
				}
				g.setColor(Color.BLACK);
				boolean cont = true;
				int firstCount = 0;
				int count = 1;
				while(cont) {
					try {
						first = getPoint(firstCount);
						Coordinate second = getPoint(count);
						if(first.drawFrom() && second.drawTo()) {
						xPixel = xPixelStart + (first.getX()-start.getX())*(pixelsWide/xRange);
						yPixel = yPixelStart + (start.getY()+yRange-first.getY())*(pixelsHigh/yRange);
						double xPixelTo = xPixelStart + (second.getX()-start.getX())*(pixelsWide/xRange);
						double yPixelTo = yPixelStart + (start.getY()+yRange-second.getY())*(pixelsHigh/yRange);
							g.drawLine((int)xPixel,(int)yPixel,(int)xPixelTo,(int)yPixelTo);
						}
					} catch(NullPointerException ex) {
						cont = false;
					}
					count++;
					firstCount++;
				}
			}
		}
		Draw draw = new Draw();
		draw.getVariables(xPixelStart, yPixelStart, pixelsWide, pixelsHigh, frame);
		JPanel pane = draw;
		pane.setPreferredSize(new Dimension(pixelsWide+(xPixelStart*2),pixelsHigh+(yPixelStart*2)));
		frame.setPreferredSize(new Dimension(pixelsWide+(xPixelStart*2),pixelsHigh+(yPixelStart*2)));
		frame.pack();
		frame.setContentPane(pane);
		frame.setVisible(true);
	}
}


