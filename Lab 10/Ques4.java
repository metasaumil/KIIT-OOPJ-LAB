import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RGB Color Changer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 200));

        JLabel redLabel = new JLabel("Red:");
        JLabel greenLabel = new JLabel("Green:");
        JLabel blueLabel = new JLabel("Blue:");

        Integer[] values = new Integer[256];
        for (int i = 0; i < 256; i++) {
            values[i] = i;
        }
        JComboBox<Integer> redCombo = new JComboBox<>(values);
        JComboBox<Integer> greenCombo = new JComboBox<>(values);
        JComboBox<Integer> blueCombo = new JComboBox<>(values);

        JButton showOutputButton = new JButton("Show Output");
        showOutputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int red = (Integer) redCombo.getSelectedItem();
                int green = (Integer) greenCombo.getSelectedItem();
                int blue = (Integer) blueCombo.getSelectedItem();
                panel.setBackground(new Color(red, green, blue));
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(redLabel);
        controlPanel.add(redCombo);
        controlPanel.add(greenLabel);
        controlPanel.add(greenCombo);
        controlPanel.add(blueLabel);
        controlPanel.add(blueCombo);
        controlPanel.add(showOutputButton);

        frame.add(controlPanel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}