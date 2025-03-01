package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public static final Font DEFAULT_FONT = new Font("Serif", Font.PLAIN, 15);


    public void create(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.YELLOW);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(DEFAULT_FONT);
        nameLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        JTextField nameField = new JTextField(15);
        nameField.setHorizontalAlignment(JTextField.CENTER);
        nameField.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        JLabel ageLabel = new JLabel("Age");
        ageLabel.setFont(DEFAULT_FONT);
        ageLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        JTextField ageField = new JTextField(15);
        ageField.setHorizontalAlignment(JTextField.CENTER);
        ageField.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(DEFAULT_FONT);
        emailLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        JTextField emailField = new JTextField(15);
        emailField.setHorizontalAlignment(JTextField.CENTER);
        emailField.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        JLabel levelLabel = new JLabel("Level of experience with similar apps ");
        levelLabel.setFont(DEFAULT_FONT);
        levelLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JRadioButton level1 = new JRadioButton("Beginner");
        level1.setFont(DEFAULT_FONT);
        JRadioButton level2 = new JRadioButton("Intermediate");
        level2.setFont(DEFAULT_FONT);
        JRadioButton level3 = new JRadioButton("Advanced");
        level3.setFont(DEFAULT_FONT);
        JRadioButton level4 = new JRadioButton("No Experience");
        level4.setFont(DEFAULT_FONT);

        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        JButton nextButton = new JButton("Next Page");
        nextButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        nextButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        panel.add(nextButton);

        frame.add(panel);
    }
}