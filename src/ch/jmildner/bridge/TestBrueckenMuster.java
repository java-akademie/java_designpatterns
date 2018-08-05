package ch.jmildner.bridge;

public class TestBrueckenMuster
{
	public static void main(String[] args)
	{
		Shape r1, r2;
		Drawing dp;
		// dp = new V1Drawing();
		r1 = new Rectangle(new V2Drawing(), 1, 1, 2, 2);
		dp = new V1Drawing();
		r2 = new Circle(dp, 2, 2, 3);
		r1.draw();
		r2.draw();
		System.out.println("Programmende");
	}
}
