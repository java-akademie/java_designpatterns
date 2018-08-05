package ch.jmildner.proxy.kaugummiautomat;

import java.util.Random;

public class Tools
{
	static Random random = new Random(System.currentTimeMillis());


	public static int getZufallszahl(int i)
	{
		int gewinnzahl = random.nextInt(i);
		return gewinnzahl;
	}


	static void msg(String msg)
	{
		System.out.println(msg);
	}
}
