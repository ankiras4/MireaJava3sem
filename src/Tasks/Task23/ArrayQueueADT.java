package Tasks.Task23;

import java.util.ArrayList;

public abstract class ArrayQueueADT<T> extends ArrayList {
    public abstract void enqueue(T a);
    public abstract T element();
    public abstract T dequeue();
    public int size(){
        return toArray().length;
    }
}
