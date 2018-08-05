package ch.jmildner.decorator.ticket;

public class TestTicket
{
	static Ticket ticket;


	public static void main(String[] args)
	{
		test1("test1 nur body, ohne header/footer");
		test2("test2 mit header");
		test3("test3 mit footer");
		test4("test4 mit header/footer");
		test5("test5 mit header/footer");
	}


	static private void print(String x)
	{
		System.out.println("\n" + x);
		System.out
				.println("=================================================");
		ticket.print();
		System.out
				.println("=================================================");
		System.out.println("\n\n");
	}


	static private void test1(String x)
	{
		ticket = new Ticket("BENFICA LISSABON - REAL MADRID", 220);
		print(x);
	}


	static private void test2(String x)
	{
		ticket = new Ticket("AUSTRIA - RAPID", 180);
		ticket = new TicketHeader(ticket, 12433);
		print(x);
	}


	static private void test3(String x)
	{
		ticket = new Ticket("HOLLIDAY ON ICE", 350);
		ticket = new TicketFooter(ticket, 15933);
		print(x);
	}


	static private void test4(String x)
	{
		ticket = new Ticket("ROCKY HORROR PICTURE SHOW", 1200);
		ticket = new TicketHeader(ticket, 13911);
		ticket = new TicketFooter(ticket, 13911);
		print(x);
	}


	static private void test5(String x)
	{
		ticket = new Ticket("JEDERMANN", 900);
		ticket = new TicketHeader(ticket, 12344);
		ticket = new TicketFooter(ticket, 13911);
		print(x);
	}
}
