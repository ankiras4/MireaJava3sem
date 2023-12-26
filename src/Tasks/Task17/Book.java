package Tasks.Task17;

import java.util.ArrayList;
import java.util.Arrays;
public class Book {
    public String Title;
    public String Author;
    public Integer Year;

    public  int c;

    public Book(String[] m) {
        Title = m[0];
        Author = m[1];
        Year = Integer.parseInt(m[2]);
    }
    public String PrintOn() {
        return Title + ", " + Author + ", " + Year;
    }
}
