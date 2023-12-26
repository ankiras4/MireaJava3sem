package Tasks.Task25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cost {
    public static void main(String args[]){
        String regex = "(\\d+)(\\.\\d{1,2}) (RUB|USD|EUR)";
        Pattern pattern = Pattern.compile(regex);
        Scanner scan = new Scanner(System.in);
        String b = scan.nextLine();
        boolean i;
        do {
            Matcher matcher = pattern.matcher(b);
            if (matcher.find()) {
                System.out.println(matcher.group(1) + matcher.group(2));
                i = false;
            } else {
                System.out.println("Неверный формат суммы");
                b = scan.nextLine();
                i = true;
            }
        }while(i);
    }
}