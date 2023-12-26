package Tasks.Task25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String args[]){
        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}";
        Pattern pattern = Pattern.compile(regex);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пароль ");
        String b = sc.nextLine();
        Matcher matcher = pattern.matcher(b);
        boolean i;
        if(matcher.find()){
            System.out.println("Пароль надежный");
        } else {
            System.out.println("Пароль ненадежный");
        }
    }
}
/*пример правильных выражений: F032_Password, TrySpy1
  пример неправильных выражений: smart_pass, A007 */