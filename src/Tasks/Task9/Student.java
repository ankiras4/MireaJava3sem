package Tasks.Task9;

import java.util.Comparator;
import java.util.Random;

public class Student implements Comparable<Student> {
    private String firstName;
    private String middleName;
    private int group;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getGroup() {
        return group;
    }


    public Student(String firstName, String middleName, int group) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.group = group;
    }

    @Override
    public String toString() {
        String name = String.format("%s %s", this.firstName, this.middleName);
        return String.format("%-20s группа: %4d ", name, this.group);
    }


    @Override
    public int compareTo(Student o) {
        String fullNameThis = String.format("%s %s", this.firstName, this.middleName);
        String oFullName = o != null ? String.format("%s %s", o.firstName, o.middleName) : "";
        return fullNameThis.compareTo(oFullName);
    }
}

class StudentTest {
    private static final String[] NAMES = {
            "Александр", "Сергей", "Елена", "Андрей", "Владимир", "Татьяна", "Алексей", "Ольга", "Дмитрий", "Наталья",
            "Ирина", "Анна", "Николай", "Евгений", "Иван", "Светлана", "Екатерина", "Юлия", "Мария", "Михаил",
            "Юрий", "Игорь", "Виктор", "Анастасия", "Олег", "Марина", "Людмила", "Павел", "Максим", "Василий"
    };
    private static final String[] MIDDLE_NAMES = {
            "Смирнов", "Иванов", "Кузнецов", "Попов", "Соколов", "Лебедев", "Козлов", "Новиков",
            "Морозов", "Петров", "Волков", "Соловьев", "Васильев", "Зайцев", "Павлов"
    };

    private static final int MAX_GROUP = 50;

    private static final int LENGTH_ARRAY = 20;

    public static void main(String[] args) {
        Student[] students = createArraysStudents(LENGTH_ARRAY);
        printStudents(students);

        System.out.println("\nСортировка по группе...\n");
        sort(students, Comparator.comparing(Student::getGroup));
        printStudents(students);
    }

    private static Student[] createArraysStudents(int size) {
        Student[] students = new Student[size];
        Random rand = new Random();
        String first;
        String second;
        int group;
        for (int index = 0; index < size; index++) {
            first = NAMES[rand.nextInt(NAMES.length)];
            second = MIDDLE_NAMES[rand.nextInt(MIDDLE_NAMES.length)];
            group = rand.nextInt(MAX_GROUP + 1);
            students[index] = new Student(first, second, group);
        }
        return students;
    }

    private static void printStudents(Student[] students) {
        System.out.println("Студенты:");
        int number = 1;
        for (Student student : students) {
            System.out.printf("%5d: %s;\n", number++, student);
        }
    }

    public static void sort(Student[] students, Comparator<Student> c) {
        if (students != null) {
            for (int index = 0; index < students.length; index ++) {
                for (int sub = index; sub >= 1; sub--) {
                    if (c == null) {
                        if (students[sub].compareTo(students[sub - 1]) < 0) {
                            Student temp = students[sub];
                            students[sub] = students[sub - 1];
                            students[sub - 1] = temp;
                        } else {
                            break;
                        }
                    } else {
                        if (c.compare(students[sub], students[sub - 1]) < 0) {
                            Student temp = students[sub];
                            students[sub] = students[sub - 1];
                            students[sub - 1] = temp;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void sort(Student[] students) {
        sort(students, null);
    }
}