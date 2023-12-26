package Tasks.Task4_1;

public class Phone {
    private String number, model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {}


    void reciveCall(String name){
        System.out.print("\nЗвонит " + name );
    }

    void reciveCall(String name, String number) {
        System.out.print("\nЗвонит " + name + " ,номер: " + number);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
