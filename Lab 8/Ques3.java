import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques3 extends JFrame {
    private JLabel timeLabel;
    private JButton startButton, resetButton;
    private boolean running = false;
    private int hours = 0, minutes = 0, seconds = 0, milliseconds = 0;
    private Thread timerThread;

    public Ques3() {
        setTitle("Stopwatch");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        timeLabel = new JLabel("00 : 00 : 00 . 00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        timeLabel.setForeground(Color.BLUE);
        add(timeLabel);

        startButton = new JButton("Start");
        resetButton = new JButton("Reset");

        add(startButton);
        add(resetButton);

        startButton.addActionListener(new StartAction());
        resetButton.addActionListener(new ResetAction());

        setVisible(true);
    }

    class StartAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!running) {
                running = true;
                startButton.setText("Stop");

                timerThread = new Thread(() -> {
                    while (running) {
                        try {
                            Thread.sleep(10); // 10 milliseconds
                            milliseconds += 10;
                            if (milliseconds >= 1000) {
                                milliseconds = 0;
                                seconds++;
                            }
                            if (seconds >= 60) {
                                seconds = 0;
                                minutes++;
                            }
                            if (minutes >= 60) {
                                minutes = 0;
                                hours++;
                            }
                            updateTimeLabel();
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                timerThread.start();
            } else {
                running = false;
                startButton.setText("Start");
            }
        }
    }

    class ResetAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            running = false;
            startButton.setText("Start");
            hours = minutes = seconds = milliseconds = 0;
            updateTimeLabel();
        }
    }

    private void updateTimeLabel() {
        SwingUtilities.invokeLater(() -> timeLabel.setText(String.format("%02d : %02d : %02d . %02d", hours, minutes, seconds, milliseconds / 10)));
    }

    public static void main(String[] args) {
        new Ques3();
    }
}