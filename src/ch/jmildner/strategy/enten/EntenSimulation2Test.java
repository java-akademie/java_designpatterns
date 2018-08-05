package ch.jmildner.strategy.enten;

public class EntenSimulation2Test
{

	public static void main(String[] args)
	{
		Ente2 se = new StockEnte2();
		se.anzeigen();
		se.schwimmen();
		se.fliegen();
		se.quacken();

		System.out.println("");

		Ente2 re = new RotkopfEnte2();
		re.anzeigen();
		re.schwimmen();
		re.fliegen();
		re.quacken();

		System.out.println("");

		Ente2 ge = new GummiEnte2();
		ge.anzeigen();
		ge.schwimmen();
		ge.fliegen();
		ge.quacken();

		System.out.println("");

		Ente2 he = new HolzEnte2();
		he.anzeigen();
		he.schwimmen();
		he.fliegen();
		he.quacken();

		System.out.println("");
	}
}
