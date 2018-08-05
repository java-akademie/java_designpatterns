package ch.jmildner.state.kaugummiautomat2;

public class KaugummiAutomat
{
	private String standort;

	private int anzahlKugeln = 0;
	private int anzahlMuenzen = 0;

	private Zustand ausverkauftZustand;
	private Zustand keineMuenzeZustand;
	private Zustand hatMuenzeZustand;
	private Zustand verkauftZustand;
	private Zustand gewinnZustand;

	private Zustand zustand = ausverkauftZustand;


	public KaugummiAutomat(String standort, int anzahl)
	{
		ausverkauftZustand = new AusverkauftZustand(this);
		keineMuenzeZustand = new KeineMuenzeZustand(this);
		hatMuenzeZustand = new HatMuenzeZustand(this);
		verkauftZustand = new VerkauftZustand(this);
		gewinnZustand = new GewinnZustand(this);

		this.standort = standort;
		this.anzahlKugeln = anzahl;

		if (anzahl > 0)
		{
			zustand = keineMuenzeZustand;
		}
	}


	public String auffuellen(int anzahl)
	{
		return zustand.auffuellen(anzahl);
	}


	public int getAnzahlKugeln()
	{
		return anzahlKugeln;
	}


	public int getAnzahlMuenzen()
	{
		return anzahlMuenzen;
	}


	public Zustand getAusverkauftZustand()
	{
		return ausverkauftZustand;
	}


	public String getBericht()
	{
		return this + "";
	}


	public Zustand getGewinnZustand()
	{
		return gewinnZustand;
	}


	public Zustand getHatMuenzeZustand()
	{
		return hatMuenzeZustand;
	}


	public Zustand getKeineMuenzeZustand()
	{
		return keineMuenzeZustand;
	}


	public Zustand getVerkauftZustand()
	{
		return verkauftZustand;
	}


	public String griffDrehen()
	{
		String s = "";
		s += zustand.griffDrehen();
		s += zustand.kugelAusgeben();
		return s;
	}


	public String kugelFreigeben()
	{
		anzahlKugeln--;
		return "\nEine Kugel rollt aus dem Ausgabeschacht "
				+ "und kann entnommen werden";

	}


	public String muenzeAuswerfen()
	{
		return zustand.muenzeAuswerfen();
	}


	public String muenzeEinwerfen()
	{
		return zustand.muenzeEinwerfen();
	}


	public String muenzeFressen()
	{
		anzahlMuenzen++;
		return "\nEine Muenze plumst in die Kassa";
	}


	public void setAnzahlKugeln(int anzahlKugeln)
	{
		this.anzahlKugeln = anzahlKugeln;
	}


	public void setAnzahlMuenzen(int anzahlMuenzen)
	{
		this.anzahlMuenzen = anzahlMuenzen;
	}


	public void setZustand(Zustand zustand)
	{
		this.zustand = zustand;
	}


	@Override
	public String toString()
	{
		StringBuffer result = new StringBuffer();

		result.append("\nKaukugel & Co KG");
		result.append("\nJava-gestuetzter Kaugummi-Standautomat");
		result.append("  Modell Nr. 2006");
		result.append("\nStandort: " + standort);
		result.append("\nBestand Kaukugeln: " + anzahlKugeln);
		result.append("\nBestand Muenzen  : " + anzahlMuenzen);

		result.append("\nZustand des Automats: ");

		result.append(zustand);

		result.append("\n");

		return result.toString();
	}
}
