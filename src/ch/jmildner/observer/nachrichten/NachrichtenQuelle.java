package ch.jmildner.observer.nachrichten;

public interface NachrichtenQuelle
{
	public void addAbonnent(NachrichtenEmpfaenger empf);


	public void neueNachricht(String nachricht);
}
