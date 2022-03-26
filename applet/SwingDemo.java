package applet;

import javax.swing.JFrame;

public class SwingDemo extends JFrame
{
	public SwingDemo()
	{
		setTitle("Swing demo");
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new SwingDemo();
	}

}
