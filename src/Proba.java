import java.util.ArrayList;

public class Proba<T> extends ArrayList {

    public void printValues() {
        for(Object i: this){
            System.out.println(i);
        }
    }

    public static <T> Proba<T> createAndAddValue(Object o1) {
        Proba<T> result = new Proba<>();
        result.add((T) o1);
        return result;
    }
    public void AddValue(Object o2){
        this.add((T) o2);
    }

    public static void main(String[] args) {
        Double d = 22.111;
        String s = "Test String";
        Integer a = 123;
        Proba<Integer> test = createAndAddValue(d);
        test.add(s);
        test.add(a);
        test.printValues();
    }
}