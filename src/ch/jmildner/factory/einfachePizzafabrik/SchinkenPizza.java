package ch.jmildner.factory.einfachePizzafabrik;

public class SchinkenPizza implements Pizza
{

	private String name = "SchinkenPizza";


	public SchinkenPizza()
	{
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
