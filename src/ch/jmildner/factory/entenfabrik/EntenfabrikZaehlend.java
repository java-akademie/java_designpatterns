package ch.jmildner.factory.entenfabrik;

public class EntenfabrikZaehlend implements EntenFabrikAbstract
{
	@Override
	public Ente erzeugeGans()
	{
		return new QuackZaehler(new GansEnteAdapter(new Gans()));
	}


	@Override
	public Ente erzeugeGummiEnte()
	{
		return new QuackZaehler(new GummiEnte());
	}


	@Override
	public Ente erzeugeStockEnte()
	{
		return new QuackZaehler(new StockEnte());
	}
}
