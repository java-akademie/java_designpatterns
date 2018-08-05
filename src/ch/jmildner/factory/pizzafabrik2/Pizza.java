package ch.jmildner.factory.pizzafabrik2;

/**
 * @author johann
 */
public abstract class Pizza
{
	String name;

	/**
	 * Zutaten
	 */
	Teig teig;
	Sosse sosse;
	Gemuese gemuese[];
	Salami salami;
	Kaese kaese;
	Thunfisch thunfisch;
	Krabben krabben;


	void backen()
	{
		System.out.println("Backe 25 Minuten bei 350");
	}


	/**
	 * @return Returns the name.
	 * @uml.property name="name"
	 */
	String getName()
	{
		return name;
	}


	void schneiden()
	{
		System.out.println("Schneide die Pizza diagonal in Stücke");
	}


	/**
	 * @param name
	 *            The name to set.
	 * @uml.property name="name"
	 */
	void setName(String name)
	{
		this.name = name;
	}


	@Override
	public String toString()
	{
		StringBuffer ergebnis = new StringBuffer();

		ergebnis.append("---- " + name + " ----\n");

		if (teig != null)
		{
			ergebnis.append(teig + "\n");
		}

		if (sosse != null)
		{
			ergebnis.append(sosse + "\n");
		}

		if (kaese != null)
		{
			ergebnis.append(kaese + "\n");
		}

		if (salami != null)
		{
			ergebnis.append(salami + "\n");
		}

		if (krabben != null)
		{
			ergebnis.append(krabben + "\n");
		}

		if (thunfisch != null)
		{
			ergebnis.append(thunfisch + "\n");
		}

		if (gemuese != null)
		{
			for (int i = 0; i < gemuese.length; i++)
			{
				ergebnis.append(gemuese[i]);

				if (i < gemuese.length - 1)
				{
					ergebnis.append(", ");
				}
			}

			ergebnis.append("\n");
		}

		return ergebnis.toString();
	}


	void verpacken()
	{
		System.out
				.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
	}


	abstract void vorbereiten();
}
