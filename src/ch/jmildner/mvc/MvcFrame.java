package ch.jmildner.mvc;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MvcFrame extends JFrame
{
	private static final long serialVersionUID = 1L;


	public static void main(String[] args)
	{
		new MvcFrame();
	}


	public MvcFrame()
	{
		super("mvc");
		Container cont = getContentPane();
		cont.add(new MvcPanel());
		setLocation(200, 100);
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
