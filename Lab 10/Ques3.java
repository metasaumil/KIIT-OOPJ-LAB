import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 200));

        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        JList<String> colorList = new JList<>(colors);
        JScrollPane scrollPane = new JScrollPane(colorList);

        JButton changeColorButton = new JButton("Change Color");
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = colorList.getSelectedValue();
                if (selectedColor != null) {
                    switch (selectedColor) {
                        case "Red":
                            panel.setBackground(Color.RED);
                            break;
                        case "Green":
                            panel.setBackground(Color.GREEN);
                            break;
                        case "Blue":
                            panel.setBackground(Color.BLUE);
                            break;
                        case "Yellow":
                            panel.setBackground(Color.YELLOW);
                            break;
                    }
                }
            }
        });

        frame.add(scrollPane, BorderLayout.WEST);
        frame.add(changeColorButton, BorderLayout.SOUTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}