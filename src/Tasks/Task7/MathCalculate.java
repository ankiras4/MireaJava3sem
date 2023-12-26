package Tasks.Task7;
//Разработайте интерфейс MathCalculable, который содержит
//объявления математических функций: возведения в степень и модуль
//комплексного числа I. Напишите класс MathFunc,
//который реализует, реализует этот интерфейс. Протестируйте класс
public interface MathCalculate {
    void stepen(double chislo, double stepen);
    void complexModul(double a, double b);
}

class MathFunc implements MathCalculate{
    @Override
    public void stepen(double chislo, double stepen){
        System.out.print("\n" + chislo + " ^ " + stepen + " = "+ Math.pow(chislo,stepen));
    }

    @Override
    public void complexModul(double a, double b) {
        double module = Math.pow((Math.pow(a,2)+Math.pow(b,2)),1/2);
        System.out.print("Модуль комплексного числа z = " + a + "+" + b + "i будет равен " + module);
    }
}

class Main {
    public static void main(String[] args) {
        MathCalculate func = new MathFunc();
        func.complexModul(78,6);
        func.stepen(2,8);
    }
}


