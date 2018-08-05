package ch.jmildner.singleton;

public class Singleton
{
	private static Singleton referenz = null;

	int i = 815;

	static
	{
		// referenz=new Singleton();
	}


	public static void ersterAufruf()
	{
		System.out.println("ersteraufruf");
	}


	public static Singleton getRef()
	{
		return referenz;
	}


	public static Singleton getReferenzSingleton()
	{
		if (referenz == null)
		{
			referenz = new Singleton();
			System.out.println("getReferenz");
		}
		System.out.println("GET REFERENZ");
		return referenz;
	}


	public static void main(String[] args)
	{
		new Singleton();
		new Singleton();
		new Singleton();
	}


	private Singleton()
	{
		System.out.println("konstruktor " + i);
		i = 2410;
	}
}
