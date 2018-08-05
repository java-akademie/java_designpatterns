package ch.jmildner.state.kaugummiautomat2;

public class GewinnZustand implements Zustand
{
	KaugummiAutomat kaugummiAutomat;


	public GewinnZustand(KaugummiAutomat automat)
	{
		this.kaugummiAutomat = automat;
	}


	@Override
	public String auffuellen(int anzahl)
	{
		return "\nEs wurde Geld eingeworfen, "
				+ "auffuellen nicht moeglich";
	}


	@Override
	public String griffDrehen()
	{
		return "\nsie haben den Griff ein zweites Mal gedreht, "
				+ "Sie bekommen aber nur zwei Kugeln";
	}


	@Override
	public String kugelAusgeben()
	{
		String s = "";

		s += kaugummiAutomat.muenzeFressen();
		s += kaugummiAutomat.kugelFreigeben();
		s += kaugummiAutomat.kugelFreigeben();

		if (kaugummiAutomat.getAnzahlKugeln() > 0)
		{
			kaugummiAutomat.setZustand(kaugummiAutomat
					.getKeineMuenzeZustand());
		}
		else
		{
			s += "\nHoppla, keine Kugeln mehr da";
			kaugummiAutomat.setZustand(kaugummiAutomat
					.getAusverkauftZustand());
		}
		return s;
	}


	@Override
	public String muenzeAuswerfen()
	{
		return "\nzu spaet, Sie haben schon am Griff gedreht";
	}


	@Override
	public String muenzeEinwerfen()
	{
		return "\nwarten Sie bitte, Sie bekommen zwei Kugeln";
	}


	@Override
	public String toString()
	{
		return "\ngibt zwei Kugeln aus";
	}
}
