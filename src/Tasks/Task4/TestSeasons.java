package Tasks.Task4;
import java.util.Scanner;

public class TestSeasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seasons season1 = Seasons.SPRING;
        System.out.print(season1 + "\n");
        System.out.println("Введите любимое время года:");
        all();
        String bestseason = scanner.next();
        print(Seasons.valueOf(bestseason));
        AllDescription();
    }


    public static void print(Seasons seasons){
        switch (seasons){
            case WINTER -> System.out.print("Я люблю зиму");
            case SPRING -> System.out.print("Я люблю весну");
            case SUMMER -> System.out.print("Я люблю лето");
            case AUTUMN -> System.out.print("Я люблю осень");
        }
    }
    public static void all(){
        for (Seasons s : Seasons.values()){
            System.out.print(s + "\n");
        }
    }
    public static void AllDescription(){
        for (Seasons s : Seasons.values()){
            System.out.print(s.getDescription());
        }
    }
}