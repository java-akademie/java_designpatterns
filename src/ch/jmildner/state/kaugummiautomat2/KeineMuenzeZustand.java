package ch.jmildner.state.kaugummiautomat2;

public class KeineMuenzeZustand implements Zustand
{
	KaugummiAutomat kaugummiAutomat;


	public KeineMuenzeZustand(KaugummiAutomat automat)
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
		return "\nSie haben gedreht, aber es ist keine Muenze da";
	}


	@Override
	public String kugelAusgeben()
	{
		return "\nEs wird keine Kugel ausgegeben";
	}


	@Override
	public String muenzeAuswerfen()
	{
		return "\nSie haben keine Muenze eingeworfen, "
				+ "es wird keine Muenze zurueckgegeben ...";

	}


	@Override
	public String muenzeEinwerfen()
	{
		kaugummiAutomat.setZustand(kaugummiAutomat
				.getHatMuenzeZustand());

		return "\nSie haben eine Muenze eingeworfen, "
				+ "drehen Sie am Griff ...";
	}


	@Override
	public String toString()
	{
		return "\nbereit fuer Muenzeinwurf oder Auffuellen";
	}
}
