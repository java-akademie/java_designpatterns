package ch.jmildner.state.kaugummiautomat2;

import ch.jmildner.tools.MyTools;

public class TestKaugummiAutomat
{
	public static void main(String[] args) throws Exception
	{
		new TestKaugummiAutomat();
	}


	KaugummiAutomat kaugummiAutomat;


	TestKaugummiAutomat() throws Exception
	{
		kaugummiAutomat = new KaugummiAutomat("ZUERICH HBF", 50);
		vorlauf();
		hptvera();
		nchlauf();
	}


	private void hilfe()
	{
		System.out.println("");
		System.out.println("Sie haben folgende Moeglichkeiten");
		System.out.println("1 - Muenze einwerfen             ");
		System.out.println("2 - Gruff drehen                 ");
		System.out.println("3 - Muenze zurueckgeben          ");
		System.out.println("4 - auffuellen (5 Kugeln)        ");
		System.out.println("5 - Status anzeigen              ");
		System.out.println("6 - Hilfe                        ");
		System.out.println("7 - beenden                      ");
		System.out.println("");
	}


	private void hptvera()
	{
		int auswahl = MyTools
				.getInteger("\nAuswahl eingeben (Hilfe=6) > ", 1, 7);

		while (auswahl != 7)
		{
			verarbeitung(auswahl);
			auswahl = MyTools.getInteger(
					"\nAuswahl eingeben (Hilfe=6) > ", 1, 7);
		}
	}


	private void nchlauf()
	{
		stoppMeldung();
	}


	private void startMeldung()
	{
		System.out.println("----------------------------------------");
		System.out.println("dies ist ein Testprogramm fuer die      ");
		System.out.println("Klasse  <KaugummiAutomat>               ");
		System.out.println("----------------------------------------");
		System.out.println("\n");
	}


	private void stoppMeldung()
	{
		System.out.println("\n");
		System.out.println("----------------------------------------");
		System.out.println("Danke dass Sie dieses Programm          ");
		System.out.println("getestet haben                          ");
		System.out.println("----------------------------------------");
	}


	private void verarbeitung(int a)
	{
		switch (a)
		{
			case 1:
				Tools.msg(kaugummiAutomat.muenzeEinwerfen());
				break;
			case 2:
				Tools.msg(kaugummiAutomat.griffDrehen());
				break;
			case 3:
				Tools.msg(kaugummiAutomat.muenzeAuswerfen());
				break;
			case 4:
				int k = MyTools.getInteger("wieviele Kugeln > ");

				while (k + kaugummiAutomat.getAnzahlKugeln() <= 0)
				{
					System.out.print(" Anzahl zu klein .... ");

					k = MyTools.getInteger("wieviele Kugeln > ");
				}

				Tools.msg(kaugummiAutomat.auffuellen(k));
				break;
			case 5:
				Tools.msg(kaugummiAutomat.toString());
				break;
			case 6:
				hilfe();
				break;
			default:
				break;
		}
	}


	private void vorlauf()
	{
		startMeldung();
		hilfe();
	}
}
