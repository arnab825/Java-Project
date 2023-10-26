package Calculation;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Framework extends JFrame implements ActionListener {
    private JLabel label; // label is used to fully layout the ineterface the color
    private JTextField textField; // textField declaration
    private double number, answer;
    private int calculation;

    private JRadioButton onRadioButton; //  radio button declaration
    private JRadioButton offRadioButton; // radio button declaration
    private JButton buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven,
            buttonEight, buttonNine, buttonDot, buttonClear, buttonDelete, buttonEqual, buttonMul, buttonDiv,
            buttonPlus, buttonMinus, buttonSquare, buttonReciprocal, buttonSqrt;//it creates a button with specified text and object
    public Framework() {
        ImageIcon i1 = new ImageIcon(
                "C:\\Users\\Arnab Roy\\OneDrive\\Desktop\\Java Project\\Calculator App\\src\\media file\\calculator_7805763.png");
        this.setIconImage(i1.getImage());

        label = new JLabel();
        textField = new JTextField();
        onRadioButton = new JRadioButton("on");
        offRadioButton = new JRadioButton("off");
        buttonZero = new JButton("0");
        buttonOne = new JButton("1");
        buttonTwo = new JButton("2");
        buttonThree = new JButton("3");
        buttonFour = new JButton("4");
        buttonFive = new JButton("5");
        buttonSix = new JButton("6");
        buttonSeven = new JButton("7");
        buttonEight = new JButton("8");
        buttonNine = new JButton("9");
        buttonDot = new JButton(".");
        buttonClear = new JButton("C");
        buttonDelete = new JButton("DEL");
        buttonEqual = new JButton("=");
        buttonMul = new JButton("x");
        buttonDiv = new JButton("/");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonSquare = new JButton("x\u00B2");
        buttonReciprocal = new JButton("1/x");
        buttonSqrt = new JButton("\u221A");

        this.setTitle("Calculator");
        this.setSize(300, 490);
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(Color.green);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        addComponents();
        addActionEvent();
      
    }

    // Method to add all the components like the numbers and symbols of all the
    // operations to the GUI
    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.black);
        this.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(textField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        this.getContentPane().setBackground(Color.yellow);
        onRadioButton.setForeground(Color.black);
        this.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(true);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        this.getContentPane().setBackground(Color.yellow);
        offRadioButton.setForeground(Color.black);
        this.add(offRadioButton);

        // ButtonGroup is used to kind of the radio button to show the selected at a
        // time
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        buttonSeven.setForeground(Color.black);
        this.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        buttonEight.setForeground(Color.black);
        this.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        buttonNine.setForeground(Color.black);
        this.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        buttonFour.setForeground(Color.black);
        this.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        buttonFive.setForeground(Color.black);
        this.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        buttonSix.setForeground(Color.black);
        this.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        buttonOne.setForeground(Color.black);
        this.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        buttonTwo.setForeground(Color.black);
        this.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        buttonThree.setForeground(Color.black);
        this.add(buttonThree);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        buttonDot.setForeground(Color.black);
        this.add(buttonDot);

        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        buttonZero.setForeground(Color.black);
        this.add(buttonZero);

        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        this.add(buttonEqual);

        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        this.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        this.getContentPane().setBackground(Color.blue);
        this.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        this.add(buttonMul);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        this.add(buttonMinus);

        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        this.add(buttonPlus);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        this.getContentPane().setBackground(Color.blue);
        this.add(buttonSquare);

        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        this.getContentPane().setBackground(Color.blue);
        this.add(buttonReciprocal);

        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        this.getContentPane().setBackground(Color.pink);
        buttonDelete.setForeground(Color.red);
        this.add(buttonDelete);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        this.getContentPane().setBackground(Color.pink);
        buttonClear.setForeground(Color.red);
        this.add(buttonClear);

    }

    // Method to add all the action listeners to the buttons
    public void addActionEvent() {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }

    // Method to add all the key listeners to the buttons and the this
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        // If the on radio button is selected, the calculator is enabled
        if (source == onRadioButton) {
            enable();
        }
        // If the off radio button is selected, the calculator is disabled
        else if (source == offRadioButton) {
            disable();
        }
        // If the clear button is pressed, the text field is cleared
        else if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        }
        // If the delete button is pressed, the last character is deleted
        else if (source == buttonDelete) {
            int length = textField.getText().length(); // Get the length of the text field
            int number = length - 1; // Get the number of characters to delete

            if (length > 0) { // If the length is greater than 0, delete the last character
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) { // If the text field is empty, set the label to 0
                label.setText("");
            }
        } else if (source == buttonZero) { // If the zero button is pressed, add a zero to the text field
            if (textField.getText().equals("0")) { // If the text field is 0, do nothing
                return;
            } else { // If the text field is not empty, add a zero to the text field
                textField.setText(textField.getText() + "0");
            }
        }
        // If the one button is pressed, add a one to the text field and so on for all
        // the other buttons
        else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) { // If the text field contains a dot, do nothing
                return;
            } else {
                textField.setText(textField.getText() + "."); // If the text field does not contain a dot, add a dot
            }

        }
        // If the plus button is pressed, add a plus to the text field and so on for all
        // the buttons
        else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));

        } else if (source == buttonSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonEqual) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;

            }
        }

    }

    // method to enable the calculator
    public void enable() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);

    }

    // method to disable the calculator
    public void disable() {
        onRadioButton.setEnabled(true); // Enable the "on" radio button
        offRadioButton.setEnabled(false); // Disable the "off" radio button
        textField.setText(""); // Clear the text field
        label.setText("");
        textField.setEnabled(true); // Clear the label
        // Disable the calculator buttons
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public int getCalculation() {
        return calculation;
    }

    public void setCalculation(int calculation) {
        this.calculation = calculation;
    }

    public JRadioButton getOnRadioButton() {
        return onRadioButton;
    }

    public void setOnRadioButton(JRadioButton onRadioButton) {
        this.onRadioButton = onRadioButton;
    }

    public JRadioButton getOffRadioButton() {
        return offRadioButton;
    }

    public void setOffRadioButton(JRadioButton offRadioButton) {
        this.offRadioButton = offRadioButton;
    }

    public JButton getButtonZero() {
        return buttonZero;
    }

    public void setButtonZero(JButton buttonZero) {
        this.buttonZero = buttonZero;
    }

    public JButton getButtonOne() {
        return buttonOne;
    }

    public void setButtonOne(JButton buttonOne) {
        this.buttonOne = buttonOne;
    }

    public JButton getButtonTwo() {
        return buttonTwo;
    }

    public void setButtonTwo(JButton buttonTwo) {
        this.buttonTwo = buttonTwo;
    }

    public JButton getButtonThree() {
        return buttonThree;
    }

    public void setButtonThree(JButton buttonThree) {
        this.buttonThree = buttonThree;
    }

    public JButton getButtonFour() {
        return buttonFour;
    }

    public void setButtonFour(JButton buttonFour) {
        this.buttonFour = buttonFour;
    }

    public JButton getButtonFive() {
        return buttonFive;
    }

    public void setButtonFive(JButton buttonFive) {
        this.buttonFive = buttonFive;
    }

    public JButton getButtonSix() {
        return buttonSix;
    }

    public void setButtonSix(JButton buttonSix) {
        this.buttonSix = buttonSix;
    }

    public JButton getButtonSeven() {
        return buttonSeven;
    }

    public void setButtonSeven(JButton buttonSeven) {
        this.buttonSeven = buttonSeven;
    }

    public JButton getButtonEight() {
        return buttonEight;
    }

    public void setButtonEight(JButton buttonEight) {
        this.buttonEight = buttonEight;
    }

    public JButton getButtonNine() {
        return buttonNine;
    }

    public void setButtonNine(JButton buttonNine) {
        this.buttonNine = buttonNine;
    }

    public JButton getButtonDot() {
        return buttonDot;
    }

    public void setButtonDot(JButton buttonDot) {
        this.buttonDot = buttonDot;
    }

    public JButton getButtonClear() {
        return buttonClear;
    }

    public void setButtonClear(JButton buttonClear) {
        this.buttonClear = buttonClear;
    }

    public JButton getButtonDelete() {
        return buttonDelete;
    }

    public void setButtonDelete(JButton buttonDelete) {
        this.buttonDelete = buttonDelete;
    }

    public JButton getButtonEqual() {
        return buttonEqual;
    }

    public void setButtonEqual(JButton buttonEqual) {
        this.buttonEqual = buttonEqual;
    }

    public JButton getButtonMul() {
        return buttonMul;
    }

    public void setButtonMul(JButton buttonMul) {
        this.buttonMul = buttonMul;
    }

    public JButton getButtonDiv() {
        return buttonDiv;
    }

    public void setButtonDiv(JButton buttonDiv) {
        this.buttonDiv = buttonDiv;
    }

    public JButton getButtonPlus() {
        return buttonPlus;
    }

    public void setButtonPlus(JButton buttonPlus) {
        this.buttonPlus = buttonPlus;
    }

    public JButton getButtonMinus() {
        return buttonMinus;
    }

    public void setButtonMinus(JButton buttonMinus) {
        this.buttonMinus = buttonMinus;
    }

    public JButton getButtonSquare() {
        return buttonSquare;
    }

    public void setButtonSquare(JButton buttonSquare) {
        this.buttonSquare = buttonSquare;
    }

    public JButton getButtonReciprocal() {
        return buttonReciprocal;
    }

    public void setButtonReciprocal(JButton buttonReciprocal) {
        this.buttonReciprocal = buttonReciprocal;
    }

    public JButton getButtonSqrt() {
        return buttonSqrt;
    }

    public void setButtonSqrt(JButton buttonSqrt) {
        this.buttonSqrt = buttonSqrt;
    }
}
