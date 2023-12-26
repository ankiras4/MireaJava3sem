import java.text.SimpleDateFormat;
import java.util.*;

public class TestDevelop {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
        long start = System.currentTimeMillis();
        Date data1 = new Date();

        System.out.println("Введите свою фамилию:");
        String familia = console.next();
        System.out.printf("Фамилия разработчика: %4s", familia);
        long timeWorkCode = System.currentTimeMillis() - start;
        Date data2 = new Date();

        String formatted1 = formatter.format(data1);
        String formatted2 = formatter.format(data2);

        System.out.println("\nСкорость выполнения программы: " + timeWorkCode + " миллисекунд");
        System.out.printf("Время получения задания: %4s", formatted1);
        System.out.printf("\nВремя сдачи задания: %4s", formatted2);
    }
}