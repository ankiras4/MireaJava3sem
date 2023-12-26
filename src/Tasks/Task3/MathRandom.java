package Tasks.Task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MathRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размер массива:");
        int length = scan.nextInt();
        double[] array1 = new double[length];
        double[] array2 = new double[length];
        for (int i = 0; i < length; i++) {
            array1[i] = rand.nextDouble();
            array2[i] = Math.random();
        }
        System.out.print("Массив 1: " + Arrays.toString(array1));
        System.out.print("\nМассив 2: " + Arrays.toString(array2));
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.print("\nМассив 1: " + Arrays.toString(array1));
        System.out.print("\nМассив 2: " + Arrays.toString(array2));

    }
}
