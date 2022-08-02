import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        float almostPi = (float.3f) pi;
        System.out.print("The value of pi is approximately: ");
        System.out.format("%.2f%n",pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);

// scanner.nextLine();   <<<<---will reset your scanner

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter 3 words: ");
        String userInput1 = scanner1.next();
        String userInput2 = scanner1.next();
        String userInput3 = scanner1.next();
        System.out.println("You entered: " + userInput1 + userInput2 + userInput3);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Write a sentence here: ");
        String userSentence = scanner2.nextLine();
        System.out.println("Here is your sentence: " + userSentence);

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter length of classroom: ");
        int lengthInput = scanner3.nextInt();
        System.out.print("Enter width of classroom: ");
        int widthInput = scanner3.nextInt();
        int area = lengthInput * widthInput;
        int perimeter = 2 * lengthInput + 2 * widthInput;
        System.out.printf("The area of the classroom is: %s%n", area);
        System.out.printf("The perimeter of the classroom is %s", perimeter);
// Can also use Interger.parseInt() if using a string

    }
}
