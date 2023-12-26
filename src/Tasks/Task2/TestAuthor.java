package Tasks.Task2;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Author person = new Author("Anastasia","ankira@mail.ru",'f');
        System.out.print("Имя автора: " + person.getName());
        System.out.print("\nemail автора: " + person.getEmail());
        System.out.print("\nВведите новый email: ");
        person.setEmail(scanner.next());
        System.out.print("\nНовый email автора: " + person.getEmail());
        System.out.print("\nПол автора: " + person.getGender());
        System.out.print("\n" + person.toString());
    }
}
