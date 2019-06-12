import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window8 {

    public static void main(String[] args) {
        Frame f = new Frame("Calculation");
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        TextField t3= new TextField(10);
        Button b1 = new Button("+");
        Button b2 = new Button("-");
        Button b3 = new Button("x");
        Button b4 = new Button("/");
        Label l1 = new Label("First no:");
        Label l2 = new Label("Second no:");
        Label l3 = new Label("Result:");
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);
        Ehandler e1 = new Ehandler(t1, t2, t3);
        b1.addActionListener(e1);
        b2.addActionListener(e1);
        b3.addActionListener(e1);
        b4.addActionListener(e1);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(l3);
        f.add(t3);
        f.setVisible(true);
        f.setSize(800,100);
    }

}

class Ehandler implements ActionListener{

    TextField t1, t2, t3;

    public Ehandler(TextField a, TextField b, TextField c){
        t1 = a;
        t2 = b;
        t3 = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button btn = (Button)e.getSource();
        String sign = btn.getLabel();
        double d1 = Double.parseDouble(t1.getText());
        double d2 = Double.parseDouble(t2.getText());
        switch (sign){
            case "+":
                t3.setText((d1+d2)+"");
                break;
            case "-":
                t3.setText((d1-d2)+"");
                break;
            case "/":
                t3.setText((d1/d2)+"");
                break;
            case "*":
                t3.setText((d1*d2)+"");
                break;
        }
    }
}