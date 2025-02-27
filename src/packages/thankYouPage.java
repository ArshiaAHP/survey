package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);

        JLabel thankYouLabel = new JLabel("با تشکر از مشارکت شما!");
        thankYouLabel.setHorizontalAlignment(JLabel.CENTER);

        panel.add(thankYouLabel, BorderLayout.CENTER);

        frame.add(panel);
    }
}