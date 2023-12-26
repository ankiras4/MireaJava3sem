package Tasks.Task8;
import java.util.Scanner;

public class NechetChisla {
    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                recursion();
            } else {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        try{
            recursion();
        }
        catch (Exception e){
            System.out.println("try again!");
        }
    }
}

