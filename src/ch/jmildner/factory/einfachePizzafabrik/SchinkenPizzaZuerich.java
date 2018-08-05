package ch.jmildner.factory.einfachePizzafabrik;

public class SchinkenPizzaZuerich implements Pizza
{
	private String name = "Schinken Pizza nach Zuerich-Art";


	public SchinkenPizzaZuerich()
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
		System.out.println("  ich verfeinere die Schinkenpizza ...");
	}


	@Override
	public void zeigen()
	{
		System.out.println(name);
	}

}
