package Tasks.Task3;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Valuta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;
        double sum;
        NumberFormat numberFormatR =
                NumberFormat.getCurrencyInstance(Locale.forLanguageTag("ru"));
        NumberFormat numberFormatE =
                NumberFormat.getCurrencyInstance(Locale.ITALY);
        NumberFormat numberFormatD =
                NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatY =
                NumberFormat.getCurrencyInstance(Locale.CHINA);


        System.out.print("Введите сумму, которую хотите конвертировать: ");
        sum = scanner.nextInt();
        System.out.print("""
                Выберите тип валюты, который хотите конвертировать и введите указанное число:
                 Рубль : введите '1'\s
                 Доллар : введите '2'\s
                 Евро : введите '3'\s
                 Юань : введите '4'\s
                """);

        //актуальное конвертирование на 24.09.2023 время 0:42
        choise = scanner.nextInt();
        if (choise == 1) {
            double toDollar = sum*0.010412;
            double toEuro = sum*0.00978;
            double toYuan = sum*0.076095;
            System.out.print(numberFormatR.format(sum) + " = \n" + numberFormatD.format(toDollar) + "\n" +
                    numberFormatE.format(toEuro) + "\n" +
                    numberFormatY.format(toYuan) + "\n");
        }
        else if (choise == 2) {
            double toRuble = sum*96.04;
            double toEuro = sum*0.939299;
            double toYuan = sum*7.31;
            System.out.print(numberFormatD.format(sum) + " = \n" + numberFormatR.format(toRuble) + "\n" +
                    numberFormatE.format(toEuro) + "\n" +
                    numberFormatY.format(toYuan) + "\n");
        }
        else if (choise == 3) {
            double toRuble = sum*102.25;
            double toDollar = sum*1.06;
            double toYuan = sum*7.78;
            System.out.print(numberFormatE.format(sum) + " = \n" + numberFormatR.format(toRuble) + "\n" +
                    numberFormatD.format(toDollar) + "\n" +
                    numberFormatY.format(toYuan) + "\n");
        }
        else if (choise == 4) {
            double toRuble = sum*13.14;
            double toDollar = sum*0.13683;
            double toEuro = sum*0.128524;
            System.out.print(numberFormatY.format(sum) + " = \n" + numberFormatR.format(toRuble) + "\n" +
                    numberFormatD.format(toDollar) + "\n" +
                    numberFormatE.format(toEuro) + "\n");
        }
    }
}
