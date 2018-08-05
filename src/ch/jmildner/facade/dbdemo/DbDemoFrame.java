package ch.jmildner.facade.dbdemo;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DbDemoFrame
{
	public static void main(String[] args) throws Exception
	{
		new DbDemoFrame("Database Demonstration");
	}


	Frame frame;


	public DbDemoFrame(String str) throws Exception
	{
		frame = new Frame(str);
		frame.add(new DbDemoPanel());
		frame.setLocation(100, 300);
		frame.pack();
		frame.setVisible(true);
		addWindowAdapter();
	}


	private void addWindowAdapter()
	{
		class MyWindowAdapter extends WindowAdapter
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		}
		frame.addWindowListener(new MyWindowAdapter());
	}
}
