package Tasks.Task20;

import java.io.Serializable;
import java.util.Collection;

public class MinMax<E extends Comparable> {
    public E[] mas;

    public MinMax(E[] mas) {
        this.mas = mas;
    }
    public E min(){
        E a = mas[0];
        for(E i: mas){
            if(i.compareTo(a)<0){ //чтобы упорядочить массив
                a=i;
            }
        }
        return a;
    }

    public E max(){
        E a = mas[0];
        for(E i: mas){
            if(i.compareTo(a)>0){
                a=i;
            }
        }
        return a;
    }
}