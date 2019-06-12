import java.awt.event.*;
import java.awt.*;


class frames1{

public static void main(String xyz[]){

	Frame F=new Frame("Calculation");
	Textfield T1,T2,T3;
	label L1,L2,L3;
	Button B1=new Button("=");
	L1=new label ("First no:");
	L2=new label ("Second no:");
	L3=new label ("Result");
	T1=new Textfield(10);
	T2=new Textfield(10);
	T3=new Textfield(10);
	FlowLayout FL=new FlowLayout();
	F.setLayout(FL);

	Ehandler E=new Ehandler(T1,T2,T3);
	B1.addActionListener(E);
	F.add(L1);
	F.add(T1);
	F.add(L2);
	F.add(T2);
	F.add(B1);
	F.add(L3);
	F.add(T3);
	F.setSize(600,600);
	F.setVisible(true);
}
}

class Ehandler implements ActionListener{

	textfield No1,No2, Result;

	public Ehandler(Textfield A, Textfield B, Textfield C){
		No1 =A;
		No2 =B;
		Result =C;}

	public void actionPerformed(ActionEvent X){

		int A,B,C;

		A=integer.parseInt(No1.getText());
		B=integer.parseInt(No2.getText());
		C=A+B;
		Result.setText(Integer.toString(C));
	}


	}