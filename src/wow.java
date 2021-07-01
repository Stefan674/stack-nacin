import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wow implements  ActionListener{

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1, num2, result;
    char operator;

    wow() {

        frame = new JFrame("Blalala");
        frame.setLayout(null);
        frame.setSize(420, 550);

    }

    public static void main(String[] args) {

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
