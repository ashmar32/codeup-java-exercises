package shapes;
// 5. Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
// IntelliJ can automatically create the skeleton of all the methods that need to be implemented.
public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
}
