package ch.jmildner.elvis;

import java.util.List;
import java.util.Vector;

public class ElvisTest
{
	// ElvisManager em1 = ElvisManager.getInstance();

	public static void main(String[] args)
	{
		System.out.println("ElvisTest");
		new ElvisTest();
	}
	Elvis e1 = Elvis.getInstance(1);
	Elvis e2 = Elvis.getInstance(2);


	// ElvisManager em2 = ElvisManager.getInstance();

	Kuenstler e3 = Elvis.getInstance(3);


	public ElvisTest()
	{
		ElvisManager.getInstance();

		e1.singe();
		e2.singe();
		e3.singe();

		List<Elvis> l = new Vector<Elvis>();
		l.add(e2);
		Elvis e4 = l.get(0);
		System.out.println(111);
		e4.singe();

	}
}
