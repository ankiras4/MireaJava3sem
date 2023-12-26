package Tasks.Task24.punkt2;

import java.util.Scanner;

public class Client {
    Chair chair;

    public void sit() {
        System.out.println("I'm sitting on " + chair.toString());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        Client a = new Client();
        ChairFactory b = new ChairFactory();
        System.out.println("Введите номер стула на котором хотите сидеть:\n 1 - магический стул\n 2 - функциональный стул\n 3 - викторианский стул");
        int count = scan.nextInt();
        if (count == 1) {
            a.setChair(b.createMagicChair());
            a.sit();
            MagicChair m = new MagicChair();
            m.doMagic();
        } else if (count == 2) {
            a.setChair(b.createFunctionalChair());
            a.sit();
            System.out.println("Введите два целых числа:");
            int q = scan.nextInt();
            int w = scan.nextInt();
            FunctionalChair f = new FunctionalChair();
            int y = f.sum(q, w);
            System.out.print(y);
        } else if (count == 3) {
            a.setChair(b.createVictorianChair(3));
            a.sit();
            VictorianChair v = new VictorianChair(188);
            int h = v.getAge();
            System.out.print(h);
        } else {
            System.out.println("Вы промахнулись мимо какого-либо стула");
        }
    }
}