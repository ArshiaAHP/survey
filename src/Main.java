import javax.swing.*;
import packages.informationPage;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("فرم نظرسنجی");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);

        JLabel title = new JLabel("فرم نظرسنجی");
        title.setHorizontalAlignment(JLabel.CENTER);

        JButton startButton = new JButton("شروع!");
        startButton.setAlignmentX(JButton.CENTER_ALIGNMENT);

        panel.add(title, BorderLayout.NORTH);
        panel.add(startButton, BorderLayout.CENTER);

        frame.add(panel);

        startButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        frame.setVisible(true);
    }
}