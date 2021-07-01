import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class trening2 implements ActionListener {

    double num1=0,num2=0,result=0;
    char operacija;
    JFrame frame;
    JPanel panel;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButton = new JButton[9];

    Font font = new Font(Font.SANS_SERIF,Font.BOLD, 30);

    JButton addButton,subButton,mulButton,divButton,decButton,negButton,equButton,delButton,clrButton;

    trening2() {

        frame = new JFrame("kalki");
        frame.setSize(400,600);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4,4,5,5));
        panel.setBounds(40,120,300,300);


        textfield = new JTextField();
        textfield.setEditable(false);
        textfield.setBounds(40,40,300,50);
        textfield.setFont(font);

        functionButton[0] = new JButton("+");
        functionButton[1] = new JButton("-");
        functionButton[2] = new JButton("*");
        functionButton[3] = new JButton("/");
        functionButton[4] = new JButton(".");
        functionButton[5] = new JButton("(-)");
        functionButton[6] = new JButton("=");
        functionButton[7] = new JButton("del");
        functionButton[8] = new JButton("clr");

        addButton = functionButton[0];
        subButton = functionButton[1];
        mulButton = functionButton[2];
        divButton = functionButton[3];
        decButton = functionButton[4];
        negButton = functionButton[5];
        equButton = functionButton[6];
        delButton = functionButton[7];
        clrButton = functionButton[8];


        for(int i=0;i<10;i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setFont(font);
        }

        for(int i=0;i<9;i++) {
            functionButton[i].addActionListener(this);
            functionButton[i].setFocusable(false);
            functionButton[i].setFont(font);
        }

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(divButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(mulButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(subButton);
        panel.add(numberButtons[0]);
        panel.add(decButton);
        panel.add(addButton);
        panel.add(equButton);

        negButton.setBounds(40,450,100,60);
        clrButton.setBounds(140,450,100,60);
        delButton.setBounds(240,450,100,60);


        frame.add(negButton);
        frame.add(clrButton);
        frame.add(delButton);

        frame.add(textfield);
        frame.add(panel);
        frame.setVisible(true);
    }




    public static void main(String[] args) {

        trening2 kalku = new trening2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<10;i++) {
            if(e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }

        if(e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operacija = '+';
            textfield.setText("");
        }

        if(e.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operacija = '-';
            textfield.setText("");
        }

        if(e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operacija = '*';
            textfield.setText("");
        }

        if(e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operacija = '/';
            textfield.setText("");
        }

        if(e.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());

            switch (operacija) {
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
        }

        if(e.getSource() == negButton) {
            double trenutniBroj = Double.parseDouble(textfield.getText());
            trenutniBroj *= -1;
            textfield.setText(String.valueOf(trenutniBroj));
        }

        if(e.getSource() == clrButton) {
            textfield.setText("");
            num1 = 0;
            num2 = 0;
        }

        if(e.getSource() == delButton) {
            String string = textfield.getText();
            textfield.setText("");
            for(int i=0;i<string.length()-1;i++) {
                textfield.setText(textfield.getText()+string.charAt(i));
            }
        }

        if(e.getSource() == decButton) {
            if(!textfield.getText().contains(".")) {
                textfield.setText(textfield.getText().concat("."));
            }
        }

    }
}
