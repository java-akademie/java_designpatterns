package ch.jmildner.proxy.kaugummiautomat;

public class HatMuenzeZustand implements Zustand
{
	KaugummiAutomat kaugummiAutomat;


	public HatMuenzeZustand(KaugummiAutomat automat)
	{
		this.kaugummiAutomat = automat;
	}


	@Override
	public void auffuellen(int anzahl)
	{
		Tools.msg("Es wurde Geld eingeworfen, "
				+ "auffuellen nicht moeglich");
	}


	@Override
	public void griffDrehen()
	{
		Tools.msg("Sie haben den Griff gedreht ...");

		int gewinn = Tools.getZufallszahl(10);

		if (gewinn == 0 && kaugummiAutomat.getAnzahlKugeln() > 1)
		{
			Tools.msg("    und gewonnen ... ");
			kaugummiAutomat
					.setZustand(kaugummiAutomat.getGewinnZustand());
		}
		else
		{
			kaugummiAutomat
					.setZustand(kaugummiAutomat.getVerkauftZustand());
		}
	}


	@Override
	public void kugelAusgeben()
	{
		Tools.msg("Es wird keine Kugel ausgegeben");
	}


	@Override
	public void muenzeAuswerfen()
	{
		Tools.msg("Muenze wird zurueckgegeben ");

		kaugummiAutomat
				.setZustand(kaugummiAutomat.getKeineMuenzeZustand());
	}


	@Override
	public void muenzeEinwerfen()
	{
		Tools.msg("Sie koennen keine weitere Muenze einwerfen, "
				+ "drehen Sie am Griff ...");
	}


	@Override
	public String toString()
	{
		return "bereit fuer Drehen des Griffs oder Muenzrueckgabe";
	}
}
