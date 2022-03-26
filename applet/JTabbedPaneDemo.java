package applet;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import pgm1.E;

public class JTabbedPaneDemo extends JFrame
{
	private JTabbedPane tp;
	public JTabbedPaneDemo()
	{
		tp=new JTabbedPane();
		tp.addTab("cities", new CitiesPanel());
		tp.addTab("colour", new ColourPanel());
		tp.addTab("flavour",new FlavourPanel());
		add(tp);
		setTitle("jtabbed pane demo");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
public static void main(String args[])
{
	new JTabbedPaneDemo();
}
}
class CitiesPanel extends JPanel
{
	private JButton btn1,btn2,btn3;
	public CitiesPanel()
	{
		btn1=new JButton("bangalore");
		btn2=new JButton("jaipur");
		btn3=new JButton("nohar");
		add(btn1);
		add(btn2);
		add(btn3);
	}
}
class ColourPanel extends JPanel
{
private JCheckBox cb1,cb2;
public ColourPanel()
{
	cb1=new JCheckBox("black");
	cb2=new JCheckBox("blue");
	add(cb1);
	add(cb2);
}
}
class FlavourPanel extends JPanel
{
private JComboBox cb;
public FlavourPanel()
{
	cb=new JComboBox();
	cb.addItem("black current");
	cb.addItem("butterscotch");
	cb.addItem("vanilla");
	add(cb);
}
}

