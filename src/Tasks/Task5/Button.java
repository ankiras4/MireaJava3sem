package Tasks.Task5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    public static void main(String args[]) {
        final int[] madrid = {0};
        final int[] milan = {0};

        JFrame frame = new JFrame("Футбольный матч");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        panel.setPreferredSize(new Dimension(200, 300));
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        JLabel label = new JLabel();
        JLabel count = new JLabel();
        JLabel winner = new JLabel();


        ActionListener AListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan[0] += 1;
                upd ("AC Milan", panel, label, frame, count, milan[0], madrid[0],winner);
            }
        };
        ActionListener AListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid[0] += 1;
                upd ("Madrid", panel, label, frame, count, milan[0], madrid[0],winner);
            }
        };
        button1.addActionListener(AListener1);
        button2.addActionListener(AListener2);
        System.out.print(milan[0]);

        panel.add(button1);
        panel.add(button2);

        frame.getContentPane().add(panel);
        frame.pack();

        frame.setVisible(true);
    }

    private static void upd(String last, JPanel panel, JLabel label, JFrame frame,JLabel count,
                            int milan, int madrid,JLabel winner){
        label.setText("\nLast Scorer: " + last);
        panel.add(label);
        count.setText("\nAC Milan " + milan + " X " + madrid + " Real Madrid");
        panel.add(count);
        if (milan>madrid){
            winner.setText("\nWinner: AC Milan");
        }
        else if (milan == madrid){
            winner.setText("\nDraw!!!!!");
        }
        else {
            winner.setText("\nWinner: Real Madrid");
        }
        panel.add(winner);
        frame.getContentPane().add(panel);
        frame.pack();
    }
}
