package ch.jmildner.mvcs;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

public class ModelObserver implements Observer
{
	protected JTextField tfSaldo;


	public ModelObserver(JTextField tfSaldo)
	{
		this.tfSaldo = tfSaldo;
	}


	@Override
	public void update(Observable dummy, Object text)
	{
		System.out.println(((Model) dummy).getSaldo());
		String str = (String) text;
		tfSaldo.setText(str);
	}
}
