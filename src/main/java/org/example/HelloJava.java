package org.example;

import javax.swing.*;

public class HelloJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LearningJava");
        frame.setSize(300, 150);

//        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
//        frame.add(label);

        frame.add(new HelloComponent());

        frame.setVisible(true);
    }
}
