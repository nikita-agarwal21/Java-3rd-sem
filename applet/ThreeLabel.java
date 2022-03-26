package applet;

import java.applet.Applet;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

public class ThreeLabel extends Applet
{
	private TextField txtName;
	private TextField txtAge;
	private TextField txtGender;
	private Label lblName;
	private Label lblAge;
	private Label lblGender;
	@Override
	public void init()
	{
		 FlowLayout flowLayout=new FlowLayout();
		 setLayout(flowLayout);
		 lblName=new Label("name:");
		 lblAge=new Label("age:");
		 lblGender=new Label("gender:");
		 txtName=new TextField(20);
		 txtAge=new TextField(10);
		 txtGender=new TextField(10);
		 add(lblName);
		 add(txtName);
		 add(lblAge);
		 add(txtAge);
		 add(lblGender);
		 add(txtGender);
	}
	
}
