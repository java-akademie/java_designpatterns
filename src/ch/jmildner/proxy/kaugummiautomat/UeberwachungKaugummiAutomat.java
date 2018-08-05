package ch.jmildner.proxy.kaugummiautomat;

import java.rmi.Naming;

import ch.jmildner.tools.MyTools;

public class UeberwachungKaugummiAutomat
{

	public static void main(String[] args) throws Exception
	{
		KaugummiAutomatRemote ka1;

		ka1 = (KaugummiAutomatRemote) Naming
				.lookup("rmi://localhost/zhhbf");

		// ka1 = new KaugummiAutomat("", 5);

		System.out.println("");
		System.out.println("-----------------------------------");
		System.out.println("Ueberwachung eines Kaugummiautomats");
		System.out.println("-----------------------------------");

		for (int i = 1; i < 100; i++)
		{
			MyTools.sleep(1000);
			System.out.println(ka1.getBericht());
		}
	}

}
