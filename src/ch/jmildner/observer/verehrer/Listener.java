package ch.jmildner.observer.verehrer;

import ch.jmildner.tools.MyTools;

class Dame2
{
	VerehrerS verehrerS = null;
	VerehrerK verehrerK = null;
	int zaehler = 0;


	void addVerehrerK(VerehrerK v)
	{
		this.verehrerS = null;
		this.verehrerK = v;
	}


	void addVerehrerS(VerehrerS v)
	{
		this.verehrerS = v;
		this.verehrerK = null;
	}


	void eventuellAnruf()
	{
		int lv = 0;
		while (lv != 3)
		{
			lv = MyTools.getInteger(
					"Anrufen=1, nicht Anrufen=2; Ende=3", 1, 3);
			if (verehrerK != null)
			{
				if (lv == 1)
				{
					zaehler++;
					verehrerK.anruf(zaehler);
				}
			}
			if (verehrerS != null)
			{
				if (lv == 1)
				{
					zaehler++;
					verehrerS.anruf(zaehler);
				}
			}
		}
	}
}



public class Listener
{
	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("--------");
		System.out.println("Listener");
		System.out.println("--------");
		Dame2 d = new Dame2();
		d.addVerehrerS(new VerehrerS()
		{
			@Override
			public void anruf(int z)
			{
				System.out.println("hurra, der " + z
						+ ". anruf ... Schnittstelle");
			}
		});
		d.eventuellAnruf();
		d.addVerehrerK(new VerehrerK(4711)
		{
			int x = 888;
			{
				System.out.println("ueberschr.konstruktor " + (x + 2));
			}
		});
		d.eventuellAnruf();
		MyTools.pause();
	}
}



class VerehrerK
{
	VerehrerK()
	{
		System.out.println("konstruktor verehrer-klasse ");
	}


	VerehrerK(int x)
	{
		System.out.println("konstruktor verehrer-klasse " + x);
	}


	void anruf(int z)
	{
		System.out.println("hurra, der " + z + ". anruf ... Klasse");
	}
}



interface VerehrerS
{
	void anruf(int z);
}
