package ch.jmildner.factory.einfachePizzafabrik;

public class SchinkenPizzaBasel implements Pizza
{
	private String name = "Schinken Pizza nach Basel-Art";


	public SchinkenPizzaBasel()
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
