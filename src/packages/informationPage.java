package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.YELLOW);

        JLabel nameLabel = new JLabel("اسم");
        nameLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        JTextField nameField = new JTextField(15);
        nameField.setHorizontalAlignment(JTextField.CENTER);
        nameField.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        JLabel ageLabel = new JLabel("سن");
        ageLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        JTextField ageField = new JTextField(15);
        ageField.setHorizontalAlignment(JTextField.CENTER);
        ageField.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        JLabel emailLabel = new JLabel("ایمیل");
        emailLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        JTextField emailField = new JTextField(15);
        emailField.setHorizontalAlignment(JTextField.CENTER);
        emailField.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        JLabel levelLabel = new JLabel("سطح آشنایی با نرم افزارهای مشابه");
        levelLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JRadioButton level1 = new JRadioButton("مبتدی");
        JRadioButton level2 = new JRadioButton("متوسط");
        JRadioButton level3 = new JRadioButton("پیشرفته");
        JRadioButton level4 = new JRadioButton("بدون آشنایی");

        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        JButton nextButton = new JButton("صفحه بعد");
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