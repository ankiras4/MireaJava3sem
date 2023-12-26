package Tasks.Task13;

import java.util.StringTokenizer;

public class TestAdres{
    public static void main(String[] args) {
        Adres a1 = new Adres("Россия, Москва   ,    Москва, проспект Вернадского, 78, 7, 9");
        Adres a2 = new Adres("USSR,      Leningradskaya oblast', Leningrad.    Nevskiy prospect; 234;1;23");
        Adres a3 = new Adres("UK, London, London, Trafalgar square, 2, 3, 4, other string,,,");
        Adres a4 = new Adres("Страна; регион;     город    . Улица, дом, корпус. Квартира");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

    }
}