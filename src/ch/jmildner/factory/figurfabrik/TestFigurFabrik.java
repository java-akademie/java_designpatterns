package ch.jmildner.factory.figurfabrik;

import ch.jmildner.tools.MyTools;

class ErweiterteFigurFabrik extends FigurFabrik
{
	@Override
	Figur erzeugeRechteck(double breite, double hoehe)
	{
		if (breite == hoehe)
		{
			return new Quadrat(breite);
		}
		else
		{
			return new Rechteck(breite, hoehe);
		}
	}
}



abstract class Figur
{
	abstract double flaeche();


	abstract void show();


	abstract double umfang();
}



class FigurFabrik
{
	Figur erzeugeKreis(double radius)
	{
		return new Kreis(radius);
	}


	Figur erzeugeRechteck(double breite, double hoehe)
	{
		return new Rechteck(breite, hoehe);
	}
}



class Kreis extends Figur
{
	double radius;


	Kreis(double radius)
	{
		this.radius = radius;
	}


	@Override
	double flaeche()
	{
		return radius * radius * 3.14159;
	}


	@Override
	void show()
	{
		System.out.println("kreis     : umfang=" + umfang()
				+ " flaeche=" + flaeche());
	}


	@Override
	double umfang()
	{
		return 2 * radius * 3.14159;
	}
}



class Quadrat extends Figur
{
	double seite;


	Quadrat(double seite)
	{
		this.seite = seite;
	}


	@Override
	double flaeche()
	{
		return seite * seite;
	}


	@Override
	void show()
	{
		System.out.println("quadrat   : umfang=" + umfang()
				+ " flaeche=" + flaeche());
	}


	@Override
	double umfang()
	{
		return 4 * seite;
	}
}



class Rechteck extends Figur
{
	double breite, hoehe;


	Rechteck(double breite, double hoehe)
	{
		this.breite = breite;
		this.hoehe = hoehe;
	}


	@Override
	double flaeche()
	{
		return breite * hoehe;
	}


	@Override
	void show()
	{
		System.out.println("rechteck  : umfang=" + umfang()
				+ " flaeche=" + flaeche());
	}


	@Override
	double umfang()
	{
		return 2 * (breite + hoehe);
	}
}



public class TestFigurFabrik
{
	static FigurFabrik ff;
	static Figur f;


	public static void main(String[] args)
	{
		System.out.println("fabrik-methode");

		for (int i = 0; i < args.length; i++)
		{
			if (args[i].equals("1"))
			{
				System.out.println("aufruf Fabrik 1");
				ff = new ErweiterteFigurFabrik();
				f = ff.erzeugeRechteck(5, 7);
				f.show();
				f = ff.erzeugeKreis(12);
				f.show();
			}
			else
			{
				System.out.println("aufruf Fabrik 2");
				ff = new ErweiterteFigurFabrik();
				f = ff.erzeugeRechteck(5, 5);
				f.show();
			}
		}

		MyTools.pause();
		System.out.println("programmende");
	}
}
