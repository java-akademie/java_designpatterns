package ch.jmildner.mvcs;

import java.awt.Container;

import javax.swing.JApplet;

public class ViewApplet extends JApplet
{
	private static final long serialVersionUID = 1L;


	@Override
	public void init()
	{
		Container cont = getContentPane();
		cont.add(new ViewPanel());
	}
}
