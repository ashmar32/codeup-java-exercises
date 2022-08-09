package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }
    boolean yesNo() {
//        if scanner input = y or yes , then return true or else return false
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y");
    }
    int getInt(int min, int max) {
        System.out.println("Enter a number 1-10:");
        int userInput = scanner.nextInt();
        if (userInput <= max && userInput >= min) {
            System.out.println("This is your number: " + userInput);
            return userInput;
        } else {
            return getInt(min,max);
        }

    }
    int getInt() {
        return scanner.nextInt();
    }

    double getDouble(double min, double max) {
        return getDouble(min, max);
    }





    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("enter a string" );
        System.out.println(in.getString());
        System.out.println("Continue [y/n]?");
        System.out.println(in.yesNo());
//        System.out.println("enter min, max");
        System.out.println(in.getInt(1,10));
        System.out.println("enter an int");
        System.out.println("your int is: " + in.getInt());

    }

}
