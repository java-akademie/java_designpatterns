package ch.jmildner.bridge;

public class Circle extends Shape
{
	private double x, y, r;


	public Circle(Drawing dp, double x, double y, double r)
	{
		super(dp);
		this.x = x;
		this.y = y;
		this.r = r;
	}


	@Override
	public void draw()
	{
		drawCircle(x, y, r);
	}
}
