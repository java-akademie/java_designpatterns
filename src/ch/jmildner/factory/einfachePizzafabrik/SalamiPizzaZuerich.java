package ch.jmildner.factory.einfachePizzafabrik;

public class SalamiPizzaZuerich implements Pizza
{
	private String name = "Salami Pizza nach Zuerich-Art";


	public SalamiPizzaZuerich()
	{
		System.out.println("\nerzeuge " + name);
	}


	@Override
	public void backen()
	{
	}


	@Override
	public void einpacken()
	{
	}


	@Override
	public void schneiden()
	{
	}


	@Override
	public void vorbereiten()
	{
	}


	@Override
	public void zeigen()
	{
		System.out.println(name);
	}
}
