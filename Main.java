
/*
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = console.nextInt();
        int[] array = new int[length];
        int sum = 0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = console.nextInt();
            sum += array[i];

        }
        int sred = sum/length;
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + sred);
    }
}*/

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = console.nextInt();
        int[] array = new int[length];
        int sum = 0;
        int i = 0;
        int min = 99999999;
        int max = 0;
        System.out.println("Введите элементы массива:");
        while (i < length) {
            array[i] = console.nextInt();
            sum += array[i];
            if (array[i]>max){
                max = array[i];
            }
            if (array[i]<min){
                min = array[i];
            }
            i += 1;
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Сумма: " + sum);
        System.out.println("Минимальное число:" + min);
        System.out.println("Максимальное число:" + max);
    }
}
//import java.util.Scanner;
//public class Main {
//    public static int factorial(int f) {
//        if (f == 1) {
//            return 1;
//        }
//        else {
//            return factorial(f-1)*f;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        int chislo = console.nextInt();
//        int s = factorial(chislo);
//        System.out.println("Факториал:" + s);
//    }
//
//}