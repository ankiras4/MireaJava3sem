package Tasks.Task3;

public class Obolochka {
    public static void main(String[] args) {
        //Пункт 1
        Double a = Double.valueOf(5);
        Double b = Double.valueOf("53");
        System.out.println(a);
        System.out.println(b);
        //Пункт 2
        String text = "12.34";
        double c = Double.parseDouble(text);
        System.out.println(c);
        Double d = Double.parseDouble("6.5512486728");
        System.out.println("Double to byte: " + d.byteValue() );
        System.out.println("Double to short: " + d.shortValue() );
        System.out.println("Double to int: " + d.intValue() );
        System.out.println("Double to long: " + d.longValue() );
        System.out.println("Double to float: " + d.floatValue() );
        System.out.println("Double to double: " + d.doubleValue() );
        double total = 44;
        String total2 = String.valueOf(total);
        //Пункт 3
        System.out.printf("Вывод double %f", c);
        //Пункт 4
        double  m = 44;
        String  m2 = Double.toString(m);
        System.out.print("\n" + m2);
    }
}
