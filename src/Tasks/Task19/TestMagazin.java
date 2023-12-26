package Tasks.Task19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class TestMagazin extends JFrame {
    public TestMagazin(){
        super("Магазин");
        final TextArea text=new TextArea();
        text.setBounds(50,180, 350,350);
        text.setForeground(new Color(8, 76, 42).brighter());
        text.setBackground(new Color(182,255,218));
        final TextField text2=new TextField();
        text2.setBounds(450, 180, 320, 50);
        text2.setForeground(new Color(8, 76, 42).brighter());
        text2.setBackground(new Color(182,255,218));


        ArrayList<Tasks.Task19.Magazin> count = new ArrayList<>();


        Button a=new Button("ЗАРЕГИСТРИРОВАТЬСЯ");
        a.setBounds(450,310,60,30);
        a.setSize(320,50);
        a.setForeground(new Color(8, 76, 42).brighter());
        a.setBackground(new Color(108,255,108));
        a.addActionListener(e -> {
            try {
                String m = text.getText();
                String[] n = m.replaceAll(", ",",").split(",");
                count.add(Magazin.Buyers(n));
                text.setText("");
                text2.setText("ПРОФИЛЬ УСПЕШНО ДОБАВЛЕН!");
            }catch (Exception ex){
                text2.setText("НЕВЕРНЫЙ ФОРМАТ ВВОДА");
            }
        });


        Button b=new Button("АВТОРИЗОВАННЫЕ ПОЛЬЗОВАТЕЛИ");
        b.setBounds(450,380,60,30);
        b.setSize(320,50);
        b.setForeground(new Color(8, 76, 42).brighter());
        b.setBackground(new Color(108,255,108));
        b.addActionListener(e -> {
            StringBuilder names = new StringBuilder();
            for(Magazin i: count){
                names.append(i.FIO).append(" ").append(i.INN).append("\n");
            }
            text.setText(names.toString());
        });
        Button d=new Button("ОПЛАТИТЬ ТОВАР");
        d.setBounds(450,240,250,30);
        d.setSize(320,50);
        d.setForeground(new Color(8, 76, 42).brighter());
        d.setBackground(new Color(108,255,108));
        d.addActionListener(e -> {
            try {
                String l = text.getText();
                String[] n = l.replaceAll(", ",",").split(",");
                text.setText("");
                int k = 0;
                StringBuilder names = new StringBuilder();
                for (Magazin i : count){
                    if (Objects.equals(i.INN, n[1])){
                        k+=1;
                    }
                    else {
                        k = k;
                    }
                }
                if (k>0){text2.setText("ПОКУПКА ОЛАЧЕНА");}
                else {text2.setText("ПОЛЬЗОВАТЕЛЯ НЕТ В БАЗЕ." + "\n" + "ЗАРЕГИСТРИРУЙТЕСЬ ИЛИ ПРОВЕРЬТЕ ДАННЫЕ");}
            } catch (Exception ex) {
                text2.setText("НЕВОЗМОЖНО ВЫПОЛНИТЬ ОПЕРЦИЮ");
            }
        });

        Button p=new Button("ОЧИСТИТЬ ОКНО ВВОДА-ВЫВОДА");
        p.setBounds(450,450,250,30);
        p.setSize(320,50);
        p.setForeground(new Color(8, 76, 42).brighter());
        p.setBackground(new Color(108,255,108));
        p.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText("");
                text2.setText("");
            }
        });

        ImageIcon img = new ImageIcon("C:\\Users\\lirok\\IdeaProjects\\java\\src\\Tasks\\Task19\\заголовок.png");
        JLabel label = new JLabel(img);
        label.setBounds(0,0,800,100);

        ImageIcon img1 = new ImageIcon("C:\\Users\\lirok\\IdeaProjects\\java\\src\\Tasks\\Task19\\подзаголовок.png");
        JLabel label1 = new JLabel(img1);
        label1.setBounds(0,80,800,100);


        add(b);add(a);add(d);add(text);add(text2);add(p);add(label);add(label1);

        setSize(800,600);
        setCursor(HAND_CURSOR);
        setResizable(false);
        setLayout(null);
        setVisible(true);

        String m = "Кириллова Анастасия Александровна,2333-345678-01";
        String[] n = m.split(",");
        count.add(Tasks.Task19.Magazin.Buyers(n));

        String m1 = "Попов Арсений Сергеевич,0908-007789-22";
        String[] n1 = m1.split(",");
        count.add(Tasks.Task19.Magazin.Buyers(n1));

        String m2 = "Шастун Антон Андреевич,0077-456723-01";
        String[] n2 = m2.split(",");
        count.add(Tasks.Task19.Magazin.Buyers(n2));

        String m3 = "Позов Дмитрий Тимурович,0076-785623-11";
        String[] n3 = m3.split(",");
        count.add(Tasks.Task19.Magazin.Buyers(n3));

        String m4 = "Матвиенко Сергей Борисович,0456-109456-00";
        String[] n4 = m4.split(",");
        count.add(Tasks.Task19.Magazin.Buyers(n4));


    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new TestMagazin();
            }
        });
    }
}