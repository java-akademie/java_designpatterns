package ch.jmildner.observer.verehrer;

import ch.jmildner.tools.MyTools;

public class Dame
{
	Verehrer verehrer = null;
	int zaehler = 0;


	void addVerehrer(Verehrer v)
	{
		this.verehrer = v;
	}


	void eventuellAnruf()
	{

		int lv = 0;
		while (lv != 3)
		{
			lv = MyTools.getInteger(
					"Anrufen=1, nicht Anrufen=2; Ende=3", 1, 3);
			if (verehrer != null)
			{
				if (lv == 1)
				{
					zaehler++;
					verehrer.anruf(zaehler);
				}
			}
		}
	}
}
