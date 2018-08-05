package ch.jmildner.strategy.enten;

abstract class Ente3
{
	FlugVerhalten flugVerhalten;
	QuackVerhalten quackVerhalten;


	Ente3(FlugVerhalten fv, QuackVerhalten qv)
	{
		flugVerhalten = fv;
		quackVerhalten = qv;
	}


	abstract void anzeigen();


	void fliegen()
	{
		flugVerhalten.fliegen();
	}


	void quacken()
	{
		quackVerhalten.quacken();
	}


	void schwimmen()
	{
		System.out.println("ich schwimme ...");
	}
}



class Fliegt implements FlugVerhalten
{
	@Override
	public void fliegen()
	{
		System.out.println("ich fliege ...");
	}
}



class FliegtNicht implements FlugVerhalten
{
	@Override
	public void fliegen()
	{
		System.out.println("ich kann nicht fliegen ...");
	}
}



interface FlugVerhalten
{
	void fliegen();
}



class GummiEnte3 extends Ente3
{
	GummiEnte3()
	{
		super(new FliegtNicht(), new Quitscht());
	}


	GummiEnte3(FlugVerhalten fb, QuackVerhalten qb)
	{
		super(fb, qb);
	}


	@Override
	void anzeigen()
	{
		System.out.println("ich bin eine Gummiente ...");
	}
}



class HolzEnte3 extends Ente3
{
	HolzEnte3()
	{
		super(new FliegtNicht(), new IstStumm());
	}


	HolzEnte3(FlugVerhalten fb, QuackVerhalten qb)
	{
		super(fb, qb);
	}


	@Override
	void anzeigen()
	{
		System.out.println("ich bin eine Holzente ...");
	}
}



class IstStumm implements QuackVerhalten
{
	@Override
	public void quacken()
	{
		System.out.println("ich bin stumm ...");
	}
}



class Quackt implements QuackVerhalten
{
	@Override
	public void quacken()
	{
		System.out.println("quack ...");
	}
}



interface QuackVerhalten
{
	void quacken();
}



class Quitscht implements QuackVerhalten
{
	@Override
	public void quacken()
	{
		System.out.println("quiiitsch ...");
	}
}



class RotkopfEnte3 extends Ente3
{
	RotkopfEnte3()
	{
		super(new Fliegt(), new Quackt());
	}


	@Override
	void anzeigen()
	{
		System.out.println("ich bin eine Rotkopfente ...");
	}
}



class StockEnte3 extends Ente3
{
	StockEnte3()
	{
		super(new Fliegt(), new Quackt());
	}


	@Override
	void anzeigen()
	{
		System.out.println("ich bin eine Stockente ...");
	}
}
