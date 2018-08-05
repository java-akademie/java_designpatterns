package ch.jmildner.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class EinzahlungController implements ActionListener
{
	protected Account myAccount;
	protected JTextField myTextField;


	public EinzahlungController(JTextField tf, Account acc)
	{
		myAccount = acc;
		myTextField = tf;
		System.out.println("einzahlung: konstruktor");
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		Amount amt1 = new Amount(myTextField.getText(), "Euro");
		Amount amt2 = myAccount.getBalance();
		myAccount.setBalance(amt2.plus(amt1));
		System.out.println("einzahlung: " + myTextField.getText());
	}
}
