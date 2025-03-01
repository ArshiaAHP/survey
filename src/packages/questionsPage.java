package packages;

import javax.swing.*;
import java.awt.*;

public class questionsPage {

    public static final Font DEFAULT_FONT = new Font("Serif", Font.PLAIN, 15);


    public void create(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.YELLOW);

        JLabel question1 = new JLabel("How attractive is the UI of the software in your opinion?");
        question1.setFont(DEFAULT_FONT);
        question1.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel radioPanel1 = new JPanel();
        radioPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        radioPanel1.setBackground(Color.YELLOW);

        JRadioButton radio1_1 = new JRadioButton("1");
        radio1_1.setFont(DEFAULT_FONT);
        JRadioButton radio1_2 = new JRadioButton("2");
        radio1_2.setFont(DEFAULT_FONT);
        JRadioButton radio1_3 = new JRadioButton("3");
        radio1_3.setFont(DEFAULT_FONT);
        JRadioButton radio1_4 = new JRadioButton("4");
        radio1_4.setFont(DEFAULT_FONT);
        JRadioButton radio1_5 = new JRadioButton("5");
        radio1_5.setFont(DEFAULT_FONT);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1_1);
        group1.add(radio1_2);
        group1.add(radio1_3);
        group1.add(radio1_4);
        group1.add(radio1_5);

        radioPanel1.add(radio1_1);
        radioPanel1.add(radio1_2);
        radioPanel1.add(radio1_3);
        radioPanel1.add(radio1_4);
        radioPanel1.add(radio1_5);

        JLabel question2 = new JLabel("Is it easy for you to access various features of the software?");
        question2.setFont(DEFAULT_FONT);
        question2.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel radioPanel2 = new JPanel();
        radioPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        radioPanel2.setBackground(Color.YELLOW);

        JRadioButton radio2_1 = new JRadioButton("1");
        radio2_1.setFont(DEFAULT_FONT);
        JRadioButton radio2_2 = new JRadioButton("2");
        radio2_2.setFont(DEFAULT_FONT);
        JRadioButton radio2_3 = new JRadioButton("3");
        radio2_3.setFont(DEFAULT_FONT);
        JRadioButton radio2_4 = new JRadioButton("4");
        radio2_4.setFont(DEFAULT_FONT);
        JRadioButton radio2_5 = new JRadioButton("5");
        radio2_5.setFont(DEFAULT_FONT);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(radio2_1);
        group2.add(radio2_2);
        group2.add(radio2_3);
        group2.add(radio2_4);
        group2.add(radio2_5);

        radioPanel2.add(radio2_1);
        radioPanel2.add(radio2_2);
        radioPanel2.add(radio2_3);
        radioPanel2.add(radio2_4);
        radioPanel2.add(radio2_5);

        JLabel question3 = new JLabel("How simple and user-friendly is the software page design?");
        question3.setFont(DEFAULT_FONT);
        question3.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel radioPanel3 = new JPanel();
        radioPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        radioPanel3.setBackground(Color.YELLOW);

        JRadioButton radio3_1 = new JRadioButton("1");
        radio3_1.setFont(DEFAULT_FONT);
        JRadioButton radio3_2 = new JRadioButton("2");
        radio3_2.setFont(DEFAULT_FONT);
        JRadioButton radio3_3 = new JRadioButton("3");
        radio3_3.setFont(DEFAULT_FONT);
        JRadioButton radio3_4 = new JRadioButton("4");
        radio3_4.setFont(DEFAULT_FONT);
        JRadioButton radio3_5 = new JRadioButton("5");
        radio3_5.setFont(DEFAULT_FONT);

        ButtonGroup group3 = new ButtonGroup();
        group3.add(radio3_1);
        group3.add(radio3_2);
        group3.add(radio3_3);
        group3.add(radio3_4);
        group3.add(radio3_5);

        radioPanel3.add(radio3_1);
        radioPanel3.add(radio3_2);
        radioPanel3.add(radio3_3);
        radioPanel3.add(radio3_4);
        radioPanel3.add(radio3_5);

        JLabel question4 = new JLabel("Are the colors and the fonts used appropriate?");
        question4.setFont(DEFAULT_FONT);
        question4.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel radioPanel4 = new JPanel();
        radioPanel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        radioPanel4.setBackground(Color.YELLOW);

        JRadioButton radio4_1 = new JRadioButton("1");
        radio4_1.setFont(DEFAULT_FONT);
        JRadioButton radio4_2 = new JRadioButton("2");
        radio4_2.setFont(DEFAULT_FONT);
        JRadioButton radio4_3 = new JRadioButton("3");
        radio4_3.setFont(DEFAULT_FONT);
        JRadioButton radio4_4 = new JRadioButton("4");
        radio4_4.setFont(DEFAULT_FONT);
        JRadioButton radio4_5 = new JRadioButton("5");
        radio4_5.setFont(DEFAULT_FONT);

        ButtonGroup group4 = new ButtonGroup();
        group4.add(radio4_1);
        group4.add(radio4_2);
        group4.add(radio4_3);
        group4.add(radio4_4);
        group4.add(radio4_5);

        radioPanel4.add(radio4_1);
        radioPanel4.add(radio4_2);
        radioPanel4.add(radio4_3);
        radioPanel4.add(radio4_4);
        radioPanel4.add(radio4_5);

        JButton nextButton = new JButton("Next Page");
        nextButton.setFont(DEFAULT_FONT);
        nextButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        nextButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            thankYouPage thankYouPage = new thankYouPage();
            thankYouPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        panel.add(question1);
        panel.add(radioPanel1);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        panel.add(question2);
        panel.add(radioPanel2);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        panel.add(question3);
        panel.add(radioPanel3);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        panel.add(question4);
        panel.add(radioPanel4);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        panel.add(nextButton);

        frame.add(panel);
    }
}