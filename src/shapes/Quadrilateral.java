package shapes;
/* 4. Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable.
protected properties for length and width.*/

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length, width;
// - a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
// - methods for getting the length and width.

    public double getLength() {
        return length;
    }

    // - abstract methods for setting the length and width.
    public void setLength(double length) {

    }

    public double getWidth() {
        return width;
    }

// - abstract methods for setting the length and width.
    public abstract void setWidth(double width);

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
