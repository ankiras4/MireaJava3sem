package Tasks.Task2.t6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle1 = new Circle(10, 34, 8);
        Circle circle2 = new Circle(45, 6, 13);

        System.out.print("Координаты 1ого круга по x " + circle1.getX());
        System.out.print("\nКоординаты 1ого круга по y " + circle1.getY());
        System.out.print("\nКоординаты 2ого круга по x " + circle2.getX());
        System.out.print("\nКоординаты 2ого круга по y " + circle2.getY());
        System.out.print("\nПлощадь 1ого круга " + circle1.SquareCircle());
        System.out.print("\nПлощадь 2ого круга " + circle2.SquareCircle());
        System.out.print("\nДлина 1ого круга " + circle1.LengthCircle());
        System.out.print("\nДлина 2ого круга " + circle2.LengthCircle());
        System.out.print("\nРадиус 1ого круга " + circle1.getRadius());
        System.out.print("\nРадиус 2ого круга " + circle2.getRadius());
        System.out.print("\nСравнение окружностей: ");
        circle1.compareCircles(circle2);
        System.out.print("\nВведите новый радиус: ");
        circle2.setRadius(scanner.nextDouble());
        System.out.print("\nСравнение окружностей: ");
        circle1.compareCircles(circle2);
    }
}
