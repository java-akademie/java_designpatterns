package ch.jmildner.bridge;

public class V2Drawing extends Drawing
{
	@Override
	public void drawCircle(double x, double y, double r)
	{
		System.out.println("Circle V2: " + x + "/" + y + "/" + r + "/");
	}


	@Override
	public void drawLine(double x1, double y1, double x2, double y2)
	{
		System.out.println("Line   V2: " + x1 + "/" + x2 + "/" + y1
				+ "/" + y2 + "/");
	}
}
