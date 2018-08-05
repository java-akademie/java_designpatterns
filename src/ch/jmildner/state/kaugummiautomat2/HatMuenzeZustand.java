package ch.jmildner.state.kaugummiautomat2;

public class HatMuenzeZustand implements Zustand
{
	KaugummiAutomat kaugummiAutomat;


	public HatMuenzeZustand(KaugummiAutomat automat)
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
		String s = "\nSie haben den Griff gedreht ...";

		int gewinn = Tools.getZufallszahl(10);

		if (gewinn == 0 && kaugummiAutomat.getAnzahlKugeln() > 1)
		{
			s += "\n    und gewonnen ... ";
			kaugummiAutomat.setZustand(kaugummiAutomat
					.getGewinnZustand());
		}
		else
		{
			kaugummiAutomat.setZustand(kaugummiAutomat
					.getVerkauftZustand());
		}

		return s;
	}


	@Override
	public String kugelAusgeben()
	{
		return "\nEs wird keine Kugel ausgegeben";
	}


	@Override
	public String muenzeAuswerfen()
	{
		kaugummiAutomat.setZustand(kaugummiAutomat
				.getKeineMuenzeZustand());
		return "\nMuenze wird zurueckgegeben ";
	}


	@Override
	public String muenzeEinwerfen()
	{
		return "\nSie koennen keine weitere Muenze einwerfen, "
				+ "drehen Sie am Griff ...";
	}


	@Override
	public String toString()
	{
		return "\nbereit fuer Drehen des Griffs oder Muenzrueckgabe";
	}
}
