package ch.jmildner.proxy.kaugummiautomat;

public class AusverkauftZustand implements Zustand
{
	KaugummiAutomat kaugummiAutomat;


	public AusverkauftZustand(KaugummiAutomat automat)
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
		Tools.msg("Sie haben gedreht, "
				+ "aber es ist keine Kugel vorhanden");
	}


	@Override
	public void kugelAusgeben()
	{
		Tools.msg("Es wird keine Kugel ausgegeben");
	}


	@Override
	public void muenzeAuswerfen()
	{
		Tools.msg("Sie haben keine Muenze eingeworfen");
	}


	@Override
	public void muenzeEinwerfen()
	{
		Tools.msg("Sie koennen keine Muenze einwerfen, "
				+ "Automat ist ausverkauft");
	}


	@Override
	public String toString()
	{
		return "ausverkauft ... auffuellen erforderlich";
	}
}
