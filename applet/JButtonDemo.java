package applet;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JButtonDemo extends JFrame implements ActionListener
{
	private JLabel lblCountry;
	private JButton btnFrance,btnItaly,btnGermany,btnJapan;
	private ImageIcon imageFrance,imageItaly,imageGermany,imageJapan;
	public JButtonDemo()
	{
		setLayout(new FlowLayout());
		imageFrance=new ImageIcon("d:/temp/images/France.gif");
		btnFrance=new JButton(imageFrance);
		btnFrance.setActionCommand("FRANCE");
		btnFrance.addActionListener(this);
		
		imageItaly=new ImageIcon("d:/temp/images/Italy.gif");
		btnItaly=new JButton(imageItaly);
		btnItaly.setActionCommand("ITALY");
		btnItaly.addActionListener(this);
		
		imageFrance=new ImageIcon("d:/temp/images/Germany.gif");
		btnGermany=new JButton(imageGermany);
		btnGermany.setActionCommand("GERMANY");
		btnGermany.addActionListener(this);
		
		imageJapan=new ImageIcon("d:/temp/images/Japan.gif");
		btnJapan=new JButton(imageJapan);
		btnJapan.setActionCommand("JAPAN");
		btnJapan.addActionListener(this);
		
		lblCountry=new JLabel("choose a flag");
		add(btnFrance);
		add(btnItaly);
		add(btnGermany);
		add(btnJapan);
		add(lblCountry);
		setTitle("JButtonDemo");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		lblCountry.setText("you selected"+ae.getActionCommand());
	}
	public static void main(String args[])
	{
		new JButtonDemo();
	}
	

}
