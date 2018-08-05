package ch.jmildner.observer.nachrichten;

import java.util.Vector;

public class Publisher implements NachrichtenQuelle
{
	private String name;
	private Vector<NachrichtenEmpfaenger> vec = new Vector<NachrichtenEmpfaenger>();


	public Publisher(String name)
	{
		this.name = name;
	}


	@Override
	public void addAbonnent(NachrichtenEmpfaenger empf)
	{
		vec.add(empf);
	}


	@Override
	public void neueNachricht(String nachricht)
	{
		for (int i = 0, max = vec.size(); i < max; i++)
		{
			NachrichtenEmpfaenger ref;
			ref = vec.elementAt(i);
			ref.empfangeNachricht(name + " " + nachricht);
		}
	}
}
