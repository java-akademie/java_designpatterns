package ch.jmildner.state.kaugummiautomat1;

public class KaugummiAutomat
{

	private final static int AUSVERKAUFT = 1;
	private final static int KEINE_MUENZE = 2;
	private final static int HAT_MUENZE = 3;
	private final static int VERKAUFT = 8;

	private static String msg(String msg)
	{
		System.out.println(msg);
		return msg;
	}

	private int zustand = AUSVERKAUFT;


	private int anzahl = 0;


	public KaugummiAutomat(int anzahl)
	{
		this.anzahl = anzahl;

		if (anzahl > 0)
		{
			zustand = KEINE_MUENZE;
		}
	}


	public String auffuellen(int anzahl)
	{
		switch (zustand)
		{
			case AUSVERKAUFT:
			case KEINE_MUENZE:
				this.anzahl += anzahl;
				zustand = KEINE_MUENZE;
				return msg("Automat wurde aufgefuellt");
			case HAT_MUENZE:
				return msg("auffuellen nicht moeglich, "
						+ "bitte Geldrueckgabeknopf druecken");
			case VERKAUFT:
				return msg("auffuellen nicht moeglich, "
						+ "bitte warten bis die Kugel entnommen ist");
			default:
				return msg("unbekannter Zustand" + zustand);
		}
	}


	public String griffDrehen()
	{
		switch (zustand)
		{
			case AUSVERKAUFT:
				return msg("Sie haben gedreht, aber es sind keine Kugeln da");
			case KEINE_MUENZE:
				return msg("Sie haben gedreht, aber es ist keine Muenze da");
			case HAT_MUENZE:
				zustand = VERKAUFT;
				String s;
				s = msg("Sie haben den Griff gedreht ...");
				s = " ... " + kugelAusgeben();
				return s;
			case VERKAUFT:
				return msg("Sie haben den Griff ein zweites Mal gedreht, "
						+ "Sie bekommen aber nur eine Kugel");
			default:
				return msg("unbekannter Zustand" + zustand);
		}
	}


	public String kugelAusgeben()
	{
		// vor dem Aufruf kugelAusgeben() wird immer der zustand auf
		// VERKAUFT gesetzt
		// somit sollten die Zustaende AUSVERKAUFT, KEINE_MUENZE,
		// HAT_MUENZE nicht moeglich sein

		switch (zustand)
		{
			case AUSVERKAUFT:
			case KEINE_MUENZE:
			case HAT_MUENZE:
				return msg("es wird keine Kugel ausgegeben "
						+ "(dieser Zustand ist unmoeglich)");
			case VERKAUFT:
				String s;
				s = msg("Eine Kugel rollt aus dem Ausgabeschacht "
						+ "und kann entnommen werden");

				anzahl = anzahl - 1;

				if (anzahl == 0)
				{
					s = " ... " + msg("keine Kugeln mehr da ...");
					zustand = AUSVERKAUFT;
				}
				else
				{
					zustand = KEINE_MUENZE;
				}

				return s;
			default:
				return msg("unbekannter Zustand" + zustand);
		}
	}


	public String muenzeAuswerfen()
	{
		switch (zustand)
		{
			case AUSVERKAUFT:
				return msg("Auswurf nicht moeglich, "
						+ "Sie haben keine Muenze eingeworfen");
			case KEINE_MUENZE:
				return msg("Sie haben keine Muenze eingeworfen");
			case HAT_MUENZE:
				zustand = KEINE_MUENZE;
				return msg("Muenze wird zurueckgegeben ...");
			case VERKAUFT:
				return msg("zu spaet, Sie haben den Griff schon gedreht");
			default:
				return msg("unbekannter Zustand" + zustand);
		}
	}


	public String muenzeEinwerfen()
	{
		switch (zustand)
		{
			case AUSVERKAUFT:
				return msg("Sie koennen keine Muenze einwerfen, "
						+ "Automat ist ausverkauft");

			case KEINE_MUENZE:
				zustand = HAT_MUENZE;
				return msg("Sie haben eine Muenze eingeworfen, "
						+ "drehen Sie an Griff ...");

			case HAT_MUENZE:
				return msg("Sie koennen keine weitere Muenze einwerfen");

			case VERKAUFT:
				return msg("Bitte warten Sie, Sie erhalten eine Kugel");

			default:
				return msg("unbekannter Zustand" + zustand);

		}
	}


	@Override
	public String toString()
	{
		StringBuffer result = new StringBuffer();

		result.append("\nKaukugel & Co KG");
		result.append("\nJava-gestuetzter Kaugummi-Standautomat");
		result.append(" - Modell Nr. 2006");
		result.append("\nBestand: " + anzahl + " Kaugummikugel");

		if (anzahl != 1)
		{
			result.append("n"); // ...kugel wird zu ...kugeln
		}

		result.append("\nAutomat ");

		switch (zustand)
		{
			case AUSVERKAUFT:
				result.append("ausverkauft");
				break;
			case KEINE_MUENZE:
				result.append("bereit fuer Muenzeinwurf");
				break;
			case HAT_MUENZE:
				result.append("bereit fuer Drehen des Griffs");
				break;
			case VERKAUFT:
				result.append("gibt Kugel aus");
				break;
			default:
				break;
		}

		result.append("\n");

		return result.toString();
	}

}
