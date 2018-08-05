package ch.jmildner.factory.entenfabrik;

public class TestEntenFabrik
{

	public static void main(String[] args)
	{
		TestEntenFabrik simulator = new TestEntenFabrik();
		// EntenFabrikAbstract entenFabrik = new
		// EntenfabrikGewoehnlich();
		EntenFabrikAbstract entenFabrik = new EntenfabrikZaehlend();
		simulator.simulieren(entenFabrik);
	}


	void simulieren(EntenFabrikAbstract ef)
	{
		Ente stockEnte = ef.erzeugeStockEnte();
		Ente gummiEnte1 = ef.erzeugeGummiEnte();
		Ente gans1 = ef.erzeugeGans();
		Ente gummiEnte2 = ef.erzeugeGummiEnte();
		Ente gans2 = ef.erzeugeGans();

		System.out.println("\nStockEnte");
		testeEnte(stockEnte);

		System.out.println("\nGans");
		testeEnte(gans1);

		System.out.println("\nGummmiEnte");
		testeEnte(gummiEnte1);

		System.out.println("\nGans");
		testeEnte(gans2);

		System.out.println("\nGummiEnte");
		testeEnte(gummiEnte2);

		System.out.println("\n");

		System.out
				.println("Anzahl der Quacks, Quietschs und Schnatters: "
						+ QuackZaehler.getQuackZaehler());
	}


	void testeEnte(Ente e)
	{
		e.anzeigen();
		e.fliegen();
		e.quacken();
	}
}
