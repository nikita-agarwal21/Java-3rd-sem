package applet;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldDemo extends JFrame 
{
	private JLabel lblName;
	private JTextField txtName;
	public JTextFieldDemo()
	{
		setLayout(new FlowLayout());
		lblName=new JLabel("name");
		txtName=new JTextField(15);
		add(lblName);
		add(txtName);
		setTitle("jtext field demo");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new JTextFieldDemo();
	}
	

}
