package shapes;
// 6. Change your existing Square class to extend Quadrilateral.
// Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.
public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
}
