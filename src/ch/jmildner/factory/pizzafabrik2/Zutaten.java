package ch.jmildner.factory.pizzafabrik2;

/**
 * Zutaten
 * Interfaces und Implementierungen
 */

class Aubergine implements Gemuese
{
	@Override
	public String toString()
	{
		return "Aubergine";
	}
}



class FrischeKrabben implements Krabben
{
	@Override
	public String toString()
	{
		return "Frisch Nordsee-Krabben";
	}
}



class GefroreneKrabben implements Krabben
{
	@Override
	public String toString()
	{
		return "Gefrorene Groenland-Krabben";
	}
}



/**
 * Gemuese
 */
interface Gemuese
{
	@Override
	public String toString();
}



class ItalienischeSalami implements Salami
{
	@Override
	public String toString()
	{
		return "Italienische Salami";
	}
}



/**
 * Kaese
 */
interface Kaese
{
	@Override
	public String toString();
}



class Knoblauch implements Gemuese
{
	@Override
	public String toString()
	{
		return "Knoblauch";
	}
}



/**
 * Krabben
 */
interface Krabben
{
	@Override
	public String toString();
}



class MarinaraSosse implements Sosse
{
	@Override
	public String toString()
	{
		return "Marinara-Sosse";
	}
}



class Mozzarella implements Kaese
{

	@Override
	public String toString()
	{
		return "Mozzarella";
	}
}



class Paprika implements Gemuese
{
	@Override
	public String toString()
	{
		return "Paprika";
	}
}



class Parmesan implements Kaese
{
	@Override
	public String toString()
	{
		return "Parmesan";
	}
}



class Pilze implements Gemuese
{

	@Override
	public String toString()
	{
		return "Pilze";
	}
}



/**
 * Salami
 */
interface Salami
{
	@Override
	public String toString();
}



class SchwarzeOliven implements Gemuese
{

	@Override
	public String toString()
	{
		return "Schwarze Oliven";
	}
}



/**
 * Sosse
 */
interface Sosse
{
	@Override
	public String toString();
}



class SpanischeSalami implements Salami
{
	@Override
	public String toString()
	{
		return "Scharfe spanische Salami";
	}
}



class Spinat implements Gemuese
{
	@Override
	public String toString()
	{
		return "Spinat";
	}
}



/**
 * Teig
 */
interface Teig
{
	@Override
	public String toString();
}



class TeigMitDickerKruste implements Teig
{
	@Override
	public String toString()
	{
		return "Teig mit extra fester Kruste";
	}
}



class TeigMitDuennerKruste implements Teig
{
	@Override
	public String toString()
	{
		return "Teig mit duenner Kruste";
	}
}



/**
 * Thunfisch
 */
interface Thunfisch
{
	@Override
	public String toString();
}



class ThunfischStuecke implements Thunfisch
{
	@Override
	public String toString()
	{
		return "Feine Thunfischstuecke";
	}
}



class Tomatensosse implements Sosse
{
	@Override
	public String toString()
	{
		return "Tomatensosse";
	}
}



class Zwiebeln implements Gemuese
{
	@Override
	public String toString()
	{
		return "Zwiebeln";
	}
}
