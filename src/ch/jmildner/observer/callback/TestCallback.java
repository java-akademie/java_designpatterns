package ch.jmildner.observer.callback;

import ch.jmildner.tools.MyTools;

class Callback
{
	WasZuTunIst testCallback = null;


	Callback(WasZuTunIst testCallback)
	{
		this.testCallback = testCallback;
		testCallback.fuehreAus();
	}
}



public class TestCallback
{
	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("--------");
		System.out.println("Callback");
		System.out.println("--------");

		// Callback d =
		new Callback(new WasZuTunIst()
		{
			@Override
			public void fuehreAus()
			{
				System.out
						.println("Message aus der Methode 'fuehreAus'");
			}
		});
		MyTools.pause();
	}
}



interface WasZuTunIst
{
	void fuehreAus();
}
