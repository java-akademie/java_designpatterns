package ch.jmildner.mvcs;

import java.util.Observable;

import javax.swing.JTextField;

public class Model extends Observable
{
	private int saldo = 0;
	JTextField tfBetrag; // kommt aus GUI


	public Model(JTextField tfBetrag)
	{
		super();
		this.tfBetrag = tfBetrag;
	}


	public int getSaldo()
	{
		return saldo;
	}


	public void saldoErhoehen()
	{
		setSaldo(saldo + Integer.parseInt(tfBetrag.getText()));
	}


	public void saldoVermindern()
	{
		setSaldo(saldo - Integer.parseInt(tfBetrag.getText()));
	}


	public void setSaldo(int s)
	{
		if (saldo != s)
		{
			saldo = s;
			setChanged();
			notifyObservers(s + "");
		}
	}
}
