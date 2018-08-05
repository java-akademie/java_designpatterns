package ch.jmildner.factory.entenfabrik;

public class QuackZaehler implements Ente
{
	static int quackZaehler = 0;

	static int getQuackZaehler()
	{
		return quackZaehler;
	}


	Ente ente;


	QuackZaehler(Ente ente)
	{
		this.ente = ente;
	}


	@Override
	public void anzeigen()
	{
		ente.anzeigen();
	}


	@Override
	public void fliegen()
	{
		ente.fliegen();
	}


	@Override
	public void quacken()
	{
		quackZaehler++;
		ente.quacken();

	}
}
