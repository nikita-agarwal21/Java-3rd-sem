package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;

public class OneButton extends Applet
{
 private Button btnSubmit;
 @Override
 public void init()
 {
	 FlowLayout flowLayout=new FlowLayout();
	 setLayout(flowLayout);
	 btnSubmit=new Button("submit");
	 add(btnSubmit);
 }
 
}
