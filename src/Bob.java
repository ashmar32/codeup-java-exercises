import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing) {

            System.out.print("Interrogate Bob here: ");
            String userInput = scanner.nextLine().trim();

//            System.out.println("You: " + userInput);

            if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Bob: Fine, be that way!");
            } else System.out.println("Bob: Whatever.");


            System.out.println("Ask something else? [y/n]");
            String confirmation = scanner.next();

            if (confirmation.equals("n")) {
                keepGoing = false;
            }

        }
    }
}
