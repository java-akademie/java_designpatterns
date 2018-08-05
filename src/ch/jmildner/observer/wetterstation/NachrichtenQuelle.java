package ch.jmildner.observer.wetterstation;

public interface NachrichtenQuelle
{
	public void anmelden(NachrichtenEmpfaenger empf);


	public void sendeNachricht(String nachricht);
}
