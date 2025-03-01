package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public static final Font DEFAULT_FONT = new Font("Serif", Font.PLAIN, 15);


    public void create(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);

        JLabel thankYouLabel = new JLabel("Thank You for your cooperation!");
        thankYouLabel.setFont(DEFAULT_FONT);

        thankYouLabel.setHorizontalAlignment(JLabel.CENTER);

        panel.add(thankYouLabel, BorderLayout.CENTER);

        frame.add(panel);
    }
}