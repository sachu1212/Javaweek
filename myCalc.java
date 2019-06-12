import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myCalc {
    public static void main(String[] args) {
        Frame calcFrame = new Frame();
        TextField display = new TextField(25);
        CalcEhandler handler = new CalcEhandler(display);
        String[] buttonLabels = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "x", "/", "=", "C"};
        Button[] buttonArr = new Button[16];
        GridLayout g = new GridLayout(4,4);
        Panel buttons = new Panel();
        Panel displayPanel = new Panel();
        buttons.setLayout(g);
        displayPanel.add(display);
        for (int i = 0 ; i < 16 ; i++){
            buttonArr[i] = new Button(buttonLabels[i]);
            buttonArr[i].addActionListener(handler);
            buttonArr[i].setFont(new Font("Ariel",Font.BOLD,80));
            buttons.add(buttonArr[i]);
        }
        calcFrame.add(displayPanel,BorderLayout.NORTH);
        calcFrame.add(buttons,BorderLayout.CENTER);
        calcFrame.setSize(600,600);
        calcFrame.setVisible(true);
    }
}


class CalcEhandler implements ActionListener{

    Double answer;
    String operation;
    TextField resultField;

    public CalcEhandler(TextField resultField){
        this.resultField = resultField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonLabel = ((Button)e.getSource()).getLabel();
        switch (buttonLabel){
            case "0":
                zero(); break;
            case "1":
                one(); break;
            case "2":
                two();  break;
            case "3":
                three(); break;
            case "4":
                four(); break;
            case "5":
                five(); break;
            case "6":
                six(); break;
            case "7":
                seven(); break;
            case "8":
                eight(); break;
            case "9":
                nine(); break;
            case "+":
                add(); break;
            case "-":
                minus(); break;
            case "x":
                multiply(); break;
            case "/":
                divide(); break;
            case "=":
                equals(); break;
            case "C":
                clear();
        }
    }

    private void zero(){
        if (!resultField.getText().equals("")) {
            setResultField("0");
        }
    }

    private void one(){
        setResultField("1");
    }

    private void two(){
        setResultField("2");
    }

    private void three(){
        setResultField("3");
    }

    private void four(){
        setResultField("4");
    }

    private  void five(){
        setResultField("5");
    }

    private void six(){
        setResultField("6");
    }

    private void seven(){
        setResultField("7");
    }

    private void eight(){
        setResultField("8");
    }

    private void nine(){
        setResultField("9");
    }

    private void add(){
        execute();
        operation = "+";
    }

    private void minus(){
        execute();
        operation = "-";
    }

    private void multiply(){
        execute();
        operation = "x";
    }

    private void divide(){
        execute();
        operation = "/";
    }

    private void equals(){
        execute();
        operation="";
        resultField.setText(""+answer);
        answer = null;
    }

    private void clear(){
        resultField.setText("");
        operation = "";
    }

    private Double getNum(){
        try {
            Double result = Double.parseDouble("" + resultField.getText());
            resultField.setText("");
            return result;
        } catch (Exception e){
            resultField.setText("");
            return 0D;
        }
    }

    private void setResultField(String thingToDisplay){
        resultField.setText(resultField.getText()+thingToDisplay);
    }

    private void execute(){
        if (operation==null || operation.equals("")){
            answer = getNum();
            getNum();
        } else {
            switch (operation){
                case "+":
                    answer = answer + getNum();
                    resultField.setText("");
                    break;
                case "-":
                    answer = answer - getNum();
                    resultField.setText("");
                    break;
                case "x":
                    answer = answer * getNum();
                    resultField.setText("");
                    break;
                case "/":
                    answer = answer / Double.parseDouble(""+resultField.getText());
                    resultField.setText("");
            }
        }
    }
}