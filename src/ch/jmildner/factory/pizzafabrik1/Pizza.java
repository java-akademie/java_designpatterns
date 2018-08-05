package ch.jmildner.factory.pizzafabrik1;

import java.util.ArrayList;

public abstract class Pizza
{
	String name;
	String teig;
	String sosse;
	ArrayList<String> belaege = new ArrayList<String>();


	void backen()
	{
		System.out.println("Backe 25 Minuten bei 350 Grad");
	}


	void einpacken()
	{
		System.out
				.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
	}


	void schneiden()
	{
		System.out.println("Schneide die Pizza diagonal in Stuecke");
	}


	void vorbereiten()
	{
		System.out.println("\nBereite " + name);
		System.out.println("Werfe Teig ... ");
		System.out.println("Fuege Sosse hinzu ... ");
		System.out.println("Fuege Belaege hinzu ... ");
		for (int i = 0; i < belaege.size(); i++)
		{
			System.out.println("  " + belaege.get(i));
		}
	}
}
