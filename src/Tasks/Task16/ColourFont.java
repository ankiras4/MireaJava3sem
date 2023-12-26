package Tasks.Task16;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class ColourFont extends JFrame {

    private ColourFont(){
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));

        String[] colors = {"Черный", "Красный", "Синий"};
        JComboBox<String> cols = new JComboBox<>(colors);
        cols.setSelectedIndex(0);

        String[] f = {"Times New Roman", "MS Sans Serif", "Courier New"};
        JComboBox<String> fonts = new JComboBox<>(f);
        fonts.setSelectedIndex(0);

        fonts.addItemListener(e -> textArea.setFont(new Font(f[fonts.getSelectedIndex()], Font.PLAIN, 16)));

        cols.addItemListener(e -> {
            Color c;
            switch (cols.getSelectedIndex()){
                case 1:
                    c = Color.RED;
                    break;
                case 2:
                    c = Color.BLUE;
                    break;
                default: c = Color.BLACK;
            }
            textArea.setForeground(c);
        });

        getContentPane().add(cols, BorderLayout.NORTH);
        getContentPane().add(fonts, BorderLayout.SOUTH);
        getContentPane().add(textArea);

    }

    public static void main(String[] args) {
        new ColourFont().setVisible(true);
    }
}