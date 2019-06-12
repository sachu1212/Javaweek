import java.awt.event.*;
import java.awt.*;

class windows7frames1{
	public static void main(String xyz[]){

		Frame win=new Frame();
		Button B1=new Button ("Click1");
		
		Action1 E=new Action1();
		B1.addActionListener(E);

		win.add (B1,BorderLayout.NORTH);
		
		win.setSize(400,400);
		win.setVisible(true);
	}
}

class Action1 implements ActionListener{

	public void actionPerformed(ActionEvent X){
		System.out.println("hello my friends");
	}
}