package ch.jmildner.proxy.kaugummiautomat;

public class GewinnZustand implements Zustand
{
	KaugummiAutomat kaugummiAutomat;


	public GewinnZustand(KaugummiAutomat automat)
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
		Tools.msg("Sie haben den Griff ein zweites Mal gedreht, "
				+ "Sie bekommen aber nur zwei Kugeln");
	}


	@Override
	public void kugelAusgeben()
	{
		kaugummiAutomat.muenzeFressen();

		kaugummiAutomat.kugelFreigeben();
		kaugummiAutomat.kugelFreigeben();

		if (kaugummiAutomat.getAnzahlKugeln() > 0)
		{
			kaugummiAutomat.setZustand(
					kaugummiAutomat.getKeineMuenzeZustand());
		}
		else
		{
			System.out.println("Hoppla, keine Kugeln mehr da");
			kaugummiAutomat.setZustand(
					kaugummiAutomat.getAusverkauftZustand());
		}
	}


	@Override
	public void muenzeAuswerfen()
	{
		Tools.msg("zu sp�t, Sie haben schon am Griff gedreht");
	}


	@Override
	public void muenzeEinwerfen()
	{
		Tools.msg("warten Sie bitte, Sie bekommen zwei Kugeln");
	}


	@Override
	public String toString()
	{
		return "gibt zwei Kugeln aus";
	}
}
