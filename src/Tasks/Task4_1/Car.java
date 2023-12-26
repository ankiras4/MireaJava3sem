package Tasks.Task4_1;

public class Car extends Auto {
    public double price_h = 35, price_c = 50, speed_of_car = 65;

    @Override
    void getTime(double distance) {
        double time_c_car = distance/speed_of_car + 2;
        double time_h_car = distance/speed_of_car;
        System.out.print("Время перевозки человека на машине: " + time_h_car);
        System.out.print("\nВремя перевозки груза на машине: " + time_c_car);
    }

    @Override
    void getPrice(double distance){
        double cost_c_car = (distance/speed_of_car + 2)*price_c;
        double cost_h_car = (distance/speed_of_car)*price_c;
        System.out.print("\nСтоимость перевозки человека на машине: " + cost_h_car);
        System.out.print("\nСтоимость перевозки груза на машине: " + cost_c_car);
    }
}
