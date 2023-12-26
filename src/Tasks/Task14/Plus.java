package Tasks.Task14;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Plus {
    public static boolean hasDigitPlus(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }

    public static void main(String[] args) {
        System.out.println(hasDigitPlus("1/3-5"));
        System.out.println(hasDigitPlus("1 + 3 - 5"));
        System.out.println(hasDigitPlus("1 / 3+5"));
    }
}