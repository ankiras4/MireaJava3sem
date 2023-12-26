package Tasks.Task2.t6;

public class Circle {
    private double x, y, radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double SquareCircle(){
        return (Math.PI*Math.pow(this.radius,2));
    }
    public double LengthCircle(){
        return (2*Math.PI*this.radius);
    }
    public void compareCircles(Circle circle){
        if (this.getRadius() > circle.getRadius()) System.out.println("Окружность 1 больше");
        if (this.getRadius() < circle.getRadius()) System.out.println("Окружность 2 больше");
        if (this.getRadius() == circle.getRadius()) System.out.println("Окружности одинаковы");
    }
}
