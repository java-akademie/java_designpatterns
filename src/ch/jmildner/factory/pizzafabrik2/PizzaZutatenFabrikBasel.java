package ch.jmildner.factory.pizzafabrik2;

public class PizzaZutatenFabrikBasel implements PizzaZutatenFabrik
{

	@Override
	public Gemuese[] erstelleGemuese()
	{
		Gemuese gemuese[] = { new Knoblauch(), new Zwiebeln(),
				new Pilze(), new Paprika() };

		return gemuese;
	}


	@Override
	public Kaese erstelleKaese()
	{
		return new Parmesan();
	}


	@Override
	public Krabben erstelleKrabben()
	{
		return new FrischeKrabben();
	}


	@Override
	public Salami erstelleSalami()
	{
		return new SpanischeSalami();
	}


	@Override
	public Sosse erstelleSosse()
	{
		return new MarinaraSosse();
	}


	@Override
	public Teig erstelleTeig()
	{
		return new TeigMitDuennerKruste();
	}


	@Override
	public Thunfisch erstelleThunfisch()
	{
		return new ThunfischStuecke();
	}

}
