package ch.jmildner.proxy.kaugummiautomat;

public class VerkauftZustand implements Zustand
{
	KaugummiAutomat kaugummiAutomat;


	public VerkauftZustand(KaugummiAutomat automat)
	{
		this.kaugummiAutomat = automat;
	}


	@Override
	public void auffuellen(int anzahl)
	{
		Tools.msg("Es wirde Geld eingeworfen, "
				+ "auffuellen nicht moeglich");
	}


	@Override
	public void griffDrehen()
	{
		Tools.msg("Sie haben den Griff ein zweites Mal gedreht, "
				+ "Sie bekommen aber nur eine Kugel");
	}


	@Override
	public void kugelAusgeben()
	{
		kaugummiAutomat.muenzeFressen();
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
		Tools.msg("warten Sie bitte, Sie bekommen eine Kugel");
	}


	@Override
	public String toString()
	{
		return "gibt eine Kugel aus";
	}
}
