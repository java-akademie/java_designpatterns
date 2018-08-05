package ch.jmildner.adapter;

public interface Ente
{
	void anzeigen();
	void fliegen();
	void quacken();
}
  


class GummiEnte implements Ente
{
	@Override
	public void anzeigen()
	{
		System.out.println("ich bin eine Gummiente ...");
	}


	@Override
	public void fliegen()
	{
		System.out.println("ich kann nicht fliegen ...");
	}


	@Override
	public void quacken()
	{
		System.out.println("quiiitsch ...");
	}
}



class StockEnte implements Ente
{
	@Override
	public void anzeigen()
	{
		System.out.println("ich bin eine Stockente ...");
	}


	@Override
	public void fliegen()
	{
		System.out.println("ich fliege ...");
	}


	@Override
	public void quacken()
	{
		System.out.println("quack ...");
	}
}
