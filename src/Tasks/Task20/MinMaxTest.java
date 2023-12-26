package Tasks.Task20;

public class MinMaxTest {
    public static void main(String[] args){
        MinMax<Integer> a = new MinMax<Integer>(new Integer[]{145, 34, 67, 3});
        System.out.println("Минимальное значение: "+a.min());
        System.out.println("Максимальное значение: "+a.max());
    }
}
