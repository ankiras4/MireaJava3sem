package Tasks.Task17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
public class TestBook extends JFrame{
    public BookList count = new BookList();
    public TestBook(){
        super("Список книг");
        final TextArea text=new TextArea();
        text.setBounds(50,180, 350,350);
        text.setForeground(new Color(51, 26, 0).brighter());
        text.setBackground(new Color(247,237,226));
        final TextField text2=new TextField();
        text2.setBounds(450, 180, 250, 20);
        text2.setForeground(new Color(51, 26, 0).brighter());
        text2.setBackground(new Color(247,237,226));

        Button a = new Button("Добавить новую книгу");
        a.setBounds(450,240,250,30);
        a.setSize(320,50);
        a.setForeground(new Color(51, 26, 0).brighter());
        a.setBackground(new Color(237,216,188));
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    String m = text.getText();
                    String[] n = m.replaceAll(", ",",").split(",");
                    count.add(new Tasks.Task17.Book(n));
                    text.setText("Книга успешно добавлена!");
                }catch (Exception ex){
                    try{
                        String m = text.getText();
                        String[] n = m.split(",");
                        count.add(new Tasks.Task17.Book(n));
                        text.setText("Книга успешно добавлена!");
                    }catch(Exception ex1) {
                        text.setText("Неверный формат ввода");
                    }
                }
            }
        });

        Button b=new Button("Вывести список книг");
        b.setBounds(450,310,60,30);
        b.setSize(150,50);
        b.setForeground(new Color(51, 26, 0).brighter());
        b.setBackground(new Color(237,216,188));
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(count.isEmpty()) {
                    text.setText("Список пуст");
                }else {
                    String titles = "";
                    for (Book i : count) {
                        titles += i.Title + " " + i.Author + " " + i.Year + "\n";
                    }
                    text.setText(titles);
                }
            }
        });

        Button c=new Button("Очистить список");
        c.setBounds(620,310,60,30);
        c.setSize(150,50);
        c.setForeground(new Color(51, 26, 0).brighter());
        c.setBackground(new Color(237,216,188));
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count = new BookList();
            }
        });

        Button d=new Button("Вывести элемент");
        d.setBounds(450,380,60,30);
        d.setSize(150,50);
        d.setForeground(new Color(51, 26, 0).brighter());
        d.setBackground(new Color(237,216,188));
        d.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try {
                    int l = Integer.parseInt(text2.getText());
                    text.setText(count.get(l - 1).PrintOn());
                } catch (Exception ex) {
                    text.setText("Невозможно выполнить операцию");
                }
            }
        });

        Button j=new Button("Удалить элемент");
        j.setBounds(620,380,60,30);
        j.setSize(150,50);
        j.setForeground(new Color(51, 26, 0).brighter());
        j.setBackground(new Color(237,216,188));
        j.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    int l = Integer.parseInt(text2.getText());
                    count.remove(l - 1);
                    text.setText("Объект успешно удалён");
                }catch(Exception ex){
                    text.setText("Невозможно выполнить операцию");
                }
            }
        });

        Button p=new Button("Очистить окно ввода-вывода");
        p.setBounds(450,450,250,30);
        p.setSize(320,50);
        p.setForeground(new Color(51, 26, 0).brighter());
        p.setBackground(new Color(237,216,188));
        p.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText("");
                text2.setText("");
            }
        });

        ImageIcon img = new ImageIcon("C:\\Users\\lirok\\IdeaProjects\\java\\src\\Tasks\\Task17\\Монтажная область 1.png");
        JLabel label = new JLabel(img);
        label.setBounds(0,0,800,100);

        ImageIcon img1 = new ImageIcon("C:\\Users\\lirok\\IdeaProjects\\java\\src\\Tasks\\Task17\\текст2.png");
        JLabel label1 = new JLabel(img1);
        label1.setBounds(50,110,350,100);

        ImageIcon img2 = new ImageIcon("C:\\Users\\lirok\\IdeaProjects\\java\\src\\Tasks\\Task17\\текст1.png");
        JLabel label2 = new JLabel(img2);
        label2.setBounds(450,110,300,100);

        add(c);add(b);add(a);add(d);add(j);add(p);add(text);add(text2);add(label);add(label1);add(label2);

        setSize(800,600);
        setCursor(HAND_CURSOR);
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new TestBook();
            }
        });
    }
}

