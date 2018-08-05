package ch.jmildner.strategy.allgemein;

class ErsteStrategie implements Strategie
{
	@Override
	public void doIt()
	{
		System.out.println("erste Strategie");
	}
}



class Kontext
{
	Strategie strategie;


	Kontext(Strategie s)
	{
		setStrategie(s);
	}


	void doCommon()
	{
		System.out.println("allgemeine Aufgabe");
	}


	void operate()
	{
		strategie.doIt();
	}


	void setStrategie(Strategie s)
	{
		strategie = s;
	}
}



interface Strategie
{
	void doIt();
}



class ZweiteStrategie implements Strategie
{
	@Override
	public void doIt()
	{
		System.out.println("zweite Strategie");
	}
}
