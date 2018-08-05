package ch.jmildner.decorator.auftrag;

public class TestAuftrag1
{
	static Auftrag1 auftrag;


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
		auftrag = new Auftrag1();
		print(x);
	}


	static private void test2(String x)
	{
		auftrag = new Auftrag1();
		auftrag = new AuftragHeader1(auftrag);
		print(x);
	}


	static private void test3(String x)
	{
		auftrag = new Auftrag1();
		auftrag = new AuftragFooter1(auftrag);
		print(x);
	}


	static private void test4(String x)
	{
		auftrag = new Auftrag1();
		auftrag = new AuftragFooter1(auftrag);
		auftrag = new AuftragHeader1(auftrag);
		print(x);
	}
}
