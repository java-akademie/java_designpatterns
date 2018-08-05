package ch.jmildner.decorator.quackzaehler;

public class QuackZaehlerTest
{

	public static void main(String[] args)
	{
		QuackZaehlerTest simulator = new QuackZaehlerTest();
		simulator.simulieren();
	}


	void simulieren()
	{
		// jede neue Ente wird in einen neuen Decorator "QuackZaehler"
		// eingepackt
		Ente stockEnte = new QuackZaehler(new StockEnte());
		Ente gummiEnte1 = new QuackZaehler(new GummiEnte());
		Ente gans1 = new QuackZaehler(new GansEnteAdapter(new Gans()));

		// leider wurden gummiEnte2 und gans2 nicht dekoriert (Fehler!)
		// somit werden ihre Quacks und Quietschs auch nicht mitgezaehlt
		Ente gummiEnte2 = new GummiEnte();
		Ente gans2 = new GansEnteAdapter(new Gans());

		System.out.println("\nStockEnte wird gezaehlt");
		testeEnte(stockEnte);

		System.out.println("\nGans wird gezaehlt");
		testeEnte(gans1);

		System.out.println("\nGummmiEnte wird gezaehlt");
		testeEnte(gummiEnte1);

		System.out.println("\nGans wird nicht gezaehlt (Fehler?)");
		testeEnte(gans2);

		System.out.println("\nGummiEnte wird nicht gezaehlt (Fehler?)");
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
