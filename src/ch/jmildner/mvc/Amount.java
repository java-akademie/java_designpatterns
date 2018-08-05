package ch.jmildner.mvc;

public class Amount
{
	private int euro;
	private int cent;
	private int sign;
	private String currency;


	public Amount(int e, int c, int s, String cu)
	{
		int cents = 100 * e + c;
		euro = cents / 100;
		cent = cents % 100;
		;
		sign = s;
		currency = cu;
	}


	public Amount(String a, String cu)
	{
		Integer ic, ie;
		currency = cu;
		int i = a.indexOf('.');
		if (i != -1)
		{
			if (a.charAt(0) == '-')
			{
				sign = -1;
				ie = new Integer(a.substring(1, i));
			}
			else
			{
				sign = 1;
				ie = new Integer(a.substring(0, i));
			}
			String s = (a + "00").substring(i + 1, i + 3);
			ic = new Integer(a.substring(i + 1, i + 3));
			euro = ie.intValue();
			cent = ic.intValue();
			if (s.substring(1, 2).equals("0"))
			{
				cent = cent / 10;
			}
		}
		else
		{
			if (a.charAt(0) == '-')
			{
				sign = -1;
				ie = new Integer(a.substring(1));
			}
			else
			{
				sign = 1;
				ie = new Integer(a.substring(0));
			}
			euro = ie.intValue();
			cent = 0;
		}
	}


	protected Amount centsToAmount(int cents)
	{
		int e, c, s;
		if (cents >= 0)
		{
			c = cents;
			s = 1;
		}
		else
		{
			c = -cents;
			s = -1;
		}
		e = c / 100;
		c = c % 100;
		return new Amount(e, c, s, currency);
	}


	public Amount convertCurrency(String cu)
	{
		Amount result = times(1);
		return result;
	}


	public String getCurrency()
	{
		return currency;
	}


	public Amount minus(Amount other)
	{
		Amount a;
		if (other.getCurrency().equals(currency))
		{
			a = other;
		}
		else
		{
			a = other.convertCurrency(currency);
		}
		int p1 = sign * (100 * euro + cent);
		int p2 = a.sign * (100 * a.euro + a.cent);
		return centsToAmount(p1 - p2);
	}


	public Amount plus(Amount other)
	{
		Amount a;
		if (other.getCurrency().equals(currency))
		{
			a = other;
		}
		else
		{
			a = other.convertCurrency(currency);
		}
		int p1 = sign * (100 * euro + cent);
		int p2 = a.sign * (100 * a.euro + a.cent);
		return centsToAmount(p1 + p2);
	}


	public void setCurrency(String cu)
	{
		currency = cu;
	}


	public Amount times(float factor)
	{
		int p = sign * (100 * euro + cent);
		return centsToAmount(Math.round(p * factor));
	}


	@Override
	public String toString()
	{
		String c;
		if (cent < 1)
		{
			c = "00";
		}
		else
		{
			if (cent < 10)
			{
				c = "0" + cent;
			}
			else
			{
				c = "" + cent;
			}
		}
		if (sign >= 0)
		{
			return " " + euro + "." + c + " " + currency;
		}
		else
		{
			return "-" + euro + "." + c + " " + currency;
		}
	}
}
