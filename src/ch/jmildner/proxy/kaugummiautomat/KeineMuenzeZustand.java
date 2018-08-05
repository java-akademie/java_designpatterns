package ch.jmildner.proxy.kaugummiautomat;

public class KeineMuenzeZustand implements Zustand
{
	KaugummiAutomat kaugummiAutomat;


	public KeineMuenzeZustand(KaugummiAutomat automat)
	{
		this.kaugummiAutomat = automat;
	}


	@Override
	public void auffuellen(int anzahl)
	{
		kaugummiAutomat.setAnzahlKugeln(
				anzahl + kaugummiAutomat.getAnzahlKugeln());

		kaugummiAutomat
				.setZustand(kaugummiAutomat.getKeineMuenzeZustand());

		Tools.msg("Automat wurde aufgefuellt ...");
	}


	@Override
	public void griffDrehen()
	{
		Tools.msg("Sie haben gedreht, aber es ist keine Muenze da");
	}


	@Override
	public void kugelAusgeben()
	{
		Tools.msg("Es wird keine Kugel ausgegeben");
	}


	@Override
	public void muenzeAuswerfen()
	{
		Tools.msg("Sie haben eine Muenze eingeworfen, "
				+ "drehen Sie am Griff ...");

	}


	@Override
	public void muenzeEinwerfen()
	{
		Tools.msg("Sie haben eine Muenze eingeworfen, "
				+ "drehen Sie am Griff ...");

		kaugummiAutomat
				.setZustand(kaugummiAutomat.getHatMuenzeZustand());
	}


	@Override
	public String toString()
	{
		return "bereit fuer Muenzeinwurf oder Auffuellen";
	}
}
