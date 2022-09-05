package shapes;
/* 7. Modify your ShapesTest class, use it to:
Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter. */
public class ShapesTest {
    public static void main(String[] args) {
//     - declare a variable of the type Measurable named myShape.
        Measurable myShape = new Rectangle(4,5);

        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        myShape = new Square(6);
        Square box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
    }
}
