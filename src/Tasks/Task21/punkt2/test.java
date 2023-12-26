package Tasks.Task21.punkt2;

import Tasks.Task21.punkt2.Array;

public class test {
    public static void main(String [] args) {

        String[] s = {"Hello", "World", "!"};

        Integer[] intr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};

        Double[] ad = {1.2, 1.5, 6.7};
        Array<String> s1 = new Array<>();
        Array<Integer> s2 = new Array<>();
        Array<Double> s3 = new Array<>();

        s1.setArr(s);
        s1.printer();
        s2.setArr(intr);
        s2.printer();
        s3.setArr(ad);
        s3.printer();
    }
}