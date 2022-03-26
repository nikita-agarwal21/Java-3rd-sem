package applet;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingIncrementer2 extends JFrame //using adapter class
{
	private JButton btnClick;
	private JLabel lblCount;
	private int n;
	public  SwingIncrementer2()
	{
		btnClick=new JButton("click");
		lblCount=new JLabel("0");
		setLayout(new FlowLayout());
		add(btnClick);
		add(lblCount);
		btnClick.addMouseListener(new MyIncrement());
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	class MyIncrement extends MouseAdapter
	{
		@Override
		public void mouseEntered(MouseEvent e)
		
		{
			String s=lblCount.getText();
			n=Integer.parseInt(s);
			n++;
			lblCount.setText(""+n);
		}
	}
	public static void main(String args[])
	{
		new SwingIncrementer2();
	}

}
