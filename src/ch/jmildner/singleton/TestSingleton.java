package ch.jmildner.singleton;

public class TestSingleton
{
	public static void main(String[] args)
	{
		Singleton.ersterAufruf();
		Singleton.ersterAufruf();
		Singleton.ersterAufruf();
		System.out.println("vor den aufrufen");
		System.out.println("vor den aufrufen");
		System.out.println("vor den aufrufen");

		Singleton s = Singleton.getReferenzSingleton();
		System.out.println(".... " + s);
		// Singleton t = Singleton.getReferenzSingleton();
		// if (s==t) System.out.println("gleich");
		Singleton.getReferenzSingleton();
	}
}
