package applet;

import java.applet.Applet;
import java.awt.Graphics;

public class SecondApplet extends Applet
{
	@Override
	public void init()
	{
		System.out.println("init()...");
	
	}
	public void start()
	{
		System.out.println("start()...");
	}
	public void stop()
	{
		System.out.println("stop()...");
	}
	public void destroy()
	{
		System.out.println("destroy()...");
	}
	public void paint(Graphics g)
	{
		System.out.println("paint()...");
	}
}
