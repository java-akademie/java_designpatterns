package ch.jmildner.strategy.enten;

public class EntenSimulation1Test
{
	public static void main(String[] args)
	{
		Ente1 se = new StockEnte1();
		se.anzeigen();
		se.schwimmen();
		se.fliegen();
		se.quacken();

		System.out.println("");

		Ente1 re = new RotkopfEnte1();
		re.anzeigen();
		re.schwimmen();
		re.fliegen();
		re.quacken();

		System.out.println("");

		Ente1 ge = new GummiEnte1();
		ge.anzeigen();
		ge.schwimmen();
		ge.fliegen();
		ge.quacken();

		System.out.println("");

		Ente1 he = new HolzEnte1();
		he.anzeigen();
		he.schwimmen();
		he.fliegen();
		he.quacken();

		System.out.println("");
	}
}
