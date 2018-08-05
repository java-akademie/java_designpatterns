package ch.jmildner.state.kaugummiautomat2;

public class AusverkauftZustand implements Zustand
{
	KaugummiAutomat kaugummiAutomat;


	public AusverkauftZustand(KaugummiAutomat automat)
	{
		this.kaugummiAutomat = automat;
	}


	@Override
	public String auffuellen(int anzahl)
	{
		kaugummiAutomat.setAnzahlKugeln(anzahl
				+ kaugummiAutomat.getAnzahlKugeln());
		if (kaugummiAutomat.getAnzahlKugeln() == 0)
		{
			kaugummiAutomat.setZustand(kaugummiAutomat
					.getAusverkauftZustand());
		}
		else
		{
			kaugummiAutomat.setZustand(kaugummiAutomat
					.getKeineMuenzeZustand());
		}

		return "\nAutomat wurde aufgefuellt oder entleert ...";
	}


	@Override
	public String griffDrehen()
	{
		return "\nSie haben gedreht, "
				+ "aber es ist keine Kugel vorhanden";
	}


	@Override
	public String kugelAusgeben()
	{
		return "\nEs wird keine Kugel ausgegeben";
	}


	@Override
	public String muenzeAuswerfen()
	{
		return "\nSie haben keine Muenze eingeworfen";
	}


	@Override
	public String muenzeEinwerfen()
	{
		return "\nSie koennen keine Muenze einwerfen, "
				+ "Automat ist ausverkauft";
	}


	@Override
	public String toString()
	{
		return "\nausverkauft ... auffuellen erforderlich";
	}
}
