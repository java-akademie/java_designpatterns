package ch.jmildner.factory.entenfabrik;

public class EntenfabrikGewoehnlich implements EntenFabrikAbstract
{
	@Override
	public Ente erzeugeGans()
	{
		return new GansEnteAdapter(new Gans());
	}


	@Override
	public Ente erzeugeGummiEnte()
	{
		return new GummiEnte();
	}


	@Override
	public Ente erzeugeStockEnte()
	{
		return new StockEnte();
	}
}
