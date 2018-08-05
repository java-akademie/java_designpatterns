package ch.jmildner.strategy.enten;

public class EntenSimulation3Test
{

	/**
	 * @param args args
	 */
	public static void main(String[] args)
	{
		Ente3 se = new StockEnte3();
		se.anzeigen();
		se.schwimmen();
		se.fliegen();
		se.quacken();

		System.out.println("");

		Ente3 re = new RotkopfEnte3();
		re.anzeigen();
		re.schwimmen();
		re.fliegen();
		re.quacken();

		System.out.println("");

		Ente3 ge = new GummiEnte3(new FliegtNicht(), new Quitscht());
		ge.anzeigen();
		ge.schwimmen();
		ge.fliegen();
		ge.quacken();

		System.out.println("");

		Ente3 he1 = new HolzEnte3(new FliegtNicht(), new IstStumm());
		he1.anzeigen();
		he1.schwimmen();
		he1.fliegen();
		he1.quacken();

		System.out.println("");

		Ente3 he2 = new HolzEnte3(new Fliegt(), new Quackt());
		he2.anzeigen();
		he2.schwimmen();
		he2.fliegen();
		he2.quacken();

		System.out.println("");
	}

}
