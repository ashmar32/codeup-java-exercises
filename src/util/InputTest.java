package util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("enter a string: ");
        System.out.println("Here is your string: " + in.getString());

        System.out.println("Continue [y/n]?");
        System.out.println(in.yesNo());

        System.out.println(in.getInt(1,10));
        System.out.println("Enter an int: ");
        System.out.println("Your int is: " + in.getInt());


    }

}
