package ch.jmildner.proxy.kaugummiautomat;

import java.rmi.Naming;

import ch.jmildner.tools.MyTools;

public class TestKaugummiAutomat
{
	static KaugummiAutomat kaugummiAutomat;


	static private void aufstellenKaugummiAutomat()
	{
		try
		{
			kaugummiAutomat = new KaugummiAutomat("ZUERICH HBF", 25);
			Tools.msg("Automat aufgestellt und erstbefuellt");
			Naming.rebind("zhhbf", kaugummiAutomat);
			Tools.msg("Automat fuer fernueberwachung registriert");
		}
		catch (Exception e)
		{
			Tools.msg("\ndie Registrierung ging schief: "
					+ "haben Sie <rmiregistry> gestartet?");
			Tools.msg("\n" + e + "\n");
			Tools.msg("Fernueberwachung nicht moeglich");
		}
	}


	static private void betriebKaugummiAutomat()
	{
		vorlauf();
		hptvera();
		nchlauf();
	}


	static private void hilfe()
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


	static private void hptvera()
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


	public static void main(String[] args) throws Exception
	{
		aufstellenKaugummiAutomat();
		betriebKaugummiAutomat();
	}


	static private void nchlauf()
	{
		stoppMeldung();
	}


	static private void startMeldung()
	{
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("dies ist ein Testprogramm fuer die      ");
		System.out.println("Klasse  <KaugummiAutomat>               ");
		System.out.println("----------------------------------------");
		System.out.println("\n");
	}


	static private void stoppMeldung()
	{
		System.out.println("\n");
		System.out.println("----------------------------------------");
		System.out.println("Danke dass Sie dieses Programm          ");
		System.out.println("getestet haben                          ");
		System.out.println("----------------------------------------");
	}


	static private void verarbeitung(int a)
	{
		switch (a)
		{
			case 1:
				kaugummiAutomat.muenzeEinwerfen();
				break;
			case 2:
				kaugummiAutomat.griffDrehen();
				break;
			case 3:
				kaugummiAutomat.muenzeAuswerfen();
				break;
			case 4:
				int k = MyTools.getInteger("wieviele Kugeln > ");

				while (k + kaugummiAutomat.getAnzahlKugeln() <= 0)
				{
					System.out.print(" Anzahl zu klein .... ");

					k = MyTools.getInteger("wieviele Kugeln > ");
				}

				kaugummiAutomat.auffuellen(k);
				break;
			case 5:
				System.out.println(kaugummiAutomat);
				break;
			case 6:
				hilfe();
				break;
			default:
				break;
		}
	}


	static private void vorlauf()
	{
		startMeldung();
		hilfe();
	}
}
