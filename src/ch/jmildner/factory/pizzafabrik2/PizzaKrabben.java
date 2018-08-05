package ch.jmildner.factory.pizzafabrik2;

/**
 * @author johann
 */
public class PizzaKrabben extends Pizza
{
	PizzaZutatenFabrik zutatenFabrik;


	public PizzaKrabben(PizzaZutatenFabrik zutatenFabrik)
	{
		this.zutatenFabrik = zutatenFabrik;
	}


	@Override
	void vorbereiten()
	{
		System.out.println("Mache " + name);
		teig = zutatenFabrik.erstelleTeig();
		sosse = zutatenFabrik.erstelleSosse();
		kaese = zutatenFabrik.erstelleKaese();
		krabben = zutatenFabrik.erstelleKrabben();
	}
}
