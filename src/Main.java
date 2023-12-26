import java.util.Scanner;

class Book {
    String title;
    String author;
    String edition;
    int year;

    public Book(String t, String a, String e, int y) {
        title = t;
        author = a;
        edition = e;
        year = y;
    }
}

class Library {
    Book[] b;
    int count;

    public Library(int n) {
        b = new Book[n];
        count = n;
    }

    public void Add(Book x) {
        int top = 0;
        b[top++] = x;
    }

    public void SearchTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (title.equals(b[i].title)) {
                System.out.println("Title: " + b[i].title);
                System.out.println("Author: " + b[i].author);
                System.out.println("Edition: " + b[i].edition);
                System.out.println("Year: " + b[i].year);
            } else {
                System.out.println("Book you are looking for does not exist");
            }
        }
    }

    public void SearchAuthor(String author) {
        for (int i = 0; i < count; i++) {
            if (author.equals(b[i].author)) {
                System.out.println("Title: " + b[i].title);
                System.out.println("Author: " + b[i].author);
                System.out.println("Edition: " + b[i].edition);
                System.out.println("Year: " + b[i].year);
            } else {
                System.out.println("Book you are looking for does not exist");
            }
        }
    }

    public void SearchYear(int year) {
        for (int i = 0; i < count; i++) {
            if (year == b[i].year) {
                System.out.println("Title: " + b[i].title);
                System.out.println("Author: " + b[i].author);
                System.out.println("Edition: " + b[i].edition);
                System.out.println("Year: " + b[i].year);
            } else {
                System.out.println("Book you are looking for does not exist");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, year;
        char choice;
        String title, author;
        System.out.print("Enter the number of books: ");
        n = scanner.nextInt();
        Library lib = new Library(n);
        Book b;
        System.out.println("Enter title, author, edition and year of book in this order: ");
        for (int i = 0; i < n; i++) {
            String t = scanner.next();
            String a = scanner.next();
            String e = scanner.next();
            int y = scanner.nextInt();
            b = new Book(t, a, e, y);
            lib.Add(b);
        }
        System.out.println("Searching book: \n1-By title \n2-By author \n3-By year");
        choice = scanner.next().charAt(0);
        switch (choice) {
            case '1':
                System.out.print("Enter a title of the book: ");
                title = scanner.next();
                lib.SearchTitle(title);
                break;
            case '2':
                System.out.print("Enter an author of the book: ");
                author = scanner.next();
                lib.SearchAuthor(author);
                break;
            case '3':
                System.out.print("Enter a year of the book: ");
                year = scanner.nextInt();
                lib.SearchYear(year);
                break;
        }
        scanner.close();
    }
}


