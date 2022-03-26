package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoubleIncrement extends Applet//using inner class
{
	private Button btnDouble;
	private Label lblNumber;
	private int count;
	@Override
	public void init()
	{
		count=1;
		setLayout(new FlowLayout());
		btnDouble=new Button("double");
		//btnDouble.add ActionListener(new MyDouble());
		lblNumber=new Label(""+count);
		add(lblNumber);
		add(btnDouble);
		}
	class MyDouble implements ActionListener
	{
		public void ActionPerformed(ActionEvent ae)
		{
			count*=2;
			lblNumber.setText(""+count);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
