package ch.jmildner.state.kaugummiautomat2;

public class VerkauftZustand implements Zustand
{
	KaugummiAutomat kaugummiAutomat;


	public VerkauftZustand(KaugummiAutomat automat)
	{
		this.kaugummiAutomat = automat;
	}


	@Override
	public String auffuellen(int anzahl)
	{
		return "\nEs wirde Geld eingeworfen, "
				+ "auffuellen nicht moeglich";
	}


	@Override
	public String griffDrehen()
	{
		return "\nSie haben den Griff ein zweites Mal gedreht, "
				+ "Sie bekommen aber nur eine Kugel";
	}


	@Override
	public String kugelAusgeben()
	{
		String s = "";
		s += kaugummiAutomat.muenzeFressen();
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
		return "\nwarten Sie bitte, Sie bekommen eine Kugel";
	}


	@Override
	public String toString()
	{
		return "\ngibt eine Kugel aus";
	}
}
