package packages;

import javax.swing.*;
import java.awt.*;

public class questionsPage {

    public void create(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.YELLOW);

        JLabel question1 = new JLabel("چقدر رابط کاربری نرم افزار از نظر شما جذاب است؟");
        question1.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel radioPanel1 = new JPanel();
        radioPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        radioPanel1.setBackground(Color.YELLOW);

        JRadioButton radio1_1 = new JRadioButton("۱");
        JRadioButton radio1_2 = new JRadioButton("۲");
        JRadioButton radio1_3 = new JRadioButton("۳");
        JRadioButton radio1_4 = new JRadioButton("۴");
        JRadioButton radio1_5 = new JRadioButton("۵");

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

        JLabel question2 = new JLabel("آیا دسترسی به امکانات مختلف نرم افزار برای شما آسان است؟");
        question2.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel radioPanel2 = new JPanel();
        radioPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        radioPanel2.setBackground(Color.YELLOW);

        JRadioButton radio2_1 = new JRadioButton("۱");
        JRadioButton radio2_2 = new JRadioButton("۲");
        JRadioButton radio2_3 = new JRadioButton("۳");
        JRadioButton radio2_4 = new JRadioButton("۴");
        JRadioButton radio2_5 = new JRadioButton("۵");

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

        JLabel question3 = new JLabel("چقدر طراحی صفحات نرم افزار ساده و کاربرپسند است؟");
        question3.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel radioPanel3 = new JPanel();
        radioPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        radioPanel3.setBackground(Color.YELLOW);

        JRadioButton radio3_1 = new JRadioButton("۱");
        JRadioButton radio3_2 = new JRadioButton("۲");
        JRadioButton radio3_3 = new JRadioButton("۳");
        JRadioButton radio3_4 = new JRadioButton("۴");
        JRadioButton radio3_5 = new JRadioButton("۵");

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

        JLabel question4 = new JLabel("آیا رنگ ها و فونت های استفاده شده در نرم افزار مناسب هستند؟");
        question4.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel radioPanel4 = new JPanel();
        radioPanel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        radioPanel4.setBackground(Color.YELLOW);

        JRadioButton radio4_1 = new JRadioButton("۱");
        JRadioButton radio4_2 = new JRadioButton("۲");
        JRadioButton radio4_3 = new JRadioButton("۳");
        JRadioButton radio4_4 = new JRadioButton("۴");
        JRadioButton radio4_5 = new JRadioButton("۵");

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

        JButton nextButton = new JButton("صفحه بعد");
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