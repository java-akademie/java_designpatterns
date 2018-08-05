package ch.jmildner.mvcs;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class ViewFrame extends JFrame
{
	private static final long serialVersionUID = 1L;


	public static void main(String[] args)
	{
		new ViewFrame();
	}


	public ViewFrame()
	{
		super("mvc");
		Container cont = getContentPane();
		cont.add(new ViewPanel());
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
