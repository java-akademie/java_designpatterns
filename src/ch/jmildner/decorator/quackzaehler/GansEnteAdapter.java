package ch.jmildner.decorator.quackzaehler;

public class GansEnteAdapter implements Ente
{
	Gans gans;


	GansEnteAdapter(Gans gans)
	{
		this.gans = gans;
	}


	@Override
	public void anzeigen()
	{
		gans.anzeigen();
	}


	@Override
	public void fliegen()
	{
		System.out.println("ich fliege besser als eine Ente ...");
	}


	@Override
	public void quacken()
	{
		gans.schnatter();

	}
}
