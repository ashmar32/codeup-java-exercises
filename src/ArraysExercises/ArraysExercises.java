package ArraysExercises;
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] peopleArray = {new Person("Ashley"), new Person("Crystal"), new Person("Chuy")};

        for (int i = 0; i < peopleArray.length; i++) {
            System.out.print(peopleArray[i].getName());
            // if i is not the last iteration, then print comma and space
            if (i < (peopleArray.length - 1)) {
                System.out.print(", ");
            }
        }
//        peopleArray = addPerson(peopleArray, new Person("Them"));
        for (int i = 0; i < peopleArray.length; i++) {
            System.out.print(peopleArray[i].getName());
            // if i is not the last iteration, then print comma and space
            if (i < (peopleArray.length - 1)) {
                System.out.print(", ");
            }
        }
    }
//    private static Person[] addPerson(Person[] peopleArray, Person them) {
//        Person [] newArray;
//        return newArray;
//    }
}


