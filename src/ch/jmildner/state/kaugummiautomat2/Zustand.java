package ch.jmildner.state.kaugummiautomat2;

public interface Zustand
{
	String auffuellen(int anzahl);


	String griffDrehen();


	String kugelAusgeben();


	String muenzeAuswerfen();


	String muenzeEinwerfen();
}
