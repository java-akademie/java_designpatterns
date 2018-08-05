package ch.jmildner.strategy.enten;

abstract class Ente1
{
	abstract void anzeigen();


	void fliegen()
	{
		System.out.println("ich fliege ...");
	}


	void quacken()
	{
		System.out.println("quack ...");
	}


	void schwimmen()
	{
		System.out.println("ich schwimme ...");
	}
}



class GummiEnte1 extends Ente1
{
	@Override
	void anzeigen()
	{
		System.out.println("ich bin eine Gummiente ...");
	}


	@Override
	void fliegen()
	{
		System.out.println("ich kann nicht fliegen ...");
	}


	@Override
	void quacken()
	{
		System.out.println("quiiitsch ...");
	}
}



class HolzEnte1 extends Ente1
{
	@Override
	void anzeigen()
	{
		System.out.println("ich bin eine Holzente ...");
	}


	@Override
	void fliegen()
	{
		System.out.println("ich kann nicht fliegen ...");
	}


	@Override
	void quacken()
	{
		System.out.println("ich bin stumm ...");
	}
}



class RotkopfEnte1 extends Ente1
{
	@Override
	void anzeigen()
	{
		System.out.println("ich bin eine Rotkopfente ...");
	}
}



class StockEnte1 extends Ente1
{
	@Override
	void anzeigen()
	{
		System.out.println("ich bin eine Stockente ...");
	}
}
