package Tasks.Task2.t3;
import java.util.Scanner;
public class HowMany {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split("[\\ \\\t]");
        System.out.println(str.length);
    }
}

