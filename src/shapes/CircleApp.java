package shapes;


import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        while (true) {
            System.out.println("Enter a radius: ");
            double radius = input.getDouble();

            Circle circle = new Circle(radius);
            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());
            // ask user if they want to keep making circles
            System.out.println("Do you want to keep making circles? yes/no ");
            boolean keepMakingCircles = input.yesNo();
            if(keepMakingCircles == false) {
                break;
            }
        }
    }
}
