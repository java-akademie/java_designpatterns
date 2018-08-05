package ch.jmildner.decorator.auftrag;

public class TestAuftrag2
{
	static Auftrag2Interface auftrag;


	public static void main(String[] args)
	{
		test1("test1 nur body, ohne header/footer");
		test2("test2 mit header");
		test3("test3 mit footer");
		test4("test4 mit header/footer");
	}


	static private void print(String x)
	{
		System.out.println("\n" + x);
		System.out.println("-----------------------------------------");
		auftrag.print();
		System.out.println("-----------------------------------------");
		System.out.println("\n\n");
	}


	static private void test1(String x)
	{
		auftrag = new Auftrag2();
		print(x);
	}


	static private void test2(String x)
	{
		auftrag = new Auftrag2();
		auftrag = new AuftragHeader2(auftrag);
		print(x);
	}


	static private void test3(String x)
	{
		auftrag = new Auftrag2();
		auftrag = new AuftragFooter2(auftrag);
		print(x);
	}


	static private void test4(String x)
	{
		auftrag = new Auftrag2();
		auftrag = new AuftragFooter2(auftrag);
		auftrag = new AuftragHeader2(auftrag);
		print(x);
	}
}
