package ch.jmildner.state.kaugummiautomat1;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class SwingFrame extends JFrame
{
	private static final long serialVersionUID = 1L;


	public static void main(String[] args)
	{
		new SwingFrame();
	}


	public SwingFrame()
	{
		super("Java-gestuetzter Kaugummi-Standautomat - Modell Nr. 2006");
		Container cont = getContentPane();
		cont.add(new SwingPanel());
		setLocation(100, 100);
		pack();
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}
