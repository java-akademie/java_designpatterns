package ch.jmildner.proxy.kaugummiautomat;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class KaugummiAutomat extends UnicastRemoteObject
		implements KaugummiAutomatRemote
{
	private static final long serialVersionUID = 1L;

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
			throws RemoteException
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


	public void auffuellen(int anzahl)
	{
		zustand.auffuellen(anzahl);
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


	@Override
	public String getBericht() throws RemoteException
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


	public void griffDrehen()
	{
		zustand.griffDrehen();
		zustand.kugelAusgeben();
	}


	public void kugelFreigeben()
	{
		Tools.msg("Eine Kugel rollt aus dem Ausgabeschacht "
				+ "und kann entnommen werden");

		anzahlKugeln--;
	}


	public void muenzeAuswerfen()
	{
		zustand.muenzeAuswerfen();
	}


	public void muenzeEinwerfen()
	{
		zustand.muenzeEinwerfen();
	}


	public void muenzeFressen()
	{
		Tools.msg("Eine Muenze plumst in die Kassa");

		anzahlMuenzen++;
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
