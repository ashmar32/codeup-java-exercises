package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

//    accessors
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public void setRadius() {

    }

}
