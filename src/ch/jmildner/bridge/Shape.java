package ch.jmildner.bridge;

public abstract class Shape
{
	private Drawing dp;


	Shape(Drawing dp)
	{
		this.dp = dp;
	}


	abstract public void draw();


	protected void drawCircle(double x, double y, double r)
	{
		dp.drawCircle(x, y, r);
	}


	protected void drawLine(double x1, double y1, double x2, double y2)
	{
		dp.drawLine(x1, y1, x2, y2);
	}
}
