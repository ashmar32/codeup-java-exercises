package grades;

import util.Input;

import java.util.HashMap;

// It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//
//Be creative! Make up GitHub usernames and grades for your student objects.

// Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
//        creating student obj
        Input input = new Input();
        Student student0 = new Student("Ashley");
        student0.addGrade(98.2);
        student0.addGrade(95.1);
        student0.addGrade(68.2);

        Student student1 = new Student("Crystal");
        student1.addGrade(78.2);
        student1.addGrade(45.1);
        student1.addGrade(98.2);

        Student student2 = new Student("Chuy");
        student2.addGrade(56.1);
        student2.addGrade(98.9);
        student2.addGrade(76.4);

        Student student3 = new Student("Chica");
        student3.addGrade(99.8);
        student3.addGrade(93.1);
        student3.addGrade(90.7);
//adding to map
        students.put("ash32", student0);
        students.put("durt1", student1);
        students.put("chuchu2", student2);
        students.put("chickie3", student3);



        while (true) {
            System.out.println("Welcome!");
            System.out.println("These are the usernames: ");

            for (String key : students.keySet()) {
                System.out.printf("|" + key + "| ");
            }
            System.out.println();
            System.out.println("What student would you like to see more information on?");
            String getMoreInfoInput = input.getString();
// if the input doesn't contain the key, then sout can't find
            if (!students.containsKey(getMoreInfoInput)) {
                System.out.println("Who dat? Can't find em... ");
// else output name, grade, username
            } else {
                if (students.containsKey(getMoreInfoInput)) {
//                    set student.get to currentStudent
                    Student currentStudent = students.get(getMoreInfoInput);
                    System.out.println("Name: " + currentStudent.getStudentName());
                    System.out.println("GitHub Username: " + getMoreInfoInput);
                    System.out.println("Current Grades: " + currentStudent.getStudentGrade());
                    System.out.println("Current Average: " + currentStudent.avgGrade());
                }
            }
            System.out.println("Do you want to search again [y/n] ?");
            String searchAgainPrompt = input.getString();

            if (searchAgainPrompt.equalsIgnoreCase("n")) {
                break;
            }
        }

    }
}
