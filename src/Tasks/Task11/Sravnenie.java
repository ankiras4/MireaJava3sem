package Tasks.Task11;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Sravnenie {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.YYYY");
        Date now = new Date();
        Date set = new Date(123, 2, 15);

        String formatted1 = formatter.format(now);
        String formatted2 = formatter.format(set);

        if(now.equals(set))
            System.out.println("Даты совпадают");
        else if(now.after(set))
            System.out.println(String.format("%s позже чем %s", formatted1, formatted2));
        else if(now.before(set))
            System.out.println(String.format("%s раньше чем %s", formatted1, formatted2));
    }
}