package Tasks.Task18;

import java.util.Scanner;

public class Exception1 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Введите число");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
        catch(Exception e){
            System.out.println("Ошибка ввода");
        }
        finally {
            System.out.println("Выполнение завершено");
        }
    }
}

class Exceptions {
    public static void main(String args[]){
        Exception1 Alpha = new Exception1();
        Alpha.exceptionDemo();
    }
}