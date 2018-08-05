package ch.jmildner.strategy.enten;

abstract class Ente2 implements Fliegen, Quacken
{
	abstract void anzeigen();


	void schwimmen()
	{
		System.out.println("ich schwimme ...");
	}
}



interface Fliegen
{
	void fliegen();
}



class GummiEnte2 extends Ente2 implements Quacken
{
	@Override
	void anzeigen()
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



class HolzEnte2 extends Ente2
{
	@Override
	void anzeigen()
	{
		System.out.println("ich bin eine Holzente ...");
	}


	@Override
	public void fliegen()
	{
		System.out.println("ich kann nicht fliegen ...");
	}


	@Override
	public void quacken()
	{
		System.out.println("ich bin stumm ...");
	}
}



interface Quacken
{
	void quacken();
}



class RotkopfEnte2 extends Ente2
{
	@Override
	void anzeigen()
	{
		System.out.println("ich bin eine Rotkopfente ...");
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



class StockEnte2 extends Ente2
{
	@Override
	void anzeigen()
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


	@Override
	public void schwimmen()
	{
		System.out.println("ich schwimme ...");
	}
}
