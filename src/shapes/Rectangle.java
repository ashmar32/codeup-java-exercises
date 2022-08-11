package shapes;

public class Rectangle {
    protected double length;
    protected double width;
//constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * length + 2 * width;
        return perimeter;

    }

    public static void main(String[] args) {
        Rectangle testRec = new Rectangle(12.5,6);
        System.out.println(testRec.getArea());
    }
}
