package ch.jmildner.factory.einfachePizzafabrik;

public class SalamiPizzaBasel implements Pizza
{
	private String name = "Salami Pizza nach Basel-Art";


	public SalamiPizzaBasel()
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
		System.out.println("  ich verfeinere die Salamipizza ...");
	}


	@Override
	public void zeigen()
	{
		System.out.println(name);
	}
}
