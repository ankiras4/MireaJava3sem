package Tasks.Task4_1;

public abstract class Auto {

    protected double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    abstract void getTime(double a);
    abstract void getPrice(double a);

}


