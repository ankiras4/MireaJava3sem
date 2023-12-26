package Tasks.Task12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Scanner;

public class Photo {
    public static void main(String args[]) throws InterruptedException {
        JFrame frame = new JFrame("Ananasik");
        Scanner scanner = new Scanner(System.in);
        ImageIcon img = new ImageIcon(scanner.nextLine());
        frame.setSize(350,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel= new JPanel();
        panel.setBackground(Color.YELLOW);

        JLabel label = new JLabel(img);
        panel.add(label);
        panel.setBounds(0, 0, 100, 50);
        frame.getContentPane();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}