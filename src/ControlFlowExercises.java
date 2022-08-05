import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
public static void main(String[] args) {

//        1. LOOP BASICS
//        Problem A While Loop:
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        Problem B: Create a Do While loop that will count by 2's starting with 0 and ending at 100.

//        int i = 0;
//        do {
//            System.out.println("i is: " + i);
//            i+=2;
//        } while (i <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.

//        int i =  100;
//        do {
//            System.out.println("i is: " + i);
//            i-= 5;
//        } while (i >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        int i = 2;
//        do {
//            System.out.println("i is: " + i);
//            i = (int) Math.pow(i, 2);
//        } while (i <= 1000000);

//        Problem C: Refactor problems below
//        Alter your loop to count backwards by 5's from 100 to -10. using for loop

//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println("i is " + i);
//        }

//        for (int i = 2; i <= 1000000; i = (int) Math.pow(i,2));
//        System.out.printf("i is " + i); <<< This is incorrect ask about it
//
//        2. FizzBuzz:
//

//    Write a program that prints the numbers from 1 to 100.
//        for (int i = 1; i <= 100; i++) {
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//            if ((i % 3 == 0) && (i % 5 == 0))
//                System.out.println("FizzBuzz");
//        For multiples of three: print “Fizz” instead of the number.
//            else if (i % 3 == 0)
//                System.out.println("Fizz");
//        For the multiples of five: print “Buzz”.
//            else if (i % 5 == 0)
//                System.out.println("Buzz");
//            else
//                System.out.println(i);
//        }
//    }
//
//         3. Display a table of powers.
//         Display a table of squares and cubes from 1 to the value entered.
//         Ask if the user wants to continue.
//         Assume that the user will enter valid data.
//         Only continue if the user agrees to.

//         Prompt the user to enter an integer.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter a number you would like to go up to: ");
//        int userNumberInput = scanner.nextInt();
//        System.out.printf("%s \n Here is your table! \n", userNumberInput);
//        int num = (userNumberInput);
//        for (int j = 1; j <= num; j++) {
//            System.out.printf("%s\t%s\t\t\t%s\n", j, Math.pow(j,2), Math.pow(j,3));

//    or like this for prettier formatting:

        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("What number would you like to go to?: ");
//        int userNumber = scanner.nextInt();
//        System.out.println("    Here is your table!");
//        System.out.println("|--------|----------|----------|");
//        System.out.println("| Number | Squared  | Cubed    |");
//        System.out.println("|--------|----------|----------|");
//
//
//        for (int i = 1; i <= userNumber; i++) {
//
//            int iSquared = i * i;
//            int iCubed = i * i * i;
//
//            System.out.printf("| %-7d|   %-7d|   %-7d|\n", i, iSquared, iCubed);
//        }
//        System.out.println("|--------|----------|----------|");

        boolean confirmation;

        do {

            System.out.print("Please enter a whole number grade: ");
            int grade = scanner.nextInt();

            if (grade >= 90) {
                System.out.print("A");
                if (grade > 95) {
                    System.out.print("+");
                } else if (grade < 95) {
                    System.out.print("-");
                }
                System.out.println();
            } else if (grade >= 80) {
                System.out.print("B");
                if (grade > 85) {
                    System.out.print("+");
                } else if (grade < 85) {
                    System.out.print("-");
                }
                System.out.println();
            } else if (grade >= 70) {
                System.out.print("C");
                if (grade > 75) {
                    System.out.print("+");
                } else if (grade < 75) {
                    System.out.print("-");
                }
                System.out.println();
            } else if (grade >= 60) {
                System.out.print("D");
                if (grade > 65) {
                    System.out.print("+");
                } else if (grade < 65) {
                    System.out.print("-");
                }
                System.out.println();
            } else System.out.println("F");

            System.out.print("Continue? [y/n]: ");
            String userInput = scanner.next();

            confirmation = userInput.equals("y");
            } while (confirmation) ;
        }
    }


