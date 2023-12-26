package Tasks.Task8;

import java.util.Scanner;

public class KolichestvoEdinic {
    public static int recursion() {
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n == 1) {
                int m = in.nextInt();
                if (m == 1) {
                    return recursion() + n + m;
                } else {
                    int k = in.nextInt();
                    if (k == 1) {
                        return recursion() + n + m + k;
                    } else {
                        return n + m + k;
                    }
                }
            } else {
                int m = in.nextInt();
                if (m == 1) {
                    return recursion() + n + m;
                } else {
                    return n + m;
                }
            }
        }

    public static void main(String[] args) {
        try{
            System.out.println(recursion());
        }
        catch (Exception e){
            System.out.println("try again!");
        }
    }
}
