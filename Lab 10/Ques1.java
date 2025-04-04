import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(4, 20);
        JScrollPane scrollPane = new JScrollPane(addressArea);

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JCheckBox termsCheckBox = new JCheckBox("I agree to the terms and conditions");

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!termsCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "You must agree to the terms!");
                    return;
                }
                JOptionPane.showMessageDialog(frame, "Registration Successful!");
            }
        });

        ImageIcon icon = new ImageIcon("sample.png"); // Provide an image path
        JLabel imageLabel = new JLabel(icon);

        frame.add(imageLabel);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(addressLabel);
        frame.add(scrollPane);
        frame.add(genderLabel);
        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(termsCheckBox);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}