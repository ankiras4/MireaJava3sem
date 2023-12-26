package Tasks.Task19;
import Tasks.Task17.Book;

import java.util.ArrayList;
public class MagazinList extends ArrayList<Magazin> {
    public MagazinList() {
        super();
    }
    @Override
    public void add(int index, Magazin element) {
        super.add(index, element);
    }

    @Override
    public Magazin remove(int index) {
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