package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;

public class ThreeButton extends Applet 
{
 private Button btnFirst;
 private Button btnSecond;
 private Button btnThird;
 @Override
 public void init()
 {
	 FlowLayout flowLayout=new FlowLayout();
	 setLayout(flowLayout);
	 btnFirst=new Button("first");
	 btnSecond=new Button("second");
	 btnThird=new Button("third");
	 add(btnFirst);
	 add(btnSecond);
	 add(btnThird);
 }
}
