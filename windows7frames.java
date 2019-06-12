import java.awt.*;

class windows7frames{
	public static void main(String xyz[]){

		Frame win=new Frame();
		Button B1=new Button ("Click1");
		Button B2=new Button ("Click2");
		Button B3=new Button ("Click3");
		Button B4=new Button ("Click4");
		Button B5=new Button ("Click5");
		win.add (B1,BorderLayout.NORTH);
		win.add (B2,BorderLayout.EAST);
		win.add (B3,BorderLayout.SOUTH);
		win.add (B4,BorderLayout.WEST);
		win.add (B5,BorderLayout.CENTER);
		win.setSize(800,800);
		win.setVisible(true);
	}
}