package ch.jmildner.factory.pizzafabrik1;

abstract class Pizzeria
{
	public Pizza bestellePizza(String typ)
	{
		Pizza p = pizzaErstellen(typ);

		p.vorbereiten();
		p.backen();
		p.schneiden();
		p.einpacken();

		return p;
	}


	/**
	 * die Fabrik-Methode / Factory Method <code> pizzaErstellen </code>
	 * kuemmert sich um die Objekterstellung "Pizza" und kapselt sie in
	 * der Unterklasse - damit wird der Client-Code in der Superklasse
	 * vom Objekt-Erstellung-Code in der Unterklasse losgekoppelt.
	 */
	abstract Pizza pizzaErstellen(String typ);
}
