package ch.jmildner.mvc;

import java.util.Observable;

public class Account extends Observable
{
	private Amount balance;


	public Account()
	{
		super();
	}


	public Amount getBalance()
	{
		return balance;
	}


	public void setBalance(Amount newBalance)
	{
		balance = newBalance;
		// arg = balance;
		setChanged();
		notifyObservers(newBalance);
	}
}
