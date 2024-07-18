import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField display;
    private JButton[] numberButtons;
    private JButton addButton, subButton, mulButton, divButton, equButton, clrButton;
    private JPanel panel;
    private double num1, num2, result;
    private char operator;

    public Calculator() {
        // Create display field
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        // Create number buttons
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new NumberButtonListener());
        }

        // Create operator buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        clrButton = new JButton("C");

        // Add action listeners for operator buttons
        addButton.addActionListener(new OperatorButtonListener());
        subButton.addActionListener(new OperatorButtonListener());
        mulButton.addActionListener(new OperatorButtonListener());
        divButton.addActionListener(new OperatorButtonListener());
        equButton.addActionListener(new EqualButtonListener());
        clrButton.addActionListener(new ClearButtonListener());

        // Create panel and add components
        panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(4, 4));
        for (int i = 1; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(addButton);
        panel.add(numberButtons[0]);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(equButton);
        panel.add(clrButton);

        // Frame settings
        setLayout(new java.awt.BorderLayout());
        add(display, java.awt.BorderLayout.NORTH);
        add(panel, java.awt.BorderLayout.CENTER);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    private class NumberButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            display.setText(display.getText() + command);
        }
    }

    private class OperatorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            try {
                num1 = Double.parseDouble(display.getText());
                display.setText("");
                operator = command.charAt(0);
            } catch (NumberFormatException ex) {
                display.setText("");
            }
        }
    }

    private class EqualButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                num2 = Double.parseDouble(display.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                display.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                display.setText("");
            }
        }
    }

    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
   }
}