package applet;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo extends JFrame
{
	private JTree tree;
	private JLabel lbl;
	private DefaultMutableTreeNode top,a,b,a1,a2,b1,b2,b3;
	private JScrollPane sp;
	public JTreeDemo()
	{
		top=new DefaultMutableTreeNode("options");
		a=new DefaultMutableTreeNode("A");
		b=new DefaultMutableTreeNode("B");
		a1=new DefaultMutableTreeNode("A1");
		a2=new DefaultMutableTreeNode("A2");
		b1=new DefaultMutableTreeNode("B1");
		b2=new DefaultMutableTreeNode("B2");
		b3=new DefaultMutableTreeNode("B3");
	top.add(a);
	a.add(a1);
	a.add(a2);
	top.add(b);
	b.add(b1);
	b.add(b2);
	b.add(b3);
	tree=new JTree(top);
	sp=new JScrollPane(tree);
	lbl=new JLabel();
tree.addTreeSelectionListener(new TreeSelectionListener()
{
public void valueChanged(TreeSelectionEvent tse)
{
	lbl.setText("selection is"+tse.getPath());
}
});
	add(sp);
	add(lbl,BorderLayout.SOUTH);
	setTitle("jTreeDemo");
	setSize(500,600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}
	public static void main(String args[])
	{
		new JTreeDemo();
	}
}
