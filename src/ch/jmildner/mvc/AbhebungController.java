package ch.jmildner.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class AbhebungController implements ActionListener
{
	protected Account myAccount;
	protected JTextField myTextField;


	public AbhebungController(JTextField tf, Account acc)
	{
		myAccount = acc;
		myTextField = tf;
		System.out.println("abhebung: konstruktor");
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		Amount amt1 = new Amount(myTextField.getText(), "Euro");
		Amount amt2 = myAccount.getBalance();
		myAccount.setBalance(amt2.minus(amt1));
		System.out.println("abhebung: " + myTextField.getText());
	}
}
