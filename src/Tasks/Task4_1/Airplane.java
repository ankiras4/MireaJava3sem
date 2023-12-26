package Tasks.Task4_1;

public class Airplane extends Auto {
    public double price_h = 65, price_c = 80, speed_of_airplane = 120;

    @Override
    void getTime(double distance) {
        double time_c_air = distance/speed_of_airplane + 1;
        double time_h_air = distance/speed_of_airplane;
        System.out.print("\nВремя перевозки человека на самолёте: " + time_h_air);
        System.out.print("\nВремя перевозки груза на самолёте: " + time_c_air);
    }

    @Override
    void getPrice(double distance){
        double cost_c_air = (distance/speed_of_airplane + 2)*price_c + 100;
        double cost_h_air = (distance/speed_of_airplane)*price_c + 200;
        System.out.print("\nСтоимость перевозки человека на самолёте: " + cost_h_air);
        System.out.print("\nСтоимость перевозки груза на самолёте: " + cost_c_air);
    }
}

