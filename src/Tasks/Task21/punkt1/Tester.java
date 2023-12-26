package Tasks.Task21.punkt1;

import Tasks.Task21.punkt1.Conversion;

public class Tester {

    public static void main(String[] args) {

        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Conversion<Integer> listInt = new Conversion<>(numbers);
        listInt.showList();

        String[] lines = {"q", "w", "e", "r", "t", "y"};
        Conversion<String> listStr = new Conversion<>(lines);
        listStr.showList();
    }
}