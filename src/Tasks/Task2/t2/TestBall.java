package Tasks.Task2.t2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ball ball2 = new Ball();
        Ball ball1 = new Ball(10.2, 370.7);

        System.out.print("\nКоординаты по x: " + ball2.getX());
        System.out.print("\nИзмените координатy x: ");
        ball2.setX(scanner.nextDouble());
        System.out.print("\nКоординаты по y: " + ball1.getY());
        System.out.print("\nИзмените координатy y: ");
        ball1.setY(scanner.nextDouble());
        ball2.setXY(230,78);
        ball2.move(0,100);
        System.out.print("\n" + ball1.toString());
        System.out.print("\n" + ball2.toString());

    }
}

