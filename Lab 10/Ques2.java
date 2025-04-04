import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        JLabel firstLabel = new JLabel("Enter First Number:");
        JLabel secondLabel = new JLabel("Enter Second Number:");
        JLabel resultLabel = new JLabel("Result:");

        JTextField firstField = new JTextField();
        JTextField secondField = new JTextField();
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton mulButton = new JButton("Multiply");
        JButton resetButton = new JButton("Reset");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firstField.getText());
                double num2 = Double.parseDouble(secondField.getText());
                resultField.setText(String.valueOf(num1 + num2));
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firstField.getText());
                double num2 = Double.parseDouble(secondField.getText());
                resultField.setText(String.valueOf(num1 - num2));
            }
        });

        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firstField.getText());
                double num2 = Double.parseDouble(secondField.getText());
                resultField.setText(String.valueOf(num1 * num2));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstField.setText("");
                secondField.setText("");
                resultField.setText("");
            }
        });

        frame.add(firstLabel);
        frame.add(firstField);
        frame.add(secondLabel);
        frame.add(secondField);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(resetButton);

        frame.setVisible(true);
    }
}