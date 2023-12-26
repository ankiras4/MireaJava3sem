package Tasks.Task21.punkt2;

public class Array <E> {
    private E [] arr;

    public void setArr(E [] arr){
        this.arr =  arr;
    }

    public int printer() {
        for (Object str : arr) {
            System.out.print(str + " ");
        }
        return 0;
    }
}
