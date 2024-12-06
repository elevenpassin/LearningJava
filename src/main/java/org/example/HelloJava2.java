package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloJava2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloJava2");
        String text = args.length >= 1 ? args[0] : "Hello, Java!";

        frame.add(new HelloComponent2(text));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

class HelloComponent2 extends JComponent
        implements MouseMotionListener {
    String theMessage;
    // Coordinates of the message
    int messageX = 125, messageY = 95;

    public HelloComponent2(String message) {
        theMessage = message;
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {
        // Save the mouse coordinates & paint the message.
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {  }
}
