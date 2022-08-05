import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {
//1.         Basic Arithmetic
//        Additions:
        System.out.println(addition(10, 5));
        System.out.println(subtraction(10,5));
        System.out.println(multiplication(10,5));
        System.out.println(division(10,5));
        System.out.println(modulus(10,5));
        System.out.println(newMultiplication(10,5));
        getNumber(10,20);
        factorial();
        rollDice();

    }



    public static int addition(int a, int b) {
        return a + b;
    }
//            Subtraction:

    public static int subtraction(int a, int b) {
        return a - b;
    }

//    Multiplication:
    public static int multiplication(int a, int b) {
        return a - b;
}
//    Division:
    public static int division(int a, int b) {
        return a / b;
    }
//    Modulus:
    public static int modulus(int a, int b) {
        return a % b;
    }
//    Loop multiplication:
    //a = 5
    //b = 3
    public static int newMultiplication(int a, int b) {
        int sum = 0;
//        a is the number of times we go thru the loop
        for (int i = 0; i < a ; i++) {
            sum = sum + b;
        }
        return sum;
    }
//    Create a method that validates that user input
    public static int getNumber(int min, int max) {

        Scanner scanner = new Scanner(System.in);

// Capture user input
        while (true) {
            System.out.print("Enter a number " + min + " - " +max + ": ");
            int userInput = scanner.nextInt();
            if (userInput <= max && userInput >= min) {
                System.out.println("This is your number: " + userInput);
                return userInput;
            }
            System.out.println("Invalid number");
        }
    }

    public static int getNumberWithRecursion(int min, int max) {

        Scanner scanner = new Scanner(System.in);

// Capture user input
            System.out.print("Enter a number " + min + "- " +max + ": ");
            int userInput = scanner.nextInt();
            if (userInput <= max && userInput >= min) {
                System.out.print("This is your number: " + userInput);
                return userInput;
            }
            System.out.println("Invalid number");

            return getNumberWithRecursion(min, max);

    }

// Calculate the factorial of a number.
    public static void factorial() {
        int factorialNumber = getNumber(1,10);
        int storedNumber = 1;

        System.out.printf("%s! = ", factorialNumber);
        for (int i = 1; i <= factorialNumber; i++) {
            if (factorialNumber == i) {
                storedNumber = i * storedNumber;
                System.out.printf("%s ", i);
            } else {
                storedNumber = i * storedNumber;
                System.out.printf("%s x ", i);
            }

        }
        System.out.printf(" = %s\n", storedNumber);
    }

    public static void rollDice() {
        System.out.print("Enter the number of sides of the dice set: ");

        // Initializing the Scanner object to read input
        Scanner input = new Scanner(System.in);
        int numberOfDice = input.nextInt();

        // Initializing the Random object for
        // generating random numbers
        Random ranNum = new Random();

        System.out.print("You rolled: ");
        int total = 0;
        int randomNumber = 0;

        for (int i = 0; i < numberOfDice; i++) {

            // Generating the random number and storing it
            // in the 'randomNumber' variable
            randomNumber = ranNum.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.print(randomNumber);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("Total: " + total);
    }


}