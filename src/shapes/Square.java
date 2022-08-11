package shapes;

public class Square extends Rectangle{
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
}
