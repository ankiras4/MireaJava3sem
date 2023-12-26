package Tasks.Task23;

public class ArrayQueueModule {
    public static void main(String arg[]){
        ArrayQueue<Integer> A = new ArrayQueue<>();
        A.enqueue(1);
        A.enqueue(8);
        A.enqueue(4);
        A.enqueue(3);
        System.out.println("Изначальный размер массива: "+A.size());
        while(!A.isEmpty()){
            System.out.println("Элемент из очереди: "+A.dequeue());
            System.out.println("Размер массива: "+A.size());
        }
    }
}