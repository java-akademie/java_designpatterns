package ch.jmildner.adapter;

public class GansEnteAdapterTest
{

	public static void main(String[] args)
	{
		Ente stockEnte = new StockEnte();
		testeEnte(stockEnte);

		System.out.println("");

		Ente gummiEnte = new GummiEnte();
		testeEnte(gummiEnte);

		System.out.println("");

		Ente gans = new GansEnteAdapter(new Gans());
		testeEnte(gans);
	}


	static void testeEnte(Ente e)
	{
		e.anzeigen();
		e.fliegen();
		e.quacken();
	}
}
