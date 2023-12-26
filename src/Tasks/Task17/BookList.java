package Tasks.Task17;

import java.util.ArrayList;
public class BookList extends ArrayList<Book> {
    public BookList() {
        super();
    }
    @Override
    public void add(int index, Book element) {
        super.add(index, element);
    }

    @Override
    public Book remove(int index) {
        return super.remove(index);
    }
    public void PrintEl(int index){
        this.get(index).PrintOn();
    }

    @Override
    public void clear() {
        super.clear();
    }
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}